package com.snaillove.web.action;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.snaillove.Service.ClassificationService;
import com.snaillove.Service.LabelService;
import com.snaillove.Service.LabelforsceneService;
import com.snaillove.Service.MusicforsceneSevice;
import com.snaillove.Service.PhotoforsceneService;
import com.snaillove.Service.RecommenService;
import com.snaillove.Service.SceneService;
import com.snaillove.model.Classification;
import com.snaillove.model.Labelforscene;
import com.snaillove.model.Musicforscene;
import com.snaillove.model.Photoforscene;
import com.snaillove.model.Scene;
import com.snaillove.utils.Config;
import com.snaillove.utils.Page;
import com.snaillove.utils.Result;
import com.snaillove.utils.StatusJSON;

@Controller
public class SceneAction extends BaseAction {
	@Resource
	private SceneService service;
	@Resource
	private ClassificationService classService;
	@Resource
	private PhotoforsceneService photoService;
	@Resource
	private MusicforsceneSevice musicService;
	@Resource
	private LabelforsceneService labelforsceneService;
	@Resource
	private LabelService labelService;
	@Resource
	private RecommenService reService;

	// �����龰
	@RequestMapping(value = "/web/addScene.action", method = RequestMethod.POST)
	@ResponseBody
	public StatusJSON save(@ModelAttribute Scene scene, String filename) {
		// ��������ͼƬ
		String[] photo = scene.getThumbnail().split(",");
		scene.setThumbnail(photo[photo.length - 1]);
		service.addScene(scene);
		// ����ͼƬ
		Photoforscene photoforscene = new Photoforscene();
		photoforscene.setSuuid(scene.getUuid());
		String[] photos = filename.split(",");
		int a = 1;
		for (int i = photos.length; i > 0; i--) {
			a++;
			photoforscene.setImgurl(photos[i - 1]);
			photoService.saveScenephoto(photoforscene);
			if (a > 2) {
				break;
			}
		}
		StatusJSON statusJSON = new StatusJSON();
		statusJSON.setStatus(1);
		return statusJSON;
	}

	// �����龰׼��
	@RequestMapping(value = "/web/addScenePro.action", method = RequestMethod.POST)
	public String savePro(HttpServletResponse response,
			HttpServletRequest request) {
		List<Classification> classifications = (List<Classification>) classService
				.getClassificationAll();
		request.setAttribute("classifications", classifications);
		return "addScene";
	}

	// �޸��龰
	@RequestMapping(value = "/web/uppScene.action", method = RequestMethod.POST)
	@ResponseBody
	public StatusJSON upp(@ModelAttribute Scene scene, String filename) {
		// �޸��Ƿ��ܱ��Ƽ�
		if (scene.getState() == 1) {
			scene.setRecommed(0);
			// ����龰���ߣ��龰��Ӧ���Ƽ�Ҳɾ��
			if (reService.getRecommenBySuuid(scene.getUuid()).getId() != 0) {
				reService.delRecommen(reService.getRecommenBySuuid(
						scene.getUuid()).getId());
			}
		} else {
			// ����龰����,�ж��Ƿ������˸��Ƽ�,û�оͰ��龰�е��Ƽ��ֶθ�Ϊδ�Ƽ�
			if (reService.getRecommenBySuuid(scene.getUuid()).getId() == 0) {
				scene.setRecommed(1);
			}
		}
		// ��������ͼƬ
		String[] photo = scene.getThumbnail().split(",");
		scene.setThumbnail(photo[photo.length - 1]);
		service.uppScene(scene);
		if(filename.length()!=0){
			// ����ͼƬ
			Photoforscene photoforscene = new Photoforscene();
			photoforscene.setSuuid(scene.getUuid());
			String[] photos = filename.split(",");
			int a = 1;
			// �޸�ʱ����ɾ���龰ͼƬ
			photoService.delScenephoto(scene.getUuid());
			for (int i = photos.length; i > 0; i--) {
				a++;
				photoforscene.setImgurl(photos[i - 1]);
				// �ٲ���ͼƬ
				photoService.saveScenephoto(photoforscene);
				if (a > 2) {
					break;
				}
			}
		}
		StatusJSON statusJSON = new StatusJSON();
		statusJSON.setStatus(1);
		return statusJSON;
	}

	// �޸��龰׼��
	@RequestMapping(value = "/web/uppScenePro.action", method = RequestMethod.POST)
	public String uppPro(HttpServletResponse response,
			HttpServletRequest request, int id) {
		Scene scene = service.getScene(id);
		List<Classification> classifications = (List<Classification>) classService
				.getClassificationAll();
		List<Photoforscene> photos = (List<Photoforscene>) photoService
				.getScenephoto(scene.getUuid());
		request.setAttribute("classifications", classifications);
		request.setAttribute("scene", scene);
		request.setAttribute("photos", photos);
		return "addScene";
	}

	// ɾ���龰
	@RequestMapping(value = "/web/delScene.action", method = RequestMethod.POST)
	@ResponseBody
	public StatusJSON del(int id) {
		Scene scene = service.getScene(id);
		// ����龰���ߣ��龰��Ӧ���Ƽ�Ҳɾ��
		if (reService.getRecommenBySuuid(scene.getUuid()).getId() != 0) {
			reService.delRecommen(reService.getRecommenBySuuid(scene.getUuid())
					.getId());
		}
		service.delScene(id);
		StatusJSON statusJSON = new StatusJSON();
		statusJSON.setStatus(1);
		return statusJSON;
	}

	// ��ҳ�龰�б�
	@RequestMapping(value = "/web/getScene.action", method = RequestMethod.POST)
	public String getScene(HttpServletResponse response,
			HttpServletRequest request, int currentPage, String keyword) {
		try {
			Page zPage = new Page();
			zPage.setCurrentPage(currentPage);
			zPage.setEveryPage(10);
			if (keyword != null) {
				zPage.setKeyword(URLDecoder.decode(keyword, "UTF-8"));
			}
			Result result = service.getSearchAllScene(zPage);
			@SuppressWarnings("unchecked")
			List<Scene> scenes = (List<Scene>) result.getList();
			Page page = result.getPage();
			request.setAttribute("scenelist", scenes);
			request.setAttribute("page", page);
			request.setAttribute("keyword", keyword);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return "sceneList";
	}

	// ����UUID��ѯһ���龰
	@RequestMapping(value = "/web/getSceneInfo.action", method = RequestMethod.POST)
	public String getSceneInfo(HttpServletResponse response,
			HttpServletRequest request, String uuid, int flag) {
		// ͨ��UUID��ѯһ���龰
		Scene scene = service.getSceneInfo(uuid);
		// ͨ���龰UUID��ѯ�龰�µ����и����б�
		List<?> musicList = musicService.getMusicList(uuid);
		// ͨ���龰UUID��ѯ�龰�µ����б�ǩ�б�
		List<?> labelList = labelforsceneService.getLabelList(uuid);
		// ͨ���龰UUID��ѯ�龰�����ķ���
		Classification cn = classService.getClassificationByUuid(scene
				.getCuuid());
		// ͨ���龰UUID��ѯ�龰�µ�ͼƬ�б�
		List<?> photos = photoService.getScenephoto(uuid);
		request.setAttribute("photos", photos);
		request.setAttribute("classification", cn);
		request.setAttribute("scene", scene);
		request.setAttribute("musicList", musicList);
		request.setAttribute("labelList", labelList);
		request.setAttribute("flag", flag);
		return "sceneInfo";
	}

	// ������ǩ׼��
	@RequestMapping(value = "/web/saveLabelpro.action", method = RequestMethod.POST)
	public String saveLabelpro(HttpServletResponse response,
			HttpServletRequest request, String keyword, String uuid) {
		// ��ѯ���б�ǩ
		List<?> labelAlllist = labelService.getAllLabel(keyword, uuid);
		// ��ѯ���龰�±�ѡ�еı�ǩ
		List<?> labelList = labelforsceneService.getLabelList(uuid);
		request.setAttribute("labelList", labelList);
		request.setAttribute("labelAllList", labelAlllist);
		request.setAttribute("keyword", keyword);
		request.setAttribute("uuid", uuid);
		return "labelForScene";
	}

	// ������ǩ
	@RequestMapping(value = "/web/saveLabel.action", method = RequestMethod.POST)
	@ResponseBody
	public StatusJSON saveLabel(HttpServletResponse response,
			HttpServletRequest request,
			@ModelAttribute Labelforscene labelforscene) {
		labelforsceneService.saveLabelforscene(labelforscene);
		StatusJSON statusJSON = new StatusJSON();
		statusJSON.setStatus(1);
		return statusJSON;
	}

	// ������ǩ
	@RequestMapping(value = "/web/deleteLabel.action", method = RequestMethod.POST)
	@ResponseBody
	public StatusJSON deleteLabel(HttpServletResponse response,
			HttpServletRequest request, int id) {
		labelforsceneService.delLabelforscene(id);
		StatusJSON statusJSON = new StatusJSON();
		statusJSON.setStatus(1);
		return statusJSON;
	}

	// ɾ���龰����
	@RequestMapping(value = "/web/delMusic.action", method = RequestMethod.POST)
	@ResponseBody
	public StatusJSON saveSceneList(HttpServletResponse response,
			HttpServletRequest request, int id) {
		StatusJSON json = new StatusJSON();
		musicService.delMusic(id);
		json.setStatus(1);
		return json;
	}

	// ���ݸ�����������
	/**
	 * type ������Դ 1����о 2��ϲ������ name�� ��������
	 */
	@RequestMapping(value = "/web/getMusicList.action", method = RequestMethod.POST)
	public String getMusicByname(HttpServletRequest request,
			HttpServletResponse response, String uuid) {
		request.setAttribute("uuid", uuid);
		return "musiciForScene";
	}

	// ��ѯ�龰�󶨵ĸ����б�
	@RequestMapping(value = "/web/getAllMusic.action", method = RequestMethod.POST)
	@ResponseBody
	public List<Musicforscene> getMusicByUUID(HttpServletRequest request,
			HttpServletResponse response, String uuid) {
		List<Musicforscene> list = (List<Musicforscene>) musicService
				.getMusicList(uuid);
		return list;
	}

	/*************************************************************************************/

	/**
	 * ϲ�����ŵĸ�����ȡ
	 */
	@RequestMapping(value = "/web/getXimaMusic.action", method = RequestMethod.POST)
	@ResponseBody
	public List<Musicforscene> getXimaMusic(HttpServletRequest request,
			HttpServletResponse response, String name) {
		StatusJSON status = new StatusJSON();
		List<Musicforscene> lsList = new ArrayList<Musicforscene>();
		if (name != null && name.trim().length() != 0) {
			// ϲ������
			try {
				name = URLEncoder.encode(name, "UTF-8");
				String url = Config.URL_STRING_X + "/search/tracks?" + Config.URL_STRING_X_IM
						+ "&q=" + name + "&page=" + 1 + "&per_page=" + 500
						+ "&uni=xx";
				String str = Config.GetData(url);
				JSONObject jsonObject = JSONObject.parseObject(str);
				JSONArray jsonArray = jsonObject.getJSONArray("tracks");
				for (int i = 0; i < jsonArray.size(); i++) {
					JSONObject jObject1 = (JSONObject) jsonArray.get(i);
					Musicforscene music = new Musicforscene();
					music.setMusicname(jObject1.getString("title"));
					music.setMusiccher(jObject1.getString("nickname"));
					music.setMusicurl(jObject1.getString("play_url_64"));
					// ��ʶ�������Ϊϲ������
					music.setMusictype(2);
					lsList.add(music);
				}
			} catch (Exception e) {
				status.setMess("error");
				status.setStatus(0);
				e.printStackTrace();
			}
		}
		return lsList;
	}

	// �����龰����(ϲ������)
	@RequestMapping(value = "/web/saveMusic.action", method = RequestMethod.POST)
	@ResponseBody
	public StatusJSON saveMusic(HttpServletResponse response,
			HttpServletRequest request, String str) {
		StatusJSON json = new StatusJSON();
		String[] strs = str.split(",");
		Musicforscene music = new Musicforscene();
		// �������
		music.setMusiccher(strs[0]);
		music.setMusicurl(strs[1]);
		music.setMusictype(Integer.parseInt(strs[2]));
		music.setMusicname(strs[3]);
		music.setSuuid(strs[4]);
		musicService.saveMusic(music);
		json.setStatus(1);
		return json;
	}

	/************************************************************************************/
	/**
	 * ��ȡϲ�����Žӿڵķ���
	 */
	@RequestMapping(value = "/web/getXimaFL.action", method = RequestMethod.POST)
	@ResponseBody
	public List<?> getXimaFL(HttpServletRequest request,
			HttpServletResponse response, String name) {
		List<Map> list=new ArrayList<Map>();
		String url = Config.URL_STRING_X + "/categories?" + Config.URL_STRING_X_IM
				+ "&uni=xx";
		String str;
		try {
			str = Config.GetData(url);
			JSONObject jsonObject = JSONObject.parseObject(str);
			JSONArray jsonArray = jsonObject.getJSONArray("categories");
			for (int i = 0; i < jsonArray.size(); i++) {
				JSONObject jObject1 = (JSONObject) jsonArray.get(i);
				Map<String, Object> map=new HashMap<String, Object>();
				map.put("id", jObject1.getString("id"));
				map.put("name", jObject1.getString("title"));
				list.add(map);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/**
	 * ��ȡϲ������ר����ר��
	 */
	@RequestMapping(value = "/web/getXimaZJ.action", method = RequestMethod.POST)
	@ResponseBody
	public List<?> getXimaZJ(HttpServletRequest request,
			HttpServletResponse response, String id) {
		List<Map> list=new ArrayList<Map>();
		String url = Config.URL_STRING_X + "/categories/"+id+"/hot_albums?" + Config.URL_STRING_X_IM
				+ "&uni=xx";
		String str;
		try {
			str = Config.GetData(url);
			JSONObject jsonObject = JSONObject.parseObject(str);
			JSONArray jsonArray = jsonObject.getJSONArray("tags");
			for (int i = 0; i < jsonArray.size(); i++) {
				JSONObject jObject1 = (JSONObject) jsonArray.get(i);
				Map<String, Object> map=new HashMap<String, Object>();
				map.put("id", jObject1.getString("id"));
				map.put("name", jObject1.getString("title"));
				list.add(map);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	/****************************************************************************************/
	/**
	 * ��о�ĸ�����ȡ
	 */
	@RequestMapping(value = "/web/getlingxinMusic.action", method = RequestMethod.POST)
	@ResponseBody
	public Musicforscene getlingxinMusic(HttpServletRequest request,
			HttpServletResponse response, String sid) {
		Musicforscene music = new Musicforscene();
		if (sid != null && sid.trim().length() != 0) {
			List<?> list = musicService.getMusic(sid);
			if (list.size() != 0) {
				Map map = (Map) list.get(0);
				System.out.println(map);
				String path = musicService.getMusicPath(Integer.parseInt(map
						.get("id").toString()));
				if (map.get("name") != null) {
					music.setMusicname(map.get("name").toString());
				} else if (map.get("name_en") != null) {
					music.setMusicname(map.get("name_en").toString());
				}
				music.setMusiccher(map.get("artistperformer").toString());
				music.setMusicurl(Config.getMessage("musicUrl") + path);
				music.setMusictype(1);
				// System.out.println(music.getMusiccher()+"��"+music.getMusicname()+"��ַΪ"+music.getMusicurl());
			}
		}
		return music;
	}


	public SceneService getService() {
		return service;
	}

	public void setService(SceneService service) {
		this.service = service;
	}

	public ClassificationService getClassService() {
		return classService;
	}

	public void setClassService(ClassificationService classService) {
		this.classService = classService;
	}

	public PhotoforsceneService getPhotoService() {
		return photoService;
	}

	public void setPhotoService(PhotoforsceneService photoService) {
		this.photoService = photoService;
	}

	public MusicforsceneSevice getMusicService() {
		return musicService;
	}

	public void setMusicService(MusicforsceneSevice musicService) {
		this.musicService = musicService;
	}

	public LabelforsceneService getLabelforsceneService() {
		return labelforsceneService;
	}

	public void setLabelforsceneService(
			LabelforsceneService labelforsceneService) {
		this.labelforsceneService = labelforsceneService;
	}

	public LabelService getLabelService() {
		return labelService;
	}

	public void setLabelService(LabelService labelService) {
		this.labelService = labelService;
	}

	public RecommenService getReService() {
		return reService;
	}

	public void setReService(RecommenService reService) {
		this.reService = reService;
	}

}
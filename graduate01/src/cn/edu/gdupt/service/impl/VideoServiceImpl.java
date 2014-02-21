package cn.edu.gdupt.service.impl;

import java.util.List;

import cn.edu.gdupt.dao.TVideoDAO;
import cn.edu.gdupt.model.TVideo;
import cn.edu.gdupt.service.VideoService;

/**
 * 视频服务实现类
 * @author wangjj
 *2014-2-20
 */
public class VideoServiceImpl implements VideoService {
	
	private TVideoDAO tVideoDAO;
	
	public TVideoDAO gettVideoDAO() {
		return tVideoDAO;
	}
	public void settVideoDAO(TVideoDAO tVideoDAO) {
		this.tVideoDAO = tVideoDAO;
	}
	
	@Override
	public List<TVideo> findVideoByTitle(String title, boolean isAccurate) {
		// TODO Auto-generated method stub
		return tVideoDAO.findByTitle(title,isAccurate);
	}
	@Override
	public TVideo findVideoById(int id) {
		// TODO Auto-generated method stub
		return tVideoDAO.findById(id);
	}

	@Override
	public TVideo save(TVideo tVideo) {
		// TODO Auto-generated method stub
		return tVideoDAO.save(tVideo);
	}

}

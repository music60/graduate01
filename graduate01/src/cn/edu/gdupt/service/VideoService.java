package cn.edu.gdupt.service;

import java.util.List;

/**
 * 视频服务
 * wangjj
 * 2012-2-20
 */
import cn.edu.gdupt.model.TVideo;

public interface VideoService {
	
	/**
	 *  按视频标题查找视频
	 * @param title
	 * @param isAccurate 是否精确匹配 ，为null时精确匹配
	 * @return
	 */
	List<TVideo> findVideoByTitle(String title,boolean isAccurate);
	
	/**
	 *  按视频id查找视频
	 * @param id
	 * @return
	 */
	TVideo findVideoById(int id);
	
	
	/**
	 * 保存视频
	 * @param tVideo
	 * @return
	 */
	TVideo save(TVideo tVideo);
	
	
	
	
}

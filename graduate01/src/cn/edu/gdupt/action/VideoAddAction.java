package cn.edu.gdupt.action;

import cn.edu.gdupt.service.VideoService;

import com.opensymphony.xwork2.Action;

public class VideoAddAction implements Action {
	
	private VideoService videoService;
	
	
	public VideoService getVideoService() {
		return videoService;
	}

	public void setVideoService(VideoService videoService) {
		this.videoService = videoService;
	}

	@Override
	public String execute() throws Exception {
		return null;
	}

}

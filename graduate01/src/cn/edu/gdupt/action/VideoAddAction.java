package cn.edu.gdupt.action;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import cn.edu.gdupt.service.VideoService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class VideoAddAction implements Action {
	
	private VideoService videoService;
    private File video; //上传的文件
    private String videoFileName; //文件名称
    private String videoContentType; //文件类型

	
	public VideoService getVideoService() {
		return videoService;
	}

	public void setVideoService(VideoService videoService) {
		this.videoService = videoService;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("videoFileName========"+videoFileName);
//		  String realpath = ServletActionContext.getServletContext().getRealPath("/images");
//	        //D:\apache-tomcat-6.0.18\webapps\struts2_upload\images
//	        System.out.println("realpath: "+realpath);
//	        if (video != null) {
//	            File savefile = new File(new File(realpath), videoFileName);
//	            if (!savefile.getParentFile().exists())
//	                savefile.getParentFile().mkdirs();
//	            FileUtils.copyFile(video, savefile);
//	            ActionContext.getContext().put("message", "文件上传成功");
//	        }
	        return "success";
	}

	public File getVideo() {
		return video;
	}

	public void setVideo(File video) {
		this.video = video;
	}

	public String getVideoFileName() {
		return videoFileName;
	}

	public void setVideoFileName(String videoFileName) {
		this.videoFileName = videoFileName;
	}

	public String getVideoContentType() {
		return videoContentType;
	}

	public void setVideoContentType(String videoContentType) {
		this.videoContentType = videoContentType;
	}

}

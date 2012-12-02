package com.usstprojectmarket.action;

import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;

public class FileDownloadAction implements Action{
	private String file;
	
	
	public String getFile() {
		return file;
	}


	public void setFile(String file) {
		this.file = file;
	}


	
	public String getFileName() throws Exception{
		String name = file.substring(file.lastIndexOf("\\")+1);
		return new String(name.getBytes(),"iso8859-1");
	}

	public InputStream getInputStream() throws Exception{
		file = new String(file.getBytes("iso8859-1"),"gbk");
		String path = ServletActionContext.getServletContext().getRealPath("/upload\\")+"\\"+file;
		return new FileInputStream(path);

	}


	public String execute() throws Exception {
		return SUCCESS;
	}
}

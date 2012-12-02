package com.usstprojectmarket.action;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.usstprojectmarket.service.ProjectService;
import com.usstprojectmarket.vo.Project;

public class FileUploadAction {
	
	private ProjectService projectService;
	private int userRole;
	private int classic;
	private File myFile;
	private String myFileFileName;
	private String description;
	private int projectId;
	public String getMyFileFileName() {
		return myFileFileName;
	}


	public void setMyFileFileName(String myFileFileName) {
		this.myFileFileName = myFileFileName;
	}

	private String myFileContentType;

	
	public String getMyFileContentType() {
		return myFileContentType;
	}


	public void setMyFileContentType(String myFileContentType) {
		this.myFileContentType = myFileContentType;
	}

	private static final int BUFFER_SIZE = 16 * 1024 ;
	
	


	public int getProjectId() {
		return projectId;
	}


	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}


	public int getUserRole() {
		return userRole;
	}


	public void setUserRole(int userRole) {
		this.userRole = userRole;
	}


	public int getClassic() {
		return classic;
	}


	public void setClassic(int classic) {
		this.classic = classic;
	}


	public File getMyFile() {
		return myFile;
	}


	public void setMyFile(File myFile) {
		this.myFile = myFile;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public ProjectService getProjectService() {
		return projectService;
	}


	public void setProjectService(ProjectService projectService) {
		this.projectService = projectService;
	}


	 private static void copy(File src, File dst) {
         try {
            InputStream in = null ;
            OutputStream out = null ;
             try {                
                in = new BufferedInputStream( new FileInputStream(src), BUFFER_SIZE);
                out = new BufferedOutputStream( new FileOutputStream(dst), BUFFER_SIZE);
                 byte [] buffer = new byte [BUFFER_SIZE];
                 for(int length=0;(length=in.read(buffer))>0;){
                	 out.write(buffer, 0, length);
                 }
            } finally {
                 if ( null != in) {
                    in.close();
                } 
                 if ( null != out) {
                    out.close();
                } 
            } 
        } catch (Exception e) {
            e.printStackTrace();
        } 
    } 
	 
	public String upload(){
		HttpServletRequest request = ServletActionContext.getRequest();
		projectId = (Integer)request.getAttribute("projectId");
		String path = ServletActionContext.getServletContext().getRealPath("/upload") +"\\"+projectId;
		File dest = new File(path);
		if(!dest.isDirectory()){
			dest.mkdir();
		}
		path = path+"\\"+myFileFileName;
		dest = new File(path);
		copy(myFile,dest);
		
		Project project = projectService.getProjectById(projectId);
		if(userRole==1){
			if(classic==1){
				if(project.getCompanynote()!=null)
					project.setCompanynote(project.getCompanynote()+path+",");
				else
					project.setCompanynote(path+",");
			}else if(classic==2){
				if(project.getCompanysummary()!=null)
					project.setCompanysummary(project.getCompanysummary()+path+",");
				else 
					project.setCompanysummary(path+",");
			}else if(classic==3){
				if(project.getCompanybeian()!=null)
					project.setCompanybeian(project.getCompanybeian()+path+",");
				else 
					project.setCompanybeian(path+",");
			}
		}else if(userRole==2){
			if(classic==1){
				if(project.getUndertakeplan()!=null)
					project.setUndertakeplan(project.getUndertakeplan()+path+",");
				else
					project.setUndertakeplan(path+",");
			}else if(classic==2){
				if(project.getUndertakenote()!=null)
					project.setUndertakenote(project.getUndertakenote()+path+",");
				else 
					project.setUndertakenote(path+",");
			}else if(classic==3){
				if(project.getUndertakebeian()!=null)
					project.setUndertakebeian(project.getUndertakebeian()+path+",");
				else
					project.setUndertakebeian(project.getUndertakebeian()+path+",");
			}
		}
		request.setAttribute("projectId",projectId);
		projectService.updateProject(project);
		return "show";
	}
}

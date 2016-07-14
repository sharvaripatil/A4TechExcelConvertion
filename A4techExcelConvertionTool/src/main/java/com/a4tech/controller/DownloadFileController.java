package com.a4tech.controller;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.a4tech.util.ApplicationConstants;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/sendEmails")
public class DownloadFileController {
	
	private static Logger _LOGGER = Logger.getLogger(DownloadFileController.class);
	@Autowired
	 private JavaMailSender mailSenderObj;
	    String username;
	    String password;
	    String domain;
	    String portNo;
	
	@RequestMapping(method = RequestMethod.GET)
	public String doSendEmail(HttpServletRequest request,
			HttpServletResponse response,Model model) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		      String supplierId=(String) request.getSession().getAttribute("asiNumber");
		    
			  String fileName= supplierId+".txt";
			 
			  String emailMsg="No Error File Found for Supplier "+supplierId +" ,Email not sent!!!";
			  try {
			  response.setContentType("text/html");
			  response.setContentType("APPLICATION/OCTET-STREAM");
			
		     FileSystemResource  file = new FileSystemResource(ApplicationConstants.CONST_STRING_DOWNLOAD_FILE_PATH+ fileName);
		      if(file.exists()){
		    	  
			     response.setHeader("Content-Disposition", "attachment; filename=\""
			     + fileName + "\"");
		      MimeMessage mimeMessage = mailSenderObj.createMimeMessage();
		      MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
		         helper.setFrom("a4tech.batchupdate@gmail.com");
		      helper.setTo(ApplicationConstants.SUPPLIER_EMAIL_ID_MAP.get(supplierId));
		      helper.setSubject("Product Error Batch File");
		      helper.setText("Kindly find the attached " +supplierId +" Product Error File"
		             + "\n\n\n\n Note: This is a System Generated Message Kindly Do not reply back");
		       helper.addAttachment(file.getFilename(), file);
		       mailSenderObj.send(mimeMessage);
		       emailMsg="Email Sent Successfully!!!";
	      }else{
	    	  response.setHeader("Content-Disposition", "attachment; filename=\""
					     + "defualtFile.txt" + "\"");
	      		}
		      } catch (javax.mail.MessagingException e) {
			      // TODO Auto-generated catch block
			    _LOGGER.error(e.toString());
			     }catch (Exception e) {
					// TODO: handle exception
			    	 _LOGGER.error(e.toString());
				}
		      
		      model.addAttribute("successmsg", emailMsg);
		      return "success";    
	}
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getPortNo() {
		return portNo;
	}

	public void setPortNo(String portNo) {
		this.portNo = portNo;
	}


	public JavaMailSender getMailSenderObj() {
		return mailSenderObj;
	}


	public void setMailSenderObj(JavaMailSender mailSenderObj) {
		this.mailSenderObj = mailSenderObj;
	}
	
}
package com.acti.questionme.Helper;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.acti.questionme.Jdo.ContactJDO;
import com.acti.questionme.Model.QuestionModel;
import com.acti.questionme.controller.QuesionController;

public class QuestionHelper {
	private static Logger logger = Logger.getLogger(QuestionHelper.class.getPackage().getName());
	public String registerNewUser(HttpServletRequest request,HttpServletResponse response) {
		String responseString = null ;
		UUID key = UUID.randomUUID();
		
	    ContactJDO contact = new ContactJDO();
	    QuestionModel questionModel = new QuestionModel();
		
	    
		try{
			contact.setContactId(key.toString());
			contact.setEmail(request.getParameter("email"));
			contact.setFirstName(request.getParameter("firstName"));
			contact.setLastName(request.getParameter("lastName"));
			
			questionModel.registerNewUser(contact);
		}
		catch(Exception e){
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			logger.info("let we check exception type " + sw.toString());
			
		}
		
		return null;
	}

}

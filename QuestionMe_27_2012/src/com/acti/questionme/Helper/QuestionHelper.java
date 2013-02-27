package com.acti.questionme.Helper;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.acti.questionme.Jdo.ContactJDO;
import com.acti.questionme.Model.QuestionModel;
import com.acti.questionme.controller.QuesionController;

public class QuestionHelper {
	private static Logger logger = Logger.getLogger(QuestionHelper.class.getPackage().getName());
	public  HashMap<String, Object> registerNewUser(HttpServletRequest request,HttpServletResponse response) {
		UUID key = UUID.randomUUID();
		ContactJDO tempContact = null;
		HashMap<String ,Object> paramMap = new HashMap<String,Object>();
	    ContactJDO contact = new ContactJDO();
	    QuestionModel questionModel = new QuestionModel();
		
	    
		try{
			contact.setContactId(key.toString());
			contact.setEmail(request.getParameter("email"));
			contact.setFirstName(request.getParameter("firstName"));
			contact.setLastName(request.getParameter("lastName"));
			
			tempContact = questionModel.registerNewUser(contact);
			paramMap.put("success", "true");
			paramMap.put("contactId",tempContact.getContactId() );
			paramMap.put("firstname",tempContact.getFirstName());
			paramMap.put("email", tempContact.getEmail());
			paramMap.put("lastname", tempContact.getLastName());
			
		}
		catch(Exception e){
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			logger.info("let we check exception type " + sw.toString());
			
		}
		
		return paramMap;
	}

}

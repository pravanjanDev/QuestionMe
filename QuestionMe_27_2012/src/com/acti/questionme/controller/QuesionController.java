package com.acti.questionme.controller;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.acti.questionme.Helper.QuestionHelper;
import com.acti.questionme.Jdo.ContactJDO;

@Controller
@RequestMapping("/QuestionController")
public class QuesionController {
	private static Logger logger = Logger.getLogger(QuesionController.class.getPackage().getName());
	
	@RequestMapping("/RegisterNewUser")
	public HashMap<String, Object> registerNewUser(HttpServletRequest request , HttpServletResponse response){
		logger.info("call to controller");
		QuestionHelper questionHelper = new QuestionHelper();
		HashMap<String, Object> paramMap = new HashMap<String,Object>();
		try{
			paramMap = questionHelper.registerNewUser(request,response);
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

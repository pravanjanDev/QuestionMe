package com.acti.questionme.Model;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.jdo.PersistenceManager;

import org.apache.log4j.Logger;

import com.acti.questionme.Jdo.ContactJDO;
import com.acti.questionme.Util.PersistenceManagerUtil;

public class QuestionModel {
	private static Logger logger = Logger.getLogger(QuestionModel.class.getPackage().getName());

	public void registerNewUser(ContactJDO contact) {
		logger.info("comming inside to create new user");
		 PersistenceManager	pm = PersistenceManagerUtil.getPersistanceManager();

        try{
        	pm.makePersistent(contact);
        	
        }
		catch(Exception e){
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			logger.info("let we check exception type " + sw.toString());
			
		}
		
		
	}

}

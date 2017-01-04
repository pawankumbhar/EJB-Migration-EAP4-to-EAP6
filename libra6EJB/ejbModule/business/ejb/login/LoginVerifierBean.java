package business.ejb.login;

import javax.ejb.CreateException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

import business.database.login.*;

 
public class LoginVerifierBean implements login
{

   public boolean verifyLogin(String user, String password)
   { 
	
		try {

		LoginVerifier  r = new LoginVerifier();
		if (r.verify(user,password))
		 return true; // Login ok		 
	
		    }	
		catch(Exception e)
		{
	      System.out.println("user login failed: Due to: " + e.toString()) ;
		}
		
	return false; 
   }


  
	
}  

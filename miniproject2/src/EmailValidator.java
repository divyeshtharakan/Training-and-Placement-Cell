
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class EmailValidator
	{
		public static boolean email_validation(String email)
		{
			boolean status=false;
		
	   

	   String EMAIL_REGEX = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,5})$";

	   
	        Pattern pattern = Pattern.compile(EMAIL_REGEX);
	        Matcher matcher = pattern.matcher(email);

	        if(matcher.matches())
	        {
	        		status=true;
	        }
	        else
	        {
	        	status=false;
	        }
	        return status;
		}
	}
	        
	        /**
	     * 
	     * Validate hex with regular expression
	     *
	     * @param email email for validation
	     * @return true valid email, false invalid email
	     */
	   
	        
	        
	
	
	


	/**
	 *
	 * How to validate email address with regular expression
	 *
	 */

	
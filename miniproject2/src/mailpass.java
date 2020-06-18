import java.util.Random;

import com.email.durgesh.Email;


public class mailpass {
static int r2;
static String s;
public static void main(String args[])
{
	Random r=new Random();
	 r2=r.nextInt(100000);


	try 
	{
		Email email=new Email("divyesh.tharakan@gmail.com","******************************");
		email.setFrom("divyesh.tharakan@gmail.com","Divyesh Tharakan");
		email.setSubject("Reset your password");
		email.setContent("Hi,<br><br>This email is for resetting your password.<br>Before changing your "
				+ "password, verify the code given below to make sure it's you.<br><br>"
				+ "Verify Code : "+"<b>"+r2+"</b>"+"<br><br>Have a good day.<br><br><br><br><br><br>"
						+ "*This is an automated email. Please don't reply.*", "text/html");
		email.addRecipient(enteremail.t1.getText());
	//	email.addRecipient(option.table.getColumnName("Email_ID"));;
		email.send();
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}

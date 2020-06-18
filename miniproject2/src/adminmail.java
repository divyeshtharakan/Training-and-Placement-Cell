import java.util.Random;

import com.email.durgesh.Email;


public class adminmail {
static int r1;
static String s;
public static void main(String args[])
{
	Random r=new Random();
	 r1=r.nextInt(100000);


	try 
	{
		Email email=new Email("divyesh.tharakan@gmail.com","**********");
		email.setFrom("divyesh.tharakan@gmail.com","Divyesh Tharakan");
		email.setSubject("Verify One-Time Code to register at Training and Placement");
		email.setContent("Hi admin,<br<br>Verify the code below to complete your registration and make sure "+adminregister.t3.getText()+" is your correct email id"
				+ "as it will be used for further communication.<br><br>Code : "+"<b>"+r1+"</b>"+"<br><br><br>Regards,<br>Divyesh.", "text/html");
		email.addRecipient(adminregister.t3.getText());
	//	email.addRecipient(option.table.getColumnName("Email_ID"));;
		email.send();
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}

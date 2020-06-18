import java.util.Random;

import com.email.durgesh.Email;


public class mail1 {
static int r1;
static String s;
public static void main(String args[])
{
	Random r=new Random();
	 r1=r.nextInt(100000);


	try 
	{
		Email email=new Email("divyesh.tharakan@gmail.com","****************************");
		email.setFrom("divyesh.tharakan@gmail.com","Divyesh Tharakan");
		email.setSubject("Welcome To Training and Placement Portal"+" "+studentregister.txtName.getText());
		email.setContent("Greetings from MIT ADT University,<br><br>"
				+ "Thank you for registering with us. You're one step away from completing your registration.<br><br>"
				+ "Verify Code below:<br><br>Code"+":"+"<b>"+r1+"</b>"+"<br><br>Have a good day.. <br><br>Regards, <br> Divyesh Tharakan", "text/html");
		email.addRecipient(studentregister.t3.getText());
	//	email.addRecipient(option.table.getColumnName("Email_ID"));;
		email.send();
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}

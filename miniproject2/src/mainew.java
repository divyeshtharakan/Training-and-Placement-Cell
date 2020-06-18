import java.io.File;
import java.util.Calendar;

import java.util.Date;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JTextField;

import com.email.durgesh.Email;
import com.email.*;
//((JTextField)date.getDateEditor().getUiComponent()).getText());
public class mainew {





public static void main(String args[])
{
	String query="select email from register";
	DateFormat df=new SimpleDateFormat("dd/MM/yy HH:mm:ss");
	Date dateobj=new Date();
	
	SimpleDateFormat f=new SimpleDateFormat("dd-MM-yyyy");
	
	
	try 
	{
	//	Date newDate=f.parse(admindash.ldate.toString());
		//String date=admindash.ldate.toString();
		
		PreparedStatement ps;
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
        ps = conn.prepareStatement(query);
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
		Email email=new Email("divyesh.tharakan@gmail.com","divyesh0412");
		email.setFrom("divyesh.tharakan@gmail.com","Divyesh Tharakan");
		email.setSubject(admindash.v+" "+"Opportunity from"+" "+admindash.name.getText());

		//email.setContent("<h4><b>Greetings from MIT ADT University,</h4></b><br> Hope you are doing well. An "+admindash.v+"is awaiting "
				//+ "and the details are given below:<br><br>Name of the Company: "+admindash.name.getText()+"<br>Location: "+admindash.loc.getText()+""
					//	+ "<br>Job Title: "+admindash.title.getText()+"<br><b>Last Date to Apply: </b>"+"<br><br>Opportunities don't happen; you create them."
            			//+ "So gear up and register immediately!<br><br>Hope to see maximum students being involved in this.<br>Toh pehle padke aao fir come back to this mail<br><br>Regards,<br>Divyesh Tharakan.", "text/html");
		BodyPart msg=new MimeBodyPart();
		
		msg.setText("Greetings from MIT ADT University,\n\n Hope yu are doing well. An "+admindash.v+" "+"is awaiting and the details are given below:\n\n"
				+ "Name of the Company:   "+admindash.name.getText()+"\n\nLocation:   "+admindash.loc.getText()+"\n\nJob Title: "+admindash.title.getText()//+"\nLast Date to Apply: "+f.parse(date)
				+"\n\nOpportunities don't happen; you create them. So gear up and register immediately!\n\nHope to see maximum students being involved in this.Good luck!\n\n\n\n\nSent on: "+df.format(dateobj));
		
	
		MimeBodyPart part=new MimeBodyPart();
		File file=new File(admindash.filepath);
		DataSource s=new FileDataSource(file);
		part.setDataHandler(new DataHandler(s));
		part.setFileName(file.getName());
		
		Multipart m=new MimeMultipart();
		m.addBodyPart(msg);
		m.addBodyPart(part);
		
		email.setContent(m, null);
		//File file=new File(admindash.filepath);
		//MimeBodyPart part=new MimeBodyPart();
		//part.setFileName(file.getName());
		//DataSource s=new FileDataSource(file);
		
	//	part.setDataHandler(new DataHandler(s));
		//MimeMultipart p=new MimeMultipart();
		//p.addBodyPart(part);
		
		
		//email.setContent(p, null);
		email.addRecipient(rs.getString("email")); 
		
		
		email.send();
        }
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}

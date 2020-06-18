
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.mail.Authenticator;
import javax.mail.Session;
import javax.mail.Transport;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;


public class mailsend {
public static void sendmail(String recepient) throws MessagingException
{
	System.out.println("Preparing to send");
	Properties properties = new Properties();
	
	properties.put("mail.smtp.auth", "true");
	properties.put("mail.smtp.starttls.enable", "true");
	properties.put("mail.smtp.host", "smtp.gmail.com");
	properties.put("mail.smtp.port", "587");
	
	String myAccountEmail="divyesh.tharakan@gmail.com";
	String password="****************************************";
	
	Session session=Session.getInstance(properties, new Authenticator(){
		@Override
		protected javax.mail.PasswordAuthentication getPasswordAuthentication()
		{
			return new javax.mail.PasswordAuthentication(myAccountEmail, password);
		}
	});
	Message message=prepareMessage(session, myAccountEmail, recepient);
	Transport.send(message);
	System.out.println("Message sent ");
}


private static Message	prepareMessage(Session session, String myAccountEmail, String recepient) {
	try
	{
	Message message=new MimeMessage(session);
	message.setFrom(new InternetAddress(myAccountEmail));

	message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
	message.setSubject("Hi... Testing");
	message.setText("Good evening...");
	Multipart emailContent =new MimeMultipart();
	
	MimeBodyPart textBody=new MimeBodyPart();
	textBody.setText("My multi text");
	
	MimeBodyPart pdfattachment = new MimeBodyPart();
	pdfattachment.attachFile("D:\\cv.pdf");
	emailContent.addBodyPart(textBody);
	emailContent.addBodyPart(pdfattachment);
	message.setContent(emailContent);
	return message;
}
	catch(Exception ex)
	{
		Logger.getLogger(mailsend.class.getName()).log(Level.SEVERE, null, ex);
	}
	return null;
}
}

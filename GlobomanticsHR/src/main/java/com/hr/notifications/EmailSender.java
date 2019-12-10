package com.hr.notifications;

import java.util.Properties;

import org.springframework.boot.web.servlet.server.Session;

import com.hr.personnel.Employee;

public class EmailSender {
	public static void notify(Employee employee) {
		Properties prop =new Properties();
		prop.put("mail.smtp.auth", true);
		prop.put("mail.smtp.starttls.enable", "true");
		prop.put("mail.smtp.host", "smtp.mailtrap.io");
		prop.put("mail.smtp.port", "2525");
		prop.put("mail.smtp.ssl.trust", "smtp.mailtrap.io");
		
		Session session =Session.getInstance(prop, getPasswordAuthentication() -> {  
			return new PasswordAuthentication("5d205e8b9503f6","969159ed0125ea");
		});
		
		try {
			Message message =new MimeMessage(session);
			message.setForm(new InternetAddress("payment@globalmatics.com"));
			message.setRecipients(Message.ReCipientType.TO,
					InternatAddress.parse(employee.getEmail()));
			
			message.setSubject("Salary Notification");
			
			String msg ="Salary Sent; value: $"+employee.getMonthlyIncome();
			MimeBodyPart mimeBodyPart =new MimeBodyPart();
			mimeBodyPart.setContent(msg,"tetx/html");
			Multipart multipart =new MimeMultipart();
			multipart.addBodyPart(mimeBodyPart);
			message.setContent(multipart);
			
			Transport.send(message);
			System.out.println("Notified "+employee.getEmail());
			Thread.sleep(3000);
		}catch (MessagingException e) {
			throw new RuntimeException(e);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

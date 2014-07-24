package midianet.admclan.util;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import midianet.admclan.excecao.InfraExcecao;

public class Email {
	
	
	public static void main(String[] args) {
		try {
			enviar();
		} catch (InfraExcecao e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void enviar() throws InfraExcecao {
		final String username = "midianet@gmail.com";
		final String password = "P@$wjan2014rd";
		
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		//props.put("proxySet", true);
		//props.put("http.proxyHost","10.6.60.56");
		//props.put("http.proxyPort","2303");
		
		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});
		
		try {
 
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("midianet@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("midianet@gmail.com"));
			message.setSubject("BrUnidos - Envio de senha");
			message.setText("Caro colega seja bem vindo ao clãn BrUnidos  \n\n sua senha e [" + "midianet" +  "2407140044]");
			
			Transport.send(message);
			
			System.out.println("Email Enviado.");
			
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}		
		
	}
	
}
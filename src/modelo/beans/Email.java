
package modelo.beans;


import java.util.Arrays;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Email {

	Properties emailProperties;
	Session mailSession;
	MimeMessage emailMessage;

	String emailHost = "smtp.gmail.com";
	String emailPort = "587";// gmail's smtp port
	String fromUser = "recappjs@gmail.com";// your gmail id
	String fromUserEmailPassword = "RecApp2020";
	String[] toEmails = { "recappjs@gmail.com" };

	public void setMailServerProperties() {
		emailProperties = System.getProperties();
		emailProperties.put("mail.smtp.port", emailPort);
		emailProperties.put("mail.smtp.auth", "true");
		emailProperties.put("mail.smtp.starttls.enable", "true");
	}

	public void createEmailMessage(String emailSubject, String emailBody)
			throws AddressException, MessagingException {
		mailSession = Session.getDefaultInstance(emailProperties, null);
		emailMessage = new MimeMessage(mailSession);
		for (int i = 0; i < toEmails.length; i++) {
			emailMessage.addRecipient(Message.RecipientType.TO,
					new InternetAddress(toEmails[i]));
		}
		emailMessage.setSubject(emailSubject);
		emailMessage.setContent(emailBody, "text/html");// for a html email
		// emailMessage.setText(emailBody);// for a text email

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emailHost == null) ? 0 : emailHost.hashCode());
		result = prime * result + ((emailMessage == null) ? 0 : emailMessage.hashCode());
		result = prime * result + ((emailPort == null) ? 0 : emailPort.hashCode());
		result = prime * result + ((emailProperties == null) ? 0 : emailProperties.hashCode());
		result = prime * result + ((fromUser == null) ? 0 : fromUser.hashCode());
		result = prime * result + ((fromUserEmailPassword == null) ? 0 : fromUserEmailPassword.hashCode());
		result = prime * result + ((mailSession == null) ? 0 : mailSession.hashCode());
		result = prime * result + Arrays.hashCode(toEmails);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Email other = (Email) obj;
		if (emailHost == null) {
			if (other.emailHost != null)
				return false;
		} else if (!emailHost.equals(other.emailHost))
			return false;
		if (emailMessage == null) {
			if (other.emailMessage != null)
				return false;
		} else if (!emailMessage.equals(other.emailMessage))
			return false;
		if (emailPort == null) {
			if (other.emailPort != null)
				return false;
		} else if (!emailPort.equals(other.emailPort))
			return false;
		if (emailProperties == null) {
			if (other.emailProperties != null)
				return false;
		} else if (!emailProperties.equals(other.emailProperties))
			return false;
		if (fromUser == null) {
			if (other.fromUser != null)
				return false;
		} else if (!fromUser.equals(other.fromUser))
			return false;
		if (fromUserEmailPassword == null) {
			if (other.fromUserEmailPassword != null)
				return false;
		} else if (!fromUserEmailPassword.equals(other.fromUserEmailPassword))
			return false;
		if (mailSession == null) {
			if (other.mailSession != null)
				return false;
		} else if (!mailSession.equals(other.mailSession))
			return false;
		if (!Arrays.equals(toEmails, other.toEmails))
			return false;
		return true;
	}

	public void sendEmail() throws AddressException, MessagingException {
		Transport transport = mailSession.getTransport("smtp");
		transport.connect(emailHost, fromUser, fromUserEmailPassword);
		transport.sendMessage(emailMessage, emailMessage.getAllRecipients());
		transport.close();

}

	@Override
	public String toString() {
		return "Email [emailProperties=" + emailProperties + ", mailSession=" + mailSession + ", emailMessage="
				+ emailMessage + ", emailHost=" + emailHost + ", emailPort=" + emailPort + ", fromUser=" + fromUser
				+ ", fromUserEmailPassword=" + fromUserEmailPassword + ", toEmails=" + Arrays.toString(toEmails) + "]";
	}

	public Email(Properties emailProperties, Session mailSession, MimeMessage emailMessage, String emailHost,
			String emailPort, String fromUser, String fromUserEmailPassword, String[] toEmails) {
		super();
		this.emailProperties = emailProperties;
		this.mailSession = mailSession;
		this.emailMessage = emailMessage;
		this.emailHost = emailHost;
		this.emailPort = emailPort;
		this.fromUser = fromUser;
		this.fromUserEmailPassword = fromUserEmailPassword;
		this.toEmails = toEmails;
	}

public Email() {
	//Empty constructors are rad
}

	
}



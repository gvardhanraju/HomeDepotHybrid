package utils;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import jakarta.activation.DataHandler;
import jakarta.activation.DataSource;
import jakarta.activation.FileDataSource;
import jakarta.mail.BodyPart;
import jakarta.mail.Message;
import jakarta.mail.Multipart;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;
import jakarta.mail.Session;

public class TriggerReport {
    final static String toEmail="jayavardhan353@gmail.com";
    final static String fromEmail="u124982@gmail.com";
    final static String password="xijjhswpmbzxrqwl";
    final static String subject="Automation Testing Reports";
    final static String body="Sending an attachment";
    final static String projectPath=System.getProperty("user.dir");

    public static void sendEmailWithAttachment(String timestamp) throws IOException{
        String relativePath="reports/HOMEDEPOT_Report_" + timestamp +".html";
        String fullPath=projectPath+File.separator+relativePath;
        File file=new File(fullPath);
        if(!file.exists()){
            System.out.println("Not Found: " + file.getAbsolutePath());
        }

        if(!file.exists()||!file.canRead()){
            throw new IOException("Attachment file not found or cannot be read: "+file.getAbsolutePath());
        }

        String host="smtp.gmail.com";
        Properties props=new Properties();
        props.put("mail.smtp.auth","true");
        props.put("mail.smtp.starttls.enable","true");
        props.put("mail.smtp.host",host);
        props.put("mail.smtp.port","587");
        Session session=Session.getInstance(props,new jakarta.mail.Authenticator(){
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(fromEmail,password);
            }
        });
        try{
            Message message=new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(toEmail));
            message.setSubject(subject);
            BodyPart messageBodyPart=new MimeBodyPart();
            messageBodyPart.setText(body);
            Multipart multipart=new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            MimeBodyPart attachmentPart=new MimeBodyPart();
            DataSource source=new FileDataSource(file);
            attachmentPart.setDataHandler(new DataHandler(source));
            attachmentPart.setFileName(file.getName());
            multipart.addBodyPart(attachmentPart);
            message.setContent(multipart);
            Transport.send(message);
            System.out.println("Email sent successfully!");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
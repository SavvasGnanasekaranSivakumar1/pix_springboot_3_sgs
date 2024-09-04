package com.pearson.pix.advanced;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.FileInputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

public class SendingSavvasMail {
    public static void getMail() {
        System.out.println("Start");
        Properties properties = new Properties();
        String str1 = "";
        String str2 = "";
        str1 = "test";//mailDesigner.getDataDocument().toString();
        try {
            properties.load(new FileInputStream("Properties/MailDetail.properties"));
            //properties.load(new FileInputStream("c:/sekar/projects/jsp-demo/src/main/resources/maildetail.properties"));
            String str3 = properties.getProperty("TO");
            String str4 = properties.getProperty("FROM");
            String str5 = properties.getProperty("SUBJECT");
            String str6 = properties.getProperty("ATTACHMENT");
            int i = Calendar.getInstance().get(1);
            int j = Calendar.getInstance().get(5);
            String str7 = "date times" ;//properties.getProperty("PATH") + str6 + getDateTime() + ".xls";
            sendHTMLMail(str3, str4, str5, str1, str7);
            System.out.println("Done");
        } catch (Exception exception) {
            System.out.println("************************Back to  Mail Generator*******************************"+exception);
        }
    }

    public static boolean sendHTMLMail(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5) throws MessagingException, Exception {
        Properties properties1 = System.getProperties();
        System.out.println("IN SEND HTML MAIL");
        Properties properties2 = new Properties();
        properties2.load(new FileInputStream("Properties/Smtp.properties"));
        //properties2.load(new FileInputStream("c:/sekar/projects/jsp-demo/src/main/resources/smtp.properties"));
        String str1 = properties2.getProperty("SMTPHOST");
        String str2 = properties2.getProperty("SMTPPORT");
        System.out.println("SMTPHOST:" + str1);
        System.out.println("port:" + str2);
        properties1.put("mail.smtp.host", str1);
        properties1.put("mail.smtp.port", str2);
        properties1.put("mail.smtp.connectiontimeout ", 12000);
        properties1.put("mail.smtp.timeout ", 12000);
        System.out.println("smtp host is " + properties1.getProperty("mail.smtp.host"));
        Session session = Session.getDefaultInstance(properties1);
        MimeMessage mimeMessage = new MimeMessage(session);
        try {
            mimeMessage.setFrom((Address)new InternetAddress(paramString2));
            System.out.println("to addrees :"+paramString1+" --- From Address  : "+paramString2);
            mimeMessage.setRecipients(Message.RecipientType.TO, (Address[])InternetAddress.parse(paramString1, false));
            mimeMessage.setSubject(paramString3);
            mimeMessage.setSentDate(new Date());
            MimeMultipart mimeMultipart = new MimeMultipart("related");
            MimeBodyPart mimeBodyPart1 = new MimeBodyPart();
            mimeBodyPart1.setContent(paramString4, "text/html");
            mimeBodyPart1.addHeaderLine("Content-Type: text/html; charset=\"iso-8859-1\"");
            mimeBodyPart1.addHeaderLine("Content-Transfer-Encoding: quoted-printable");
            mimeMultipart.addBodyPart((BodyPart)mimeBodyPart1);
            System.out.println("1");
            /*MimeBodyPart mimeBodyPart2 = new MimeBodyPart();
            FileDataSource fileDataSource = new FileDataSource(paramString5);
            String str = paramString5.substring(paramString5.lastIndexOf("/") + 1, paramString5.length());
            System.out.println("FileName " + str);
            mimeBodyPart2.setDataHandler(new DataHandler((DataSource)fileDataSource));
            mimeBodyPart2.setFileName(str);
    */        //mimeMultipart.addBodyPart((BodyPart)mimeBodyPart2);
            mimeMessage.setContent((Multipart)mimeMultipart);
            //System.out.println("File is  : " + (new File(str)).getAbsolutePath());
            Transport.send((Message)mimeMessage);
        } catch (MessagingException messagingException) {
            System.out.println("************************************************************************************"+messagingException);
            System.out.println("");
            System.out.println("No Records found to generate mail for UK Paper Reservation Data.");
            System.out.println("");
            System.out.println("*************************************************************************************");
        }
        return true;
    }
    public static void main(String ar[])
    {
        getMail();
    }
}

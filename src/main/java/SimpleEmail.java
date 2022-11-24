import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

public class SimpleEmail {

    public static void main(String[] args) {

        System.out.println("SimpleEmail Start");

        String toEmailID = "shipravalecha65@gmail.com";

        Properties props = new Properties();
        props.put("mail.smtp.auth", true);
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");

        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("shipravalecha92@gmail.com", "ywbwcaccevrfeplz");
            }
        });

        EmailUtil.sendEmail(session, toEmailID,"hi", "hi");
    }

}
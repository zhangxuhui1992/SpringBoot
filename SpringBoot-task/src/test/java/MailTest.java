import com.App;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-15 21:54
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class MailTest {

    @Autowired
    JavaMailSenderImpl mailSender;

    @Test
    public void testMail(){
        SimpleMailMessage message = new SimpleMailMessage();
        //邮件设置
        message.setSubject("通知-今晚开会");
        message.setText("今晚7:30开会");

        message.setTo("1107905677@qq.com");
        message.setFrom("1083606942@qq.com");
        mailSender.send(message);
    }

    @Test
    public void test02() throws  Exception{
        //1、创建一个复杂的消息邮件
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

        //邮件设置
        helper.setSubject("通知-今晚开会");
        helper.setText("<b style='color:red'>今天 7:30 开会</b>",true);

        helper.setTo("1107905677@qq.com");
        helper.setFrom("1083606942@qq.com");

        //上传文件
        helper.addAttachment("1.jpg",new File("F:\\娱乐\\图片\\6s-2019\\IMG_0817.JPG"));
        helper.addAttachment("2.jpg",new File("F:\\娱乐\\图片\\6s-2019\\IMG_1167.JPG"));

        mailSender.send(mimeMessage);

    }


}

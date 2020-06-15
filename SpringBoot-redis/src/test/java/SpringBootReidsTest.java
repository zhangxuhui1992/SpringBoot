import com.App;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-15 14:26
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class SpringBootReidsTest {

    @Autowired
    StringRedisTemplate redisTemplate;

    @Test
    public void redisTest(){
        redisTemplate.opsForValue().set("msg", "123");
    }


    @Test
    public void getMsg(){
        String mag = redisTemplate.opsForValue().get("msg");
        System.out.println(mag);
    }
}

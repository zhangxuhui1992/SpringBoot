import com.mace.App;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-01 10:14
 */
@SpringBootTest(classes = App.class)
@RunWith(SpringRunner.class)
public class springLogTest {

    Logger logger = LoggerFactory.getLogger(getClass());


    @Test
    public void test(){
        logger.info("我是调试信息");
    }


}

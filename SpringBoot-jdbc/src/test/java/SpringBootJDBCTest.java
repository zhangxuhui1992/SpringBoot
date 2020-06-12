import com.App;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;


/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-12 14:55
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class SpringBootJDBCTest {

    @Autowired
    DataSource dataSource;

    @Test
    public void test(){
        System.out.println(dataSource.getClass());
    }
}



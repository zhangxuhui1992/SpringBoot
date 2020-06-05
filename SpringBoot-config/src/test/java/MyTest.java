import com.mace.App;
import com.mace.pojo.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-01 9:14
 *
 * springboot 单元测试
 * 测试期间可以方便的自动注入相应的组件
 */
@SpringBootTest(classes = App.class)
@RunWith(SpringRunner.class)
public class MyTest {

    /**
     * springboot 上下文对象
     */
    @Autowired
    ApplicationContext ac;

    @Autowired
    Person person;


    @Test
    public void test(){
        Object helloService = ac.getBean("helloService");
        System.out.println(helloService);
    }


    @Test
    public void test2(){
        System.out.println(person);
    }

}

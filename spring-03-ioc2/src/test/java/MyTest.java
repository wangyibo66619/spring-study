import com.wang.pojo.User;
import com.wang.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserT user = (UserT) context.getBean("user2");
        user.show();
    }
}

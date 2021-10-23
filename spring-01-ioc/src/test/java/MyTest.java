import com.wang.dao.UserDaoMysqlImpl;
import com.wang.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        // 获取ApplicationContext : 拿到spring的容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserServiceImpl serviceImpl = (UserServiceImpl) context.getBean("serviceImpl");
        serviceImpl.getUser();
    }
}

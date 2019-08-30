import com.lovo.spring.service.IUserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserT {
    ClassPathXmlApplicationContext app=null;
    IUserService service=null;
    @Before
    public void  before(){
        app=new ClassPathXmlApplicationContext("context.xml");
        service=   (IUserService)app.getBean("userService");
    }
    @Test
    public  void  testServcie(){
      String str=  service.getUserName();
        System.out.println(str);
    }
}

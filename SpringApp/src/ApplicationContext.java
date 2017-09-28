import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.af.dao.Users;
import com.af.dao.UsersDao;

public class ApplicationContext {

   private static String path = "com/af/config/dao-context.xml";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(path);
		UsersDao usersdao =  (UsersDao) ((BeanFactory) context).getBean("UsersDao");
		List<Users> users = usersdao.getUsers();
		for(Users users1 : users) {
			System.out.println(users1);
		}
		context.close();
		
	}

}

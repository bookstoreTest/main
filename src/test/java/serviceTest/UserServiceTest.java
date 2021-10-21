package serviceTest;

import com.EVA.bookStore.pojo.User;
import com.EVA.bookStore.service.UserService;
import com.EVA.bookStore.service.impl.UserServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserServiceTest {
    UserService userService = new UserServiceImpl();
    @Test
    public void registerUser() {
        userService.registerUser(new User(null,"zhangsan","123456","zhangsan@163.com"));
        userService.registerUser(new User(null,"wangwu","123456","wangwu@163.com"));

    }

    @Test
    public void login() {
        System.out.println( userService.login(new User(null,"zhangsan","123456","zhangsan@163.com")));
        System.out.println(userService.login(new User(null,"zhaoliu","123456","zhangsan@163.com")));

    }

    @Test
    public void existsUsername() {
        System.out.println(userService.existsUsername( "zhangsan"));
        System.out.println(userService.existsUsername("zhaoliu"));

    }
}
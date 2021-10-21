package daoTest;

import com.EVA.bookStore.dao.UserDao;
import com.EVA.bookStore.dao.impl.UserDaoImpl;
import com.EVA.bookStore.pojo.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserDaoTest {
    UserDao userDao = new UserDaoImpl();

    @Test
    public void queryUserByUsername() {
        if(null == userDao.queryUserByUsername("admin")){
            System.out.println("用户可用");
        }else {
            System.out.println("用户已存在");
        };
    }

    @Test
    public void queryUserByUsernameAndPassword() {
        if(null == userDao.queryUserByUsernameAndPassword("admin","admin")){
            System.out.println("用户名或密码错误，登陆失败");
        }else {
            System.out.println("登陆成功");
        };
    }

    @Test
    public void saveUser() {
        System.out.println(userDao.saveUser(new User(null,"tom","123456","liming126@qq.com")));;
    }
}
package top.hjh.spring.ioc.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @Author huang
 * @Description
 * @Date 2023 03 06 21 17
 **/
@Repository("UserService")
public class UserServiceImpl implements  UserService{

    @Autowired
    private UserDao userDao;
//    使用@Autowired 注解标注在属性userDao上，这相当于配置文件中<property name="userDao" ref="userDao"/>的写法；


    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        this.userDao.save();
        System.out.println("userService....save.....");
    }
}

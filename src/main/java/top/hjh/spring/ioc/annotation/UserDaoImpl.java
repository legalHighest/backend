package top.hjh.spring.ioc.annotation;

import org.springframework.stereotype.Repository;

/**
 * @Author huang
 * @Description
 * @Date 2023 03 06 21 14
 **/

@Repository("userDao")
public class UserDaoImpl implements  UserDao{
    @Override
    public void save() {
        System.out.println("userDao....save....");
    }
}

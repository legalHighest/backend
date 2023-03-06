package top.hjh.spring.ioc;

public class UserServiceImpl implements UserService {
    private  UserDao userDao;
    String app;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setApp(String app) {
        this.app = app;
    }

    @Override
    public void say() {
        this.userDao.say();
        System.out.println(app);
        System.out.println("userService say hellow world!");
    }
}

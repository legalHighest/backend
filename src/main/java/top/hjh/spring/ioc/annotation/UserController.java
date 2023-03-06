package top.hjh.spring.ioc.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.ParameterResolutionDelegate;
import org.springframework.stereotype.Controller;

import javax.swing.plaf.PanelUI;

/**
 * @Author huang
 * @Description 控制类
 * @Date 2023 03 06 21 20
 **/

@Controller("userController")
public class UserController {
    @Autowired
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void save(){
        this.userService.save();
        System.out.println("userController...save....");
    }


}

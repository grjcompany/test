package service;

import com.lcvc.test.service.AdminService;
import com.lcvc.test.test.SpringJunitTest;
import org.junit.Test;

import javax.annotation.Resource;

public class AdminServiceTest  extends SpringJunitTest {
    @Resource
    private AdminService adminService;

    @Test
    public void loginTest(){
        System.out.println(adminService.login("user","123456"));
        System.out.println(adminService.login("user","123"));
    }
}

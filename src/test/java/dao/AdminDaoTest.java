package dao;

import com.lcvc.test.dao.AdminDao;
import com.lcvc.test.model.Admin;
import com.lcvc.test.test.SpringJunitTest;
import org.junit.Test;

import javax.annotation.Resource;

public class AdminDaoTest extends SpringJunitTest {
    @Resource
    private AdminDao adminDao;
    /*
    对login方法进行测试
     */
    @Test
    public void loginTest(){
        Admin admin=adminDao.login("user","123456");
        System.out.println(admin.getName());
    }
}

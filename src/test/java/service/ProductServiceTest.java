package service;

import com.lcvc.test.service.AdminService;
import com.lcvc.test.service.ProductService;
import com.lcvc.test.test.SpringJunitTest;
import org.junit.Test;

import javax.annotation.Resource;

public class ProductServiceTest extends SpringJunitTest {
    @Resource
    private ProductService productService;

    @Test
    public void getProductsTest(){
        System.out.println("账户总数："+productService.getProducts().size());
    }
}

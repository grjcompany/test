package service;

import com.lcvc.test.dao.ProductDao;
import com.lcvc.test.model.Product;
import com.lcvc.test.service.AdminService;
import com.lcvc.test.service.ProductService;
import com.lcvc.test.test.SpringJunitTest;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class ProductServiceTest extends SpringJunitTest {
    @Resource
    private ProductService productService;

    @Test
    public void getProductsTest(){
        System.out.println("账户总数："+productService.getProducts().size());
    }

    @Test
    public void ProductTest(){
        List<Product> productlist=productService.getProducts();

        for(Product product:productlist){
            System.out.println(product.getName());
            System.out.println(product.getNum());
            System.out.println(product.getPrice());
            System.out.println(product.getPicture());
            System.out.println(product.getPromotion());
            System.out.println(product.getSales());
            System.out.println(product.getTotal());
            System.out.println(product.getProductTypeId());
        }
    }

    @Test
    public void deleteTest(){
       productService.delete(4);
    }


}



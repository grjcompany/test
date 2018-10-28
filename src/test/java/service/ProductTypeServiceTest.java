package service;

import com.lcvc.test.model.ProductType;
import com.lcvc.test.service.ProductTypeService;
import com.lcvc.test.test.SpringJunitTest;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class ProductTypeServiceTest  extends SpringJunitTest {
    @Resource
    private ProductTypeService productTypeService;

    @Test
    public void getProductTypeTest(){
        System.out.println("产品总数："+productTypeService.getProductType().size());
    }

    @Test
    public void readAllTest() {
        List<ProductType> list = productTypeService.getProductType();
        for(ProductType productType:list){
            System.out.println(productType.getDessert());
            System.out.println(productType.getChinese());
            System.out.println(productType.getCold());
            System.out.println(productType.getDrinks());
            System.out.println(productType.getFish());
            System.out.println(productType.getLce());
            System.out.println(productType.getNoodle());
            System.out.println(productType.getTea());
            System.out.println(productType.getWest());
            System.out.println(productType.getWine());
        }
    }

    @Test
    public void deleteTest(){
        productTypeService.deleteProductType(3);
    }

    @Test
    public void updateTest(){
        ProductType productType=productTypeService.get(1);
        productType.setDessert("红烧鲤鱼");
        productType.setChinese("好吃");
        productType.setWest("qq");
        productType.setDrinks("很好吃");
        productType.setWine(20);
        productType.setCold("栏目1");
        productType.setFish("cc");
        productType.setTea("dd");
        productType.setLce("zz");
        productType.setNoodle("本菜品是红烧鲤鱼");
        productTypeService.updateProductType(productType);
    }
}

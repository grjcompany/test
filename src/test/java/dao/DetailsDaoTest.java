package dao;

import com.lcvc.test.dao.DetailsDao;
import com.lcvc.test.dao.OrderDao;
import com.lcvc.test.model.Details;
import com.lcvc.test.model.Order;
import com.lcvc.test.test.SpringJunitTest;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class DetailsDaoTest extends SpringJunitTest {
    @Resource
    private DetailsDao detailsDao;
    @Test
    public void readAllTest(){
        List<Details> list=detailsDao.readAll();
        System.out.println(list.size());
        for(Details details:list){
            System.out.println(details.getName());
            System.out.println(details.getNumber());
            System.out.println(details.getOriginalPrice());
            System.out.println(details.getPicture());
            System.out.println(details.getPromotion());
            System.out.println(details.getSales());
        }
    }

    @Test
    public void saveTest(){
        Details details=new Details();
        details.setName("红烧排骨");
        details.setNumber("20");
        details.setOriginalPrice(20.8f);
        details.setPicture("dd");
        details.setPromotion(16.2f);
        details.setSales("ds");
        detailsDao.save(details);
    }
}

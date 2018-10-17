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
            System.out.println(details.getNum());
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
        details.setPicture("dd");
        details.setOriginalPrice(20.8f);
        details.setPromotion(16.2f);
        details.setNum("20");
        details.setSales("ds");
        detailsDao.save(details);
    }

    @Test
    public void deleteTest(){
        detailsDao.delete(2);
    }

    @Test
    public void updateTest(){
        Details details=detailsDao.get(1);
        details.setName("hhh");
        details.setPicture("ss");
        details.setOriginalPrice(20.0f);
        details.setPromotion(22.0f);
        details.setNum("www");
        details.setSales("fff");
        detailsDao.update(details);
    }
}

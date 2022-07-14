package cn.hx;

import cn.hx.org.serivce.IDepartmentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class DepartmentTest {

    @Autowired
    private IDepartmentService iDepartmentService;

    @Test
    public void test(){

        iDepartmentService.findAll().forEach(System.out::println);
    }
}

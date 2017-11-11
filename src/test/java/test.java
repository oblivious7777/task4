import com.task.dao.CategoryMapper;
import com.task.model.Category;
import com.task.model.Category_;
import com.task.service.CategoryService;
import com.task.units.CategoryDynaSqlProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class test {
    @Autowired
    //因idea检测不到Spring装配的CategoryMapper，需通过此标签声明
    @SuppressWarnings("SpringJavaAutowiringInspection")
    CategoryMapper categoryMapper;


    //查询
    @Test
    public  void List() {
        List<Category_> cs = categoryMapper.listOccId(1);
        for (Category_ c : cs) {
            System.out.println(c.toString());
        }
    }
    @Test
    public void l(){
        int a=categoryMapper.listState();
       // int b=categoryMapper.listStateLs();
       // int c=categoryMapper.listStateAlready();
        System.out.println(a);
       // System.out.println(b);
        //System.out.println(c);
    }

    @Test
    public void a(){
Category a=new Category();

a.setDirection("前端");
a.setOccupation("web");
        int b=categoryMapper.listOccDir(a);
            System.out.println(b);
        a.setDirection("后端");
        a.setOccupation("tab");
        int c=categoryMapper.listOccDir(a);
        System.out.println(c);

        }


    @Test
    public void aa(){
        Category a=new Category();
        a.setDirection("前端");
        a.setOccupation("web");

            System.out.println(categoryMapper.listOccDirAll(a));
    }
    }


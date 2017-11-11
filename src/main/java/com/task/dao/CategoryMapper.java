package com.task.dao;

import com.task.model.Category;
import com.task.model.Category_;
import com.task.units.CategoryDynaSqlProvider;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface CategoryMapper {
    @Select("select * from   student")
    public List<Category> list();//查询学生表

    @Select("select count(*) from student")
    public int listState();//select总数

    @Select("select count(*) from student where state=1")
    public int listStateLs();//在学总数

    @Select("select count(*) from student where state=2")
    public int listStateAlready();//结业总数

    @Select("select * from student where state=2")
    public List<Category> listStateAll();//结业名单

    @Select("select count(*) from   student where direction =#{direction}  and  occupation =#{occupation}")
    public int listOccDir(Category category);//查询职业人数

    @Select("select * from   occupation")
    public List<Category_> listOcc();//查询职业表

    @Select("select * from   occupation where id = #{id}")
    public List<Category_> listOccId(int id);//按id查询


    @SelectProvider(type=CategoryDynaSqlProvider.class,method="listOccDirAll")
    public int listOccDirAll(Category category);//动态sql语句


}
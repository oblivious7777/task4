package com.task.service.impl;

import com.task.dao.CategoryMapper;
import com.task.model.Category;
import com.task.model.Category_;
import com.task.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl  implements CategoryService {
    @Autowired
    @SuppressWarnings("SpringJavaAutowiringInspection")
    CategoryMapper categoryMapper;


    public List<Category> list(){
        return categoryMapper.list();
    }
    public int listState(){return categoryMapper.listState();}
    public int listStateLs(){return categoryMapper.listStateLs();}
    public int listStateAlready(){return categoryMapper.listStateAlready();}
    public List<Category> listStateAll(){return categoryMapper.listStateAll();}
    public List<Category_> listOcc(){ return categoryMapper.listOcc(); }
    public int listOccDir(Category category){return categoryMapper.listOccDir(category);}
    public List<Category_> listOccId(int id){return categoryMapper.listOccId(id);}
    public int listOccDirAll(Category category){return categoryMapper.listOccDirAll(category);}
}
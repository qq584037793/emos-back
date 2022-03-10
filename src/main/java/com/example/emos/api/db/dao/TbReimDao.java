package com.example.emos.api.db.dao;

import com.example.emos.api.db.pojo.TbAmect;
import com.example.emos.api.db.pojo.TbReim;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface TbReimDao {

    //分页查询
    public ArrayList<HashMap> searchReimByPage(HashMap param);
    public long searchReimCount(HashMap param);

    //更新报销instanceId(异步开启workflow)
    public int updateReimInstanceId(HashMap param);

    //创建报销
    public int insert(TbReim reim);

    //生成pdf
    public HashMap searchReimById(HashMap param);

    //删除
    public String searchInstanceIdById(int id);
    public int deleteReimById(HashMap param);
}

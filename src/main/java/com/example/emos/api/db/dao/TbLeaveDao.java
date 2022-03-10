package com.example.emos.api.db.dao;

import com.example.emos.api.db.pojo.TbLeave;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface TbLeaveDao {

    //分页
    public ArrayList<HashMap> searchLeaveByPage(HashMap param);
    public long searchLeaveCount(HashMap param);

    //更新instanceId
    public int updateLeaveInstanceId(HashMap param);

    //创建请假
    public long searchContradiction(HashMap param);
    public int insert(TbLeave leave);

    //删除请假
    public String searchInstanceIdById(int id);
    public int deleteLeaveById(HashMap param);

    //生成请假单
    public HashMap searchLeaveById(HashMap param);
}

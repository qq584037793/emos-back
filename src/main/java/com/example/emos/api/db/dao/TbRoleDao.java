package com.example.emos.api.db.dao;

import com.example.emos.api.db.pojo.TbRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;


@Mapper
public interface TbRoleDao {

    public ArrayList<HashMap> searchAllRole();
    public HashMap searchById(int id);

    //分页数据
    public ArrayList<HashMap> searchRolePage(HashMap param);
    public long searchRoleCount(HashMap param);

    //设置插入权限
    public int insert(TbRole role);

    //修改权限(默认权限无法修改) 先查询用户的权限 然后更新
    public ArrayList<Integer> searchUserIdByRoleId(int roleId);
    public int update(TbRole role);

    //删除用户(不能删除内置人物,例如正在请假的人) 难理解
    public boolean searchCanDelete(Integer[] ids);
    public  int deleteRoleByIds(Integer[] ids);

}
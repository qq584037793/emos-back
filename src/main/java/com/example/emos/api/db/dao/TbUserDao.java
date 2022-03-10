package com.example.emos.api.db.dao;

import com.example.emos.api.db.pojo.TbUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

@Mapper
public interface TbUserDao {
    public Set<String> searchUserPermissions(int userId);

    public HashMap searchById(int userId);

    public Integer searchIdByOpenId(String openId);

    public HashMap searchUserSummary(int userId);

    public HashMap searchUserInfo(int userId);

    public Integer searchDeptManagerId(int id);

    public Integer searchGmId();
    //查找用户
    public ArrayList<HashMap> searchAllUser();
    //登录
    public Integer login(HashMap param);
    //更新密码
    public int updatePassword(HashMap param);
    //分页
    public ArrayList<HashMap> searchUserByPage(HashMap param);
    //每页个数
    public long searchUserCount(HashMap param);
    //插入用户
    public int insert(TbUser user);
    //修改用户数据
    public int update(HashMap param);
    //删除用户(除管理员)
    public int deleteUserByIds(Integer[] ids);

    //查询用户角色(RoleId)
    public ArrayList<String> searchUserRoles(int userId);

    //查询用户名字部门(在线视频用)
    public HashMap searchNameAndDept(int userId);



}
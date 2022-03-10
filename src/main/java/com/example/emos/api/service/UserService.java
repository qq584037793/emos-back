package com.example.emos.api.service;

import cn.hutool.core.util.PageUtil;
import com.example.emos.api.common.util.PageUtils;
import com.example.emos.api.db.pojo.TbUser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public interface UserService {
    public HashMap createQrCode();

    public boolean checkQrCode(String code,String uuid);

    public HashMap wechatLogin(String uuid);

    public Set<String> searchUserPermissions(int userId);

    public HashMap searchUserSummary(int userId);

    public HashMap searchById(int userId);

    public ArrayList<HashMap> searchAllUser();

    Integer login(HashMap param);

    int updatePassword(HashMap param);

    PageUtils searchUserByPager(HashMap param);

    int insert(TbUser user);

    int update(HashMap param);

    int deleteUserByIds(Integer[] ids);

    ArrayList<String> searchUserRoles(int userId);

    HashMap searchNameAndDept(int userId);
}

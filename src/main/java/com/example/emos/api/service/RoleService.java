package com.example.emos.api.service;

import com.example.emos.api.common.util.PageUtils;
import com.example.emos.api.db.pojo.TbRole;

import java.util.ArrayList;
import java.util.HashMap;

public interface RoleService {
    public ArrayList<HashMap> searchAllRole();
    public HashMap searchById(int id);

    PageUtils searchRoleByPage(HashMap param);

    int insert(TbRole role);

    ArrayList<Integer> searchUserIdByRoleId(int roleId);

    int update(TbRole role);

    int deleteRoleByIds(Integer[] ids);
}

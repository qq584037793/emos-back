package com.example.emos.api.service;

import com.example.emos.api.common.util.PageUtils;
import com.example.emos.api.db.pojo.TbReim;

import java.util.HashMap;

public interface ReimService {
    PageUtils searchReimByPage(HashMap param);

    int insert(TbReim reim);

    HashMap searchReimById(HashMap param);

    int deleteReimById(HashMap param);
}

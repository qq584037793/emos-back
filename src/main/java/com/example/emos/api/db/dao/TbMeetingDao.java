package com.example.emos.api.db.dao;

import com.example.emos.api.db.pojo.TbMeeting;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface TbMeetingDao {
    public boolean searchMeetingMembersInSameDept(String uuid);
    public HashMap searchMeetingById(HashMap param);

    //线下会议查询
    public ArrayList<HashMap> searchOfflineMeetingByPage(HashMap param);
    public long searchOfflineMeetingCount(HashMap param);

    //更新会议实例id
    public int updateMeetingInstanceId(HashMap param);

    //创建会议
    public int insert(TbMeeting meeting);

    //查询周日历,查询会议
    public ArrayList<HashMap> searchOfflineMeetingInWeek(HashMap param);
    public HashMap searchMeetingInfo(long id);
    public HashMap searchCurrentMeetingInfo(long id);

    //删除会议
    public int deleteMeetingApplication(HashMap param);

    //线上会议查询
    public ArrayList<HashMap> searchOnlineMeetingByPage(HashMap param);
    public long searchOnlineMeetingCount(HashMap param);

    //查询成员姓名
    public ArrayList<HashMap> searchOnlineMeetingMembers(HashMap param);

    //查询在线成员状态
    public long searchCanCheckinMeeting(HashMap param);
    public int updateMeetingPresent(HashMap param);
}
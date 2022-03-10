package com.example.emos.api.db.dao;

import com.example.emos.api.db.pojo.TbMeetingRoom;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface TbMeetingRoomDao {
    public ArrayList<HashMap> searchAllMeetingRoom();
    
    public HashMap searchById(int id);
    
    public ArrayList<String> searchFreeMeetingRoom(HashMap param);

    //meeting分页
    public ArrayList<HashMap> searchMeetingRoomByPage(HashMap param);
    public long searchMeetingRoomCount(HashMap param);

    //插入会议室
    public int insert(TbMeetingRoom meetingRoom);

    //修改会议
    public int update(TbMeetingRoom meetingRoom);

    //删除会议(只能删除未关联会议)
    public boolean searchCanDelete(Integer[] ids);
    public int deleteMeetingRoom(Integer[] ids);
}

package cn.cdtu.CDTUE.dao;

import cn.cdtu.CDTUE.pojo.School;
import cn.cdtu.CDTUE.pojo.SchoolWithBLOBs;

public interface SchoolMapper {
    int deleteByPrimaryKey(String id);

    int insert(SchoolWithBLOBs record);

    int insertSelective(SchoolWithBLOBs record);

    SchoolWithBLOBs selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SchoolWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SchoolWithBLOBs record);

    int updateByPrimaryKey(School record);
}
package com.cn.hnust.dao;

import java.util.List;

import com.cn.hnust.pojo.Nodes;

public interface NodesMapper<T> {
    int deleteByPrimaryKey(Long id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
    
    List<T> queryTopNodes();
    
    List<T> queryChildNodes(String parentid);
}
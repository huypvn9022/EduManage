/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duan1.dao;

/**
 *
 * @author pc
 */
import java.util.List;

abstract public class DuAn1DAO<EntityType, KeyType> {
    abstract public boolean insert(EntityType entity);
    abstract public boolean update(EntityType entity);
    abstract public boolean delete(KeyType id);
    abstract public EntityType selectById(KeyType id);
    abstract public List<EntityType> selectAll();
    abstract protected List<EntityType> selectBySql(String sql, Object...args);
}

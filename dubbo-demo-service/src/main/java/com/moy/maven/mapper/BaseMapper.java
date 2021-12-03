package com.moy.maven.mapper;

import java.io.Serializable;
import java.util.List;

public interface BaseMapper<E, P extends Serializable> {

    /**
     * 新增
     * @param entity
     * @return
     */
    P insert(E entity);

    /**
     * 根据主键刪除记录
     * @param pk
     * @return
     */
    Integer delete(P pk);

    /**
     * 更新实体记录
     * @param entity
     * @return
     */
    Integer update(E entity);

    /**
     * 根据实体内容查询实体列表
     * @param entity
     * @return
     */
    List<E> select(E entity);
    
    /**
     * 根据主键查询实体
     * @param pk
     * @return
     */
    E get(P pk);

    /**
     * 根据实体内容查询总数
     * @param entity
     * @return
     */
    Integer count(E entity);
}
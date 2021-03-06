/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.dao;

import org.apache.ibatis.annotations.Mapper;

import com.baidu.brcc.dao.base.BaseMapper;
import com.baidu.brcc.domain.ItemType;
import com.baidu.brcc.domain.ItemTypeExample;

@Mapper
public interface ItemTypeMapper extends BaseMapper<ItemType, Long, ItemTypeExample> {
}

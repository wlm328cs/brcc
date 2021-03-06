/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.brcc.domain.vo;

import lombok.Data;

@Data
public class VersionVo {

    // 版本ID
    private Long id;

    // 版本名称
    private String name;

    // 版本简介
    private String memo;

    // 环境ID
    private Long environmentId;

}

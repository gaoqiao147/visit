package com.freesofts.resourcecenter.moudle.visit.model;

import com.freesofts.resourcecenter.common.entity.ExtendBasicEntity;

import javax.persistence.Column;

/**
 * 功能描述：走访主任务表
 *
 * @Company 杭州孚立计算机软件有限公司
 * @Author 袁昊
 * @Datetime 2022/8/22
 */
public class VisitMainTask extends ExtendBasicEntity {
    /**
     * 批次
     */
    @Column(name = "batch")
    String batch;

}

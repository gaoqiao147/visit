package com.freesofts.resourcecenter.moudle.visit.model;

import com.freesofts.resourcecenter.common.entity.ExtendBasicEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import javax.persistence.*;

/**
 * 走访任务表
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "visit_task")
public class VisitTask extends ExtendBasicEntity {


    /**
     * 关联房屋id
     */
    @Column(name = "house_id")
    private String houseId;

    /**
     * 走访状态
     */
    @Column(name = "visit_state")
    private String visitState;

    /**
     * 走访人
     */
    @Column(name = "visit_user")
    private String visitUser;

    /**
     * 居住状态
     */
    @Column(name = "live_state")
    private String liveState;


    /**
     * 户主姓名
     */
    @Column(name = "householder_name")
    private String householderName;

    /**
     * 户主联系方式
     */
    @Column(name = "householder_phone")
    private String householderPhone;

    /**
     * 主任务id
     */
    @Column(name = "main_task_id")
    private String mainTaskId;

    /**
     * 关联户主身份证
     */
    @Column(name = "householder_card_id")
    private String householderCardId;
}
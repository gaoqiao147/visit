package com.freesofts.resourcecenter.moudle.visit.model;

import com.freesofts.resourcecenter.common.entity.ExtendBasicEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import javax.persistence.*;

/**
 * 走访工作人员表
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "visit_person")
public class VisitPerson extends ExtendBasicEntity {


    /**
     * 走访人id
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 走访状态
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 走访人
     */
    private String phone;

    /**
     * 启用禁用状态
     */
    private String state;


}
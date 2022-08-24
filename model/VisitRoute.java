package com.freesofts.resourcecenter.moudle.visit.model;

import com.freesofts.resourcecenter.common.entity.ExtendBasicEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import javax.persistence.*;

/**
 * 走访路线表
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "visit_route")
public class VisitRoute extends ExtendBasicEntity {

    /**
     * 开始时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 结束时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 走访人id
     */
    @Column(name = "user_id")
    private String userId;


}
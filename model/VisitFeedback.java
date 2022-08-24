package com.freesofts.resourcecenter.moudle.visit.model;

import com.freesofts.resourcecenter.common.entity.ExtendBasicEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import javax.persistence.*;

/**
 * 走访反馈表
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "visit_feedback")
public class VisitFeedback extends ExtendBasicEntity {


    /**
     * 走访任务id
     */
    @Column(name = "visit_id")
    private String visitId;

    /**
     * 走访人id
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 反馈内容
     */
    private String content;

    /**
     * 居住状态（无人居住、正常、长期无人居住）
     */
    @Column(name = "live_state")
    private String liveState;

    /**
     * 走访路线id
     */
    @Column(name = "route_id")
    private String routeId;

    /**
     * 走访情况（正常、信息异常、异常转事件
     */
    @Column(name = "visit_situation")
    private String visitSituation;

    /**
     * 异常事件id
     */
    @Column(name = "incident_id")
    private String incidentId;

    /**
     * 异常任务id
     */
    @Column(name = "task_id")
    private String taskId;


}
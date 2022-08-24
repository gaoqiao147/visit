package com.freesofts.resourcecenter.moudle.visit.model;

import com.freesofts.resourcecenter.common.entity.ExtendBasicEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import javax.persistence.*;

/**
 * 信息异常记录表
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "visit_abnormal_record")
public class VisitAbnormalRecord extends ExtendBasicEntity {

    /**
     * 异常信息
     */
    private String contnet;

    /**
     * 系统数据信息
     */
    @Column(name = "system_data_information")
    private String systemDataInformation;


}
package com.freesofts.resourcecenter.moudle.visit.vo;

import lombok.Data;

/**
 * @author zhouwei
 */
@Data
public class VisitPersonVO {
    /**
     * id编号
     */
    private String id;
    /**
     * 行政区划名称
     */
    private String departName;
    /**
     * 行政区划编码
     */
    private String departCode;
    /**
     * 走访人姓名
     */
    private String userName;
    /**
     * 电话号码
     */
    private String phone;
    /**
     * 状态
     */
    private String state;
}

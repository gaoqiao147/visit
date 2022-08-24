package com.freesofts.resourcecenter.moudle.visit.enums;

/**
 * Description: 走访状态
 * 版权所有：
 * 未经本公司许可，不得以任何方式复制或使用本程序任何部分
 * <p>
 * 杭州孚立计算机软件有限公司
 *
 * @author linshun
 * date: 2022/8/23 9:52
 * @since JDK 1.8
 */
public enum VisitStateEnum {

    /**
     * 未走访
     */
    NOT_VISITED("1","未走访"),

    /**
     * 已走访
     */
    VISITED("2","已走访");



    private String flag;

    private String description;

    VisitStateEnum(String flag, String description){
        this.flag = flag;
        this.description = description;
    }

    public String getFlag() {
        return flag;
    }

    public String getDescription(){return description;}
}

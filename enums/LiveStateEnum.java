package com.freesofts.resourcecenter.moudle.visit.enums;

/**
 * Description: 居住状态
 * 版权所有：
 * 未经本公司许可，不得以任何方式复制或使用本程序任何部分
 * <p>
 * 杭州孚立计算机软件有限公司
 *
 * @author linshun
 * date: 2022/8/23 9:52
 * @since JDK 1.8
 */
public enum LiveStateEnum {

    /**
     * 正常
     */
    NORMAL("1","正常"),

    /**
     * 无人居住
     */
    UNINHABITED("2","无人居住"),

    /**
     * 长期无人居住
     */
    LONG_UNINHABITED("0","长期无人居住");

    private String flag;

    private String description;

    LiveStateEnum(String flag, String description){
        this.flag = flag;
        this.description = description;
    }

    public String getFlag() {
        return flag;
    }

    public String getDescription(){return description;}
}

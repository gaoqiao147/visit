package com.freesofts.resourcecenter.moudle.visit.service;

import com.freesofts.resourcecenter.moudle.visit.vo.VisitPersonVO;

import java.util.List;

/**
 * @author zhouwei
 */
public interface VisitPersonService {
    /**
     * 模糊查询
     * @param pagestart
     * @param pagesize
     * @param keyword
     * @param departCode
     * @return
     */
    List<VisitPersonVO> list(int pagestart, int pagesize, String keyword, String departCode);

    /**
     * 绑定工作人员
     * @param visitPersonVO
     * @return
     */
    int bindingPerson(VisitPersonVO visitPersonVO);

    /**
     * 绑定工作人员及其所属网格
     * @param visitPersonVO
     * @return
     */
    int bindingPersonAndGrid(VisitPersonVO visitPersonVO);

    /**
     * 批量绑定人员
     * @param list
     * @return
     */
    int bindingListPerson(List<VisitPersonVO> list);

    /**
     * 解绑工作人员
     * @param id
     * @return
     */
    int unboundPerson(String id);

    /**
     * 删除无效数据
     * @param id
     * @return
     */
    int deletePerson(String id);


}

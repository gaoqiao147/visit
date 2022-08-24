package com.freesofts.resourcecenter.moudle.visit.mapper;

import com.freesofts.resourcecenter.moudle.visit.model.VisitPerson;
import com.freesofts.resourcecenter.moudle.visit.vo.VisitPersonVO;
import com.freesofts.resourcecenter.mybatis.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zhouwei
 */
@Mapper
public interface VisitPersonMapper extends MyMapper<VisitPerson> {
    /**
     * 模糊查询（关键字查询、部门id查询）
     * @param pagestart
     * @param pagesize
     * @param keyword
     * @param departCode
     * @return
     */
    List<VisitPersonVO> list(@Param("pageStart") int pagestart,
                             @Param("pageSize") int pagesize,
                             @Param("departCode") String departCode ,
                             @Param("keyword") String keyword);
    /**
     * 绑定工作人员
     * @param visitPersonVO
     * @return
     */
    int bindingPerson(VisitPersonVO visitPersonVO);

    /**
     * 绑定工作人员及所属网格
     * @param visitPersonVO
     * @return
     */
    int bindingPersonAndGrid(VisitPersonVO visitPersonVO);
    /**
     * 批量绑定工作人员
     * @param list
     * @return
     */
    int bindingListPerson(List<VisitPersonVO> list);

    /**
     * 解绑工作人员
     * @param id
     * @return
     */
    int unboundPerson(@Param("id") String id);
    /**
     * 无效数据删除
     * @param id
     * @return
     */
    int deletePerson(@Param("id") String id);


}
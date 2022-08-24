package com.freesofts.resourcecenter.moudle.visit.service.impl;

import com.freesofts.resourcecenter.moudle.visit.mapper.VisitPersonMapper;
import com.freesofts.resourcecenter.moudle.visit.service.VisitPersonService;
import com.freesofts.resourcecenter.moudle.visit.vo.VisitPersonVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class VisitPersonServiceImpl implements VisitPersonService {
    @Resource
    VisitPersonMapper visitPersonMapper;
    @Override
    public List<VisitPersonVO> list(int pagestart, int pagesize, String keyword, String departCode) {
        return visitPersonMapper.list(pagestart,pagesize,keyword,departCode);
    }

    @Override
    public int bindingPerson(VisitPersonVO visitPersonVO) {
        return visitPersonMapper.bindingPerson(visitPersonVO);
    }

    @Override
    public int bindingPersonAndGrid(VisitPersonVO visitPersonVO) {
        visitPersonVO.setDepartCode(visitPersonVO.getDepartCode().substring(0,10));
        return visitPersonMapper.bindingPersonAndGrid(visitPersonVO);
    }

    @Override
    public int unboundPerson(String id) {
        return visitPersonMapper.unboundPerson(id);
    }

    @Override
    public int deletePerson(String id) {
        return visitPersonMapper.deletePerson(id);
    }

    @Override
    public int bindingListPerson(List<VisitPersonVO> list) {
        return visitPersonMapper.bindingListPerson(list);
    }
}

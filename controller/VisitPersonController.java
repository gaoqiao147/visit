package com.freesofts.resourcecenter.moudle.visit.controller;

import com.freesofts.common.response.BizResponseData;
import com.freesofts.common.response.result.types.IntegerBizResult;
import com.freesofts.common.response.result.types.ListBizResult;
import com.freesofts.common.utils.Datagrid;
import com.freesofts.resourcecenter.moudle.house.vo.HouseAddressListVO;
import com.freesofts.resourcecenter.moudle.visit.service.VisitPersonService;
import com.freesofts.resourcecenter.moudle.visit.vo.VisitPersonVO;
import com.github.xiaoymin.knife4j.annotations.ApiSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhouwei
 */
@Api(tags = "工作人员列表")
@ApiSupport(author = "周伟")
@RestController
@RequestMapping("visit-person")
public class VisitPersonController {
    @Resource
    VisitPersonService visitPersonService;

    @GetMapping("/{pageSize}/{pageNum}")
    @ApiOperation(value = "分页查询数据列表",httpMethod = "GET")
    public BizResponseData<?> list(@ApiParam(value = "数据页码", required = true) @PathVariable int pageNum,
                                    @ApiParam(value = "每页记录数", required = true) @PathVariable int pageSize,
                                    @ApiParam("行政区划编号") String departCode,
                                    @ApiParam("关键字") String keyword){
        List list = visitPersonService.list(pageNum, pageSize, departCode,keyword);
        return ListBizResult.builder().list(list).build().isNotEmpty();
    }

    @PostMapping("/binding")
    @ApiOperation(value = "绑定工作人员",httpMethod = "POST")
    public BizResponseData<Integer> binding(@RequestBody VisitPersonVO visitPersonVO){
        return IntegerBizResult.builder().value(visitPersonService.bindingPerson(visitPersonVO)).build().beEqualTo(1);
    }
    @PostMapping("/binding-grid")
    @ApiOperation(value = "绑定工作人员及其所属网格",httpMethod = "POST")
    public BizResponseData<Integer> bindingGrid(@RequestBody VisitPersonVO visitPersonVO){
        return IntegerBizResult.builder().value(visitPersonService.bindingPersonAndGrid(visitPersonVO)).build().greaterThanAndEquals(1);
    }
    @PostMapping("/binding-list")
    @ApiOperation(value = "绑定工作人员",httpMethod = "POST")
    public BizResponseData<Integer> bindingList(@RequestBody List<VisitPersonVO> list){
        return IntegerBizResult.builder().value(visitPersonService.bindingListPerson(list)).build().greaterThan(0);
    }

    @PostMapping("/unbound")
    @ApiOperation(value = "绑定工作人员",httpMethod = "POST")
    public BizResponseData<Integer> unbound(@ApiParam(value = "数据id") @RequestParam String id){
        return IntegerBizResult.builder().value(visitPersonService.unboundPerson(id)).build().beEqualTo(1);
    }

    @DeleteMapping("/delete")
    @ApiOperation(value = "删除工作人员",httpMethod = "DELETE")
    public BizResponseData<Integer> delete(@ApiParam(value = "数据id") @RequestParam String id){
        return IntegerBizResult.builder().value(visitPersonService.deletePerson(id)).build().beEqualTo(1);
    }
}

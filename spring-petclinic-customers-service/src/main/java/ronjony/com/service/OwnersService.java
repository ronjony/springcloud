package ronjony.com.service;

import ronjony.com.common.domain.customer.OwnersDo;

import java.util.List;

/**
 * cloud split mysqlService
 *
 * @author ronjony
 * @version 1.0.0 初始化
 * @date 2018-04-17 17:18:43
 * Copyright 本内容仅限于开源项目公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public interface OwnersService{

    public int saveRecord(OwnersDo ownersDo);
    public int updateById(OwnersDo ownersDo);
    public List<OwnersDo> getOwnersByCondition(OwnersDo ownersDo);
    public List<OwnersDo>  getAllOwners();

}

package ronjony.com.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import ronjony.com.dao.OwnersDao;
import ronjony.com.domain.OwnersDo;
import ronjony.com.service.OwnersService;

import java.util.List;


/**
 * cloud split mysqlServiceImpl
 *
 * @author ronjony
 * @version 1.0.0 初始化
 * @date 2018-04-17 17:18:43
 * Copyright 本内容仅限于开源项目公司内部传阅，禁止外泄以及用于其他的商业目的
 */

@Service("ownersService")
public class OwnersServiceImpl implements OwnersService {

    private static final Logger logger = LoggerFactory.getLogger(OwnersServiceImpl.class);

    @Resource
    private OwnersDao ownersDao;


    @Override
    public int saveRecord(OwnersDo ownersDo) {
        return saveRecord(ownersDo);
    }

    @Override
    public int updateById(OwnersDo ownersDo) {
        return updateById(ownersDo);
    }

    @Override
    public List<OwnersDo> getOwnersByCondition(OwnersDo ownersDo) {
        return getOwnersByCondition(ownersDo);
    }

    @Override
    public List<OwnersDo> getAllOwners() {
        OwnersDo ownersDo = new OwnersDo();
        List<OwnersDo> ownersDos = ownersDao.getListByCommonCondition(ownersDo);
        return ownersDos;
    }
}

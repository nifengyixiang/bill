package com.company.project.service.impl;

import com.company.project.dao.TypeMapper;
import com.company.project.model.Type;
import com.company.project.service.TypeService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/05/30.
 */
@Service
@Transactional
public class TypeServiceImpl extends AbstractService<Type> implements TypeService {
    @Resource
    private TypeMapper typeMapper;

}

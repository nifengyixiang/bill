package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Type;
import com.company.project.service.TypeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2018/05/30.
 */
@RestController
@RequestMapping("/type")
public class TypeController {
    @Resource
    private TypeService typeService;

    @PostMapping("/add")
    public Result add(Type type) {
        typeService.save(type);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        typeService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Type type) {
        typeService.update(type);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Type type = typeService.findById(id);
        return ResultGenerator.genSuccessResult(type);
    }

    @PostMapping("/findByUserId")
    public Result findByUserId(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "10") Integer size,@RequestParam Integer userId) {
        PageHelper.startPage(page, size);
        Condition condition = new Condition(Type.class);
        condition.createCriteria().andCondition("user_id=", userId);
        List<Type> list = typeService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "10") Integer size) {
        PageHelper.startPage(page, size);
        List<Type> list = typeService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}

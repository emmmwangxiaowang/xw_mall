package com.wang.xw_mall.controller;

import com.wang.xw_mall.service.ICategoryService;
import com.wang.xw_mall.service.IIndexImgService;
import com.wang.xw_mall.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2022/10/25
 */
@RestController
@RequestMapping("/index")
@CrossOrigin("*")
@Api(value = "提供首页数据显示相关接口",tags = "首页管理")
public class IndexController {

    @Resource
    IIndexImgService indexImgService;

    @Resource
    ICategoryService categoryService;

    @ApiOperation(value = "首页轮播图接口")
    @GetMapping("/index-img")
    public ResultVo getCarouselImg(){
        return indexImgService.getCarouselImg();
    }

    @ApiOperation(value = "类别查询")
    @GetMapping("/")
    public ResultVo getCategories(){
        return categoryService.queryAllCategories(0);
    }
}

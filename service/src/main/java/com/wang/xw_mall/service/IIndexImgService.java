package com.wang.xw_mall.service;

import com.wang.xw_mall.pojo.IndexImg;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.xw_mall.vo.ResultVo;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * <p>
 * 轮播图  服务类
 * </p>
 *
 * @author wang
 * @since 2022-10-11
 */
public interface IIndexImgService extends IService<IndexImg> {

    public ResultVo getCarouselImg();

}

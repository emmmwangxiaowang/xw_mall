package com.wang.xw_mall.mapper;

import com.wang.xw_mall.pojo.IndexImg;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.ArrayList;

/**
 * <p>
 * 轮播图  Mapper 接口
 * </p>
 *
 * @author wang
 * @since 2022-10-11
 */
public interface IndexImgMapper extends BaseMapper<IndexImg> {

    // 查询轮播图信息
    public ArrayList<IndexImg> getCarouselImg();

}

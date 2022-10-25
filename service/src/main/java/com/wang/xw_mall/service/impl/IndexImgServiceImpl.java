package com.wang.xw_mall.service.impl;

import com.wang.xw_mall.pojo.IndexImg;
import com.wang.xw_mall.mapper.IndexImgMapper;
import com.wang.xw_mall.service.IIndexImgService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wang.xw_mall.vo.ResStatus;
import com.wang.xw_mall.vo.ResultVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

/**
 * <p>
 * 轮播图  服务实现类
 * </p>
 *
 * @author wang
 * @since 2022-10-11
 */
@Service
public class IndexImgServiceImpl extends ServiceImpl<IndexImgMapper, IndexImg> implements IIndexImgService {

    @Resource
    IndexImgMapper indexImgMapper;

    @Override
    public ResultVo getCarouselImg() {

        ArrayList<IndexImg> carouselImg = indexImgMapper.getCarouselImg();

        return  carouselImg.size() > 0 ? new ResultVo(ResStatus.OK,"SUCCESS",carouselImg): new ResultVo(ResStatus.NO,"FAIL",null);
    }
}

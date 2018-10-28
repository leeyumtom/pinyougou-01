package com.pinyougou.service.impl;

import cn.itheima.mapper.BrandMapper;
import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service(interfaceClass = BrandService.class)
public class BrandServiceImp implements BrandService {
    @Autowired
    private BrandMapper brandMapper;
    public List<TbBrand> findAll() {
        List<TbBrand> list = brandMapper.Query();
        return list;
    }
}

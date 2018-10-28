package com.pinyougou.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.service.BrandService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/brand")
public class Controller {
    @Reference
    private BrandService brandService;

    @GetMapping("/finALL")
    public List<TbBrand> findAll(){
        List<TbBrand> all = brandService.findAll();

        return all;
    }

}

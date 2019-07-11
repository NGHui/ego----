package com.ego.dubbo.service.com.ego.dubbo.service;

import com.ego.pojo.TbItem;
import com.ego.pojo.TbItemCat;

import java.util.List;

/**
 * @author 辉
 *
 */
public interface TbItemCatDubboService {
    /**
     * 根据父类目id查询所有子类目
     * @param pid 父类id
     * @return 所有的子类的id
     */
    List<TbItemCat> show(long pid);

}

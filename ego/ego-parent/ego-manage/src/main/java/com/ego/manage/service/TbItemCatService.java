package com.ego.manage.service;

import com.ego.commons.pojo.EasyUiTree;

import java.util.List;

/**
 * @author 辉
 *
 */
public interface TbItemCatService {


    /**
     * 根据父菜单查询所有的子菜单
     * @param pid 父菜单的id
     * @return 子菜单的id
     */
    List<EasyUiTree> show(long pid);

}

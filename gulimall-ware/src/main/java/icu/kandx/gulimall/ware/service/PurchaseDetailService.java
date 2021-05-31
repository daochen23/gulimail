package icu.kandx.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import icu.kandx.common.utils.PageUtils;
import icu.kandx.gulimall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author Shaodi.kou
 * @email 79649931@qq.com
 * @date 2021-05-28 09:36:44
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


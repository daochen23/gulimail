package icu.kandx.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import icu.kandx.common.utils.PageUtils;
import icu.kandx.gulimall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author Shaodi.kou
 * @email 79649931@qq.com
 * @date 2021-05-28 09:44:04
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


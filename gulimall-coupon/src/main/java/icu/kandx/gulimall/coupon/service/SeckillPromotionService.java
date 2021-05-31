package icu.kandx.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import icu.kandx.common.utils.PageUtils;
import icu.kandx.gulimall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author Shaodi.kou
 * @email 79649931@qq.com
 * @date 2021-05-28 09:44:04
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


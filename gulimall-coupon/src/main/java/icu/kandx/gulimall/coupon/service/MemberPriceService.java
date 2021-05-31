package icu.kandx.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import icu.kandx.common.utils.PageUtils;
import icu.kandx.gulimall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author Shaodi.kou
 * @email 79649931@qq.com
 * @date 2021-05-28 09:44:04
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


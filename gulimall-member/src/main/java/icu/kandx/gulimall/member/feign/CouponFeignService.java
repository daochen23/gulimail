package icu.kandx.gulimall.member.feign;

import icu.kandx.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description: 远程调用Coupon
 * @Author Shaodi.kou
 * @Date 2021/5/26 15:12
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    @GetMapping("/coupon/coupon/member/list")
    R memberCoupons();
}

package icu.kandx.gulimall.order.dao;

import icu.kandx.gulimall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author Shaodi.kou
 * @email 79649931@qq.com
 * @date 2021-05-26 09:41:21
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}

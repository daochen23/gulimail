package icu.kandx.gulimall.member.dao;

import icu.kandx.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author Shaodi.kou
 * @email 79649931@qq.com
 * @date 2021-05-26 09:29:56
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}

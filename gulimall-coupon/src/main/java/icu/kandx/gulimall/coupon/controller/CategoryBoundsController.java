package icu.kandx.gulimall.coupon.controller;

import icu.kandx.common.utils.PageUtils;
import icu.kandx.common.utils.R;
import icu.kandx.gulimall.coupon.entity.CategoryBoundsEntity;
import icu.kandx.gulimall.coupon.service.CategoryBoundsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;



/**
 * 商品分类积分设置
 *
 * @author Shaodi.kou
 * @email 79649931@qq.com
 * @date 2021-05-28 09:44:04
 */
@RefreshScope
@RestController
@RequestMapping("coupon/categorybounds")
public class CategoryBoundsController {
    @Autowired
    private CategoryBoundsService categoryBoundsService;

    @Value("${person.name}")
    private String name;

    @Value("${person.age}")
    private Integer age;

    /**
     * 测试Nacos配置中心
     * @author Shaodi.kou
     * @date 2021/5/28 11:29
     * @return icu.kandx.common.utils.R
     */
    @GetMapping("test")
    public R test() {
        return R.ok().put("name", name).put("age", age);
    }

    /**
     * 列表
     */
    @GetMapping("/list")
    //@RequiresPermissions("coupon:categorybounds:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = categoryBoundsService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{id}")
    //@RequiresPermissions("coupon:categorybounds:info")
    public R info(@PathVariable("id") Long id){
		CategoryBoundsEntity categoryBounds = categoryBoundsService.getById(id);

        return R.ok().put("categoryBounds", categoryBounds);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    //@RequiresPermissions("coupon:categorybounds:save")
    public R save(@RequestBody CategoryBoundsEntity categoryBounds){
		categoryBoundsService.save(categoryBounds);

        return R.ok();
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    //@RequiresPermissions("coupon:categorybounds:update")
    public R update(@RequestBody CategoryBoundsEntity categoryBounds){
		categoryBoundsService.updateById(categoryBounds);

        return R.ok();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete")
    //@RequiresPermissions("coupon:categorybounds:delete")
    public R delete(@RequestBody Long[] ids){
		categoryBoundsService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}

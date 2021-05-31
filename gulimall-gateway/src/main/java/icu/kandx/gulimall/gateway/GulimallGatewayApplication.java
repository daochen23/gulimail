package icu.kandx.gulimall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

// 将网关注册到注册中心上去
@EnableDiscoveryClient
// 暂时没有用到数据源故排除
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class GulimallGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallGatewayApplication.class, args);
    }
}

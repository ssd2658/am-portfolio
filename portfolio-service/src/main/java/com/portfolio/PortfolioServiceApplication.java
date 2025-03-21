package com.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.scheduling.annotation.EnableAsync;

@ComponentScans({
    @ComponentScan("com.am.common.amcommondata"),
    @ComponentScan("com.am.common.amcommondata.service"),
    @ComponentScan("org.am.mypotrfolio.service.mapper"),
    @ComponentScan("com.am.common.amcommondata.mapper"),
    @ComponentScan("com.portfolio")
})
@EntityScan(basePackages = {
    "com.am.common.amcommondata.domain",
    "com.am.common.amcommondata.domain.asset",
    "com.am.common.amcommondata.domain.portfolio"
})
@SpringBootApplication
@EnableAsync
public class PortfolioServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(PortfolioServiceApplication.class, args);
    }
}

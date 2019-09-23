package com.ramesh.hytrix;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableHystrix
@EnableHystrixDashboard
@EnableCircuitBreaker
public class HytrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(HytrixApplication.class, args);
    }

    @Bean(name = "hystrixRegistrationBean")
    public ServletRegistrationBean<HystrixMetricsStreamServlet> hystrixDashboardServletRegistration() {
        ServletRegistrationBean<HystrixMetricsStreamServlet> servletRegistrationBean =
                new ServletRegistrationBean<>(new HystrixMetricsStreamServlet(), "/hystrix.stream");
        servletRegistrationBean.setName("hystrixServlet");
        servletRegistrationBean.setLoadOnStartup(1);
        return servletRegistrationBean;
    }

}

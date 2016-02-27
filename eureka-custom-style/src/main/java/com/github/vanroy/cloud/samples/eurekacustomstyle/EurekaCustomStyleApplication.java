package com.github.vanroy.cloud.samples.eurekacustomstyle;

import com.github.vanroy.cloud.dashboard.config.EnableCloudDashboard;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@EnableCloudDashboard
@EnableDiscoveryClient
public class EurekaCustomStyleApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaCustomStyleApplication.class, args);
	}

}

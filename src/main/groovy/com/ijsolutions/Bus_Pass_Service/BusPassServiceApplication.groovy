package com.ijsolutions.Bus_Pass_Service

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
class BusPassServiceApplication {

	static void main(String[] args) {
		SpringApplication.run(BusPassServiceApplication, args)
	}

}

package com.adil.urethra.race;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class RaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RaceApplication.class, args);
    }

}

package org.master.discover;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by kaenr on 2017/5/23.
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoverApplication {
    public static void main(String[] args) {
        SpringApplication.run(DiscoverApplication.class, args);
    }
}

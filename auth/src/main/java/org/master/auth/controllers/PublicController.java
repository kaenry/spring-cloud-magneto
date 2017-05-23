package org.master.auth.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kaenr on 2017/5/23.
 * PublicController
 */
@RestController
public class PublicController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/info")
    public String info() {
        return discoveryClient.description();
    }
}

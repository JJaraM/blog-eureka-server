package com.jjara.eureka;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import com.netflix.discovery.shared.Application;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Endpoint(id="services")
public class ServicesEndPoint {

    private final DiscoveryClient discoveryClient;

    public ServicesEndPoint(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    @ReadOperation
    public List<ServiceInstance> services() {
        List<String> services = this.discoveryClient.getServices();
        List<ServiceInstance> instances = new ArrayList<>();
        services.forEach(serviceName -> {
            this.discoveryClient.getInstances(serviceName).forEach(instance ->{
                instances.add(instance);
            });
        });
        return instances;
    }
}

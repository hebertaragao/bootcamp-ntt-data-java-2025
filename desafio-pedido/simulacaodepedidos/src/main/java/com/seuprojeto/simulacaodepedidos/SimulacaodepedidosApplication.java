package com.seuprojeto.simulacaodepedidos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SimulacaodepedidosApplication {
    public static void main(String[] args) {
        SpringApplication.run(SimulacaodepedidosApplication.class, args);
    }
}
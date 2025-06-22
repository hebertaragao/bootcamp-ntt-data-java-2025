package com.seuprojeto.catalogodeprodutos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CatalogodeprodutosApplication {
    public static void main(String[] args) {
        SpringApplication.run(CatalogodeprodutosApplication.class, args);
    }
}
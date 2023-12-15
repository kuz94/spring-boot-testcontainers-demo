package com.kuzminanton.spring.boot.testcontainers.demo.import_testcontainers;

import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;

public class ImportTestContainersTestConfiguration {

    @Container
    static PostgreSQLContainer container1 = new PostgreSQLContainer<>("postgres:16");

    @Container
    static PostgreSQLContainer container2 = new PostgreSQLContainer<>("postgres:16");

    @Container
    static PostgreSQLContainer container3 = new PostgreSQLContainer<>("postgres:16");
}

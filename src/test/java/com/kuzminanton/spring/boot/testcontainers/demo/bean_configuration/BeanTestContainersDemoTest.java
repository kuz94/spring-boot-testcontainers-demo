package com.kuzminanton.spring.boot.testcontainers.demo.bean_configuration;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(
        classes = BeanTestContainersTestConfiguration.class,
        properties = "spring.testcontainers.beans.startup=parallel"
)
public class BeanTestContainersDemoTest {

    @Test
    void contextLoads() {
    }
}

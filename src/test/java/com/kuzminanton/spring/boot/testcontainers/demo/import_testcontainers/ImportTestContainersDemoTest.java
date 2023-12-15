package com.kuzminanton.spring.boot.testcontainers.demo.import_testcontainers;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.testcontainers.context.ImportTestcontainers;

@SpringBootTest(
        properties = "spring.testcontainers.beans.startup=parallel"
)
@ImportTestcontainers(ImportTestContainersTestConfiguration.class)
class ImportTestContainersDemoTest {

    @Test
    void contextLoads() {
    }

}

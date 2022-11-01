package com.testdemo.demo.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.assertj.core.api.Assertions.assertThat;

//Test Repository
class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository empRepo;

    @Test
    void testExitEmail() {
        Employee emp = new Employee(
                "Iroshan",
                "Herath",
                "iroshan@gmail.com"
        );
        empRepo.save(emp);
        boolean result = empRepo.selectExitEmail("iroshan@gmail.com");
        assertThat(result).isTrue();
    }
}
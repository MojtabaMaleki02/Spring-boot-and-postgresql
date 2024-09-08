package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mojtaba = new Student(
                    "TILQ7Q",
                    "Mojtaba Maleki",
                    LocalDate.of(2002, 2, 11),
                    "Computer Science"
            );

            Student pouria = new Student(
                    "TIEP1B",
                    "Pouria Afshari",
                    LocalDate.of(2002, 8, 31),
                    "Computer Science"
            );

            repository.saveAll(List.of(mojtaba, pouria));
        };
    }
}

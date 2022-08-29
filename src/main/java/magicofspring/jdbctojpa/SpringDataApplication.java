package magicofspring.jdbctojpa;

import magicofspring.jdbctojpa.entity.Person;
import magicofspring.jdbctojpa.jpa.PersonJpaRepository;
import magicofspring.jdbctojpa.springjpa.PersonSpringDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner {

    @Autowired
    private PersonSpringDataRepository personJpaRepository;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {
        SpringApplication.run(SpringDataApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("User id 10001 -> {}", personJpaRepository.findById(10001));
        logger.info("Inserting id 10004 -> {}", personJpaRepository.save(new Person(10004, "Tara", "Berlin", new Date())));
        logger.info("Update 10003 - {}", personJpaRepository.save(new Person(10003, "Pieter", "Utrecht", new Date())));
        personJpaRepository.deleteById(10002);
        logger.info("All users -> {}", personJpaRepository.findAll());
    }
}

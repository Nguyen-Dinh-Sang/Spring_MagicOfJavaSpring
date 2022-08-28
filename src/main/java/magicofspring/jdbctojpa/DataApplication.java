package magicofspring.jdbctojpa;

import magicofspring.jdbctojpa.dao.PersonJdbcDao;
import magicofspring.jdbctojpa.entity.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DataApplication implements CommandLineRunner {

    @Autowired
    private PersonJdbcDao personJdbcDao;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {
        SpringApplication.run(DataApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("All users -> {}", personJdbcDao.findAll());
        logger.info("User id 10001 -> {}", personJdbcDao.findById(10001));
        logger.info("Deleting id 10002 -> No of row deleted - {}", personJdbcDao.deleteById(10002));
        logger.info("Inserting id 10004 -> {}", personJdbcDao.insert(new Person(10004, "Tara", "Berlin", new Date())));
        logger.info("Update 10003 - {}", personJdbcDao.update(new Person(10003, "Pieter", "Utrecht", new Date())));
    }
}

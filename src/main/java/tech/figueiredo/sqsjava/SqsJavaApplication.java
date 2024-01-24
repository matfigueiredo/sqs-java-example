package tech.figueiredo.sqsjava;

import io.awspring.cloud.sqs.operations.SqsTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tech.figueiredo.sqsjava.consumer.MyMessage;

@SpringBootApplication
public class SqsJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SqsJavaApplication.class, args);
    }

}
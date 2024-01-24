package tech.figueiredo.sqsjava.controller;

import io.awspring.cloud.sqs.operations.SqsTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.figueiredo.sqsjava.consumer.MyMessage;

@RestController
@RequestMapping("/send_message")
public class Producer {

    @Autowired
    private SqsTemplate sqsTemplate;

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody MyMessage myMessage) {
        var SQS = "http://localhost.localstack.cloud:4566/000000000000/my-queue";
        sqsTemplate.send(SQS, myMessage);

        System.out.println("Mensagem enviada para a fila: " + myMessage.content());

        return ResponseEntity.ok("Mensagem enviada com sucesso para a fila");
    }
}
# Example API connect with AWS SQS

This project demonstrates a simple Spring Boot application that integrates with Amazon Simple Queue Service (SQS) using LocalStack for local development. It provides an endpoint /send_message that allows you to send messages to an SQS queue.

## Pre requisits

- Java 11 or later
- Localstack AWS
- Docker installed 
- Docker Compose installed

## Installation

To use this project, you need to follow these steps:

1. Clone the repository: `git clone https://github.com/matfigueiredo/sqs-java-example`
2. Run LocalStack: `localstack start`
3. Update the AwsConfig class with the LocalStack endpoint
4. Run the application: `./mvnw spring-boot:run`

## Configuration

- LocalStack Endpoint: Update the AwsConfig class with the correct LocalStack endpoint.
- SQS Queue URL: Update the ProducerController class with the correct SQS queue URL.

## Logging

Messages sent to the SQS queue will be logged in the console.

## License

This project is licensed under the MIT License.
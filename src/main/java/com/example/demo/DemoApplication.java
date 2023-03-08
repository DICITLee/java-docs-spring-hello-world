package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
	/** Azure Cosmos DB endpoint URI. */
private static String endpointUri = "https://supplierinfor.documents.azure.com:443/";

/** Azure Cosmos DB primary key. */
private static String primaryKey = "rH5gW2kw0Qwlyj0Lp10gD9izLYlRymef9deFm8Ifd2latO1NHSpQLAyoD8VKisAgEk81nAvBv3C9ACDbRhVn2g==";
	
/** Azure Cosmos DB client instance. */
private static CosmosAsyncClient client;

/** Azure Cosmos DB database instance. */
private static CosmosAsyncDatabase database;

/** Azure Cosmos DB container instance. */
private static CosmosAsyncContainer container;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
	String sayHello() {
		return "Hello World! TEST001! ";
	}
}

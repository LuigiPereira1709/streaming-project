package com.pitanguiha.streaming;

import org.springframework.boot.SpringApplication;

public class TestStreamingApplication {

	public static void main(String[] args) {
		SpringApplication.from(StreamingApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}

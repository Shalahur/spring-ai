package com.spring.ai.ailearning.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public ChatClient chatClient(ChatClient.Builder chatClient) {
		return chatClient.build();
	}
}

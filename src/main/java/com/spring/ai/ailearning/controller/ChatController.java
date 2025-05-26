package com.spring.ai.ailearning.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Map;

@RestController
public class ChatController {

	private final ChatClient chatClient;

	@Value("classpath:prompts/celeb-details.st")
	private Resource celebPrompt;

	public ChatController(ChatClient chatClient) {
		this.chatClient = chatClient;
	}

	@GetMapping("/chat")
	public String ask(@RequestParam String message) {

		return chatClient.prompt(message).call().chatResponse().getResult().getOutput().getText();
	}


}

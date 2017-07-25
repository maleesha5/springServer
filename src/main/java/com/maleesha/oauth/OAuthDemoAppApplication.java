package com.maleesha.oauth;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@RequestMapping
public class OAuthDemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(OAuthDemoAppApplication.class, args);
	}

	@RequestMapping("/private")
	public @ResponseBody String getPrivate() {

		return "Accessing Private Content!!";
	}

	@RequestMapping("/")
	public @ResponseBody String user(Principal principal) {

		return "Welcome Home!!";
	}
}

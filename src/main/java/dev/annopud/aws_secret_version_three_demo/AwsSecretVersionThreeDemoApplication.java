package dev.annopud.aws_secret_version_three_demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AwsSecretVersionThreeDemoApplication implements CommandLineRunner {

	@Value("${my_user}")
	private String user;

	@Value("${my_password}")
	private String password;

	public static void main(String[] args) {
		SpringApplication.run(AwsSecretVersionThreeDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World");
		System.out.println("user: " + user);
		System.out.println("password: " + password);
	}

}

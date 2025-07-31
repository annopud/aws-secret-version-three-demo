package dev.annopud.aws_secret_version_three_demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(MyConfig2.class)
@ConfigurationPropertiesScan(basePackages = "dev.annopud.aws_secret_version_three_demo.config")
public class AwsSecretVersionThreeDemoApplication implements CommandLineRunner {

	@Value("${myconfig.user:default}")
	private String user;

	@Value("${myconfig.password:default}")
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

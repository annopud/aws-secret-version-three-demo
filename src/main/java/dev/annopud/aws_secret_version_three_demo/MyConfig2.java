package dev.annopud.aws_secret_version_three_demo;

import lombok.Data;
import lombok.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@ConfigurationProperties(prefix = "myconfig")
@RefreshScope
@Data
public class MyConfig2 {

    @Value
    public static class Eapi {
        String user;
        String password;
    }

    Eapi eapi;
}
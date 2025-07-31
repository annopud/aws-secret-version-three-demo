package dev.annopud.aws_secret_version_three_demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@ConfigurationProperties(prefix = "myconfig")
@RefreshScope
public class MyConfig {

    private String user;
    private String password;
    private String region;

    public MyConfig(String user, String password, String region) {
        this.user = user;
        this.password = password;
        this.region = region;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
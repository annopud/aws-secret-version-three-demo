package dev.annopud.aws_secret_version_three_demo.service;

import dev.annopud.aws_secret_version_three_demo.config.MyConfig;
import org.springframework.stereotype.Service;

@Service
public class SecretService {

    private final MyConfig myConfig;

    public SecretService(MyConfig myConfig) {
        this.myConfig = myConfig;
    }

    public String getUser() {
        return myConfig.getUser();
    }

    public String getPassword() {
        return myConfig.getPassword();
    }
}

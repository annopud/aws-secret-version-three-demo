package dev.annopud.aws_secret_version_three_demo.controller;

import dev.annopud.aws_secret_version_three_demo.MyConfig2;
import dev.annopud.aws_secret_version_three_demo.config.MyConfig;
import dev.annopud.aws_secret_version_three_demo.service.SecretService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final SecretService secretService;

    private final MyConfig myConfig;
    private final MyConfig2 myConfig2;

    public HelloController(SecretService secretService, MyConfig myConfig, MyConfig2 myConfig2) {
        this.secretService = secretService;
        this.myConfig = myConfig;
        this.myConfig2 = myConfig2;
    }

    @GetMapping("/hello")
    public String hello() {
        return """
            Hello World! 
            user: %s
            password: %s
            myConfig2.user: %s
            myConfig2.password: %s
            myConfig2.region: %s
            """.formatted(
            secretService.getUser(),
            secretService.getPassword(),
            myConfig2.getEapi().getUser(),
            myConfig2.getEapi().getPassword(),
            myConfig.getRegion()
        );
    }


}

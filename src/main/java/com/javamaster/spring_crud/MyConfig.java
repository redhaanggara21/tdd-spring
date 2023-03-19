package com.javamaster.spring_crud;
import org.springframework.boot.context.properties.ConfigurationProperties;
import lombok.Data;

@Data
@ConfigurationProperties(prefix = "my")
public class MyConfig {
    private String status;
    private String position;
    private String data_center;
    private String data_dir;
    private String log_level;
    private String bind_addr;
    private String client_addr;
}

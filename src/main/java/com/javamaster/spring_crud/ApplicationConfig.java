package com.javamaster.spring_crud;

// import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
// import org.springframework.stereotype.Component;

import lombok.Data;

// @Component
// @RefreshScope
@Data
@ConfigurationProperties("my")
public class ApplicationConfig {
    
    // @Value("${dataMessage}")
    // private String dataMessage;
    private String status;
    private String position;

    // public String getName() {
    //     return name;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    // public String getDataMessage() {
    //     return dataMessage;
    // }

    // public void setDataMessage(String dataMessage) {
    //     this.dataMessage = dataMessage;
    // }

}

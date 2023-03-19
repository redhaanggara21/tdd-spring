package com.javamaster.spring_crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RestController; 


@SpringBootApplication
@RestController
@EnableConfigurationProperties(
    ApplicationConfig.class
)
// public class SpringCrudApplication implements CommandLineRunner { 
public class SpringCrudApplication { 
    // private static final Logger logger = LoggerFactory.getLogger(Application.class); 
    
    // @Autowired private Environment env;

    // @Override public void run(String...args) throws Exception { 
    //     logger.info("{}", env.getProperty("spring.profiles")); 
    //     logger.info("{}", env.getProperty("spring.profiles.active")); 
    // }

    @Autowired
    ApplicationConfig applicationConfig;
    public static void main(String[] args) {
        SpringApplication.run(SpringCrudApplication.class, args);
        
        // new SpringApplicationBuilder(Application.class)
        //         .profiles("dev", "prod")
        //         .run(args);
    }
}

// @Component
// class MyRunner implements CommandLineRunner {

//     @Autowired
//     private Environment environment;

//     @Override
//     public void run(String... args) throws Exception {

//         System.out.println("Active profiles: " +
//                 Arrays.toString(environment.getActiveProfiles()));
//     }
// }

// @Component
// @Profile(value="dev")
// class MyRunner2 implements CommandLineRunner {

//     @Override
//     public void run(String... args) throws Exception {

//         System.out.println("In development");
//     }
// }

// @Component
// @Profile(value="prod & !dev")
// class MyRunner3 implements CommandLineRunner {

//     @Override
//     public void run(String... args) throws Exception {

//         System.out.println("In production");
//     }
// }

// @Component
// @Profile(value="local")
// class MyRunner4 implements CommandLineRunner {

//     @Override
//     public void run(String... args) throws Exception {

//         System.out.println("In local");
//     }
// }

// @Component
// @Profile(value={"dev & local"})
// class MyRunner5 implements CommandLineRunner {

//     @Override
//     public void run(String... args) throws Exception {

//         System.out.println("In development and local");
//     }
// }

// @Component
// @Profile(value={"dev", "prod"})
// class MyRunner6 implements CommandLineRunner {

//     @Value("${message}")
//     private String message;

//     @Override
//     public void run(String... args) throws Exception {

//         System.out.println("Message: " + message);
//     }
// }

//package com.paras.SwaggerImplementation.Configur;
//
//import io.swagger.v3.oas.annotations.security.SecurityRequirement;
//import io.swagger.v3.oas.models.OpenAPI;
//import io.swagger.v3.oas.models.info.Contact;
//import io.swagger.v3.oas.models.info.Info;
//import io.swagger.v3.oas.models.servers.Server;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.List;
//
//@Configuration
//public class SwaggerConfiguration {
//
//    @Bean
//    public OpenAPI myCustomConfig() {
//        return new OpenAPI()
//                .info(new Info()
//                        .title("Students API")
//                        .description("API for managing students, created by Paras")
//                        .summary("APIs for Create, Read, Update, and Delete operations")
//                        .contact(new Contact().name("Paras Yadav")
//                                .email("py080398@gmail.com"))
//                )
//                .servers(List.of(
//                        new Server().url("http://localhost:8081").description("Local Server"),
//                        new Server().url("http://localhost:8082").description("Live Server")
//                ))
//                .addSecurityItem(new SecurityRequirement().addList("auth"));;
//
//
//
//
//    }
//

//}
//
//
//
package com.paras.SwaggerImplementation.Configur;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SwaggerConfiguration {

    @Bean
    public OpenAPI myCustomConfig() {
        return new OpenAPI()
                .info(new Info()
                        .title("Students API")
                        .description("API for managing students, created by Paras")
                        .summary("APIs for Create, Read, Update, and Delete operations")
                        .contact(new Contact()
                                .name("Paras Yadav")
                                .email("py080398@gmail.com"))
                )
                .servers(List.of(
                        new Server().url("http://localhost:8081").description("Local Server"),
                        new Server().url("http://localhost:8082").description("Live Server")
                ))
                // Apply global security
                .addSecurityItem(new SecurityRequirement().addList("auth"));
    }
}

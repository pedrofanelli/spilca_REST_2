package configuration;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.example.demo","openfeign","controllers"})
@EnableFeignClients(basePackages= {"openfeign"})
public class ProjectConfig {

}

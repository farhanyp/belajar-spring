package belajar.spring.belajar_spring_dasar;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "belajar.spring.belajar_spring_dasar.configuration"
})
public class ScanConfiguration {



}

package belajar.spring.belajar_spring_dasar.configuration;

import belajar.spring.belajar_spring_dasar.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FooConfiguration {

    @Bean
    public Foo foo(){
        return new Foo();
    }
}

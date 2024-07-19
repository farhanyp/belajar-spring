package belajar.spring.belajar_spring_dasar;

import belajar.spring.belajar_spring_dasar.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public Foo foo(){
        Foo foo = new Foo();
        System.out.println("Create foo");
        return foo;
    }

}

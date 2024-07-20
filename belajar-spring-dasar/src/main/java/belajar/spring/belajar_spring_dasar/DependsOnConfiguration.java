package belajar.spring.belajar_spring_dasar;

import belajar.spring.belajar_spring_dasar.data.Bar;
import belajar.spring.belajar_spring_dasar.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class DependsOnConfiguration {

    @Bean
    @DependsOn({
            "bar"
    })
    public Foo foo(){
        System.out.println("Create new Foo");
        return new Foo();
    }

    @Bean
    public Bar bar(){
        System.out.println("Create new Bar");
        return new Bar();
    }

}


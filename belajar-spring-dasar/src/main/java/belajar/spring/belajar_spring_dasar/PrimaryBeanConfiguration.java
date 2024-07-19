package belajar.spring.belajar_spring_dasar;

import belajar.spring.belajar_spring_dasar.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class PrimaryConfiguration {

    @Primary
    @Bean
    public Foo foo1(){
        return new Foo();
    }

    @Bean
    public Foo foo2(){
        return new Foo();
    }
}

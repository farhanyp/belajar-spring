package belajar.spring.belajar_spring_dasar;

import belajar.spring.belajar_spring_dasar.data.Connection;
import org.springframework.context.annotation.Bean;

public class LifeCycleConfiguration {

    @Bean
    public Connection connection(){
        return  new Connection();
    }
}

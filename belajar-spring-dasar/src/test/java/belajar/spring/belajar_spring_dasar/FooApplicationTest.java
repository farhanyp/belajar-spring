package belajar.spring.belajar_spring_dasar;

import belajar.spring.belajar_spring_dasar.application.FooApplication;
import belajar.spring.belajar_spring_dasar.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = FooApplication.class)
public class FooApplicationTest {

    @Autowired
    Foo foo;

    @Test
    void testSpringBoot(){

        Assertions.assertNotNull(foo);

    }
}

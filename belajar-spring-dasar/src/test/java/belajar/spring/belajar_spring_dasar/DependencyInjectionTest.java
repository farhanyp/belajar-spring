package belajar.spring.belajar_spring_dasar;

import belajar.spring.belajar_spring_dasar.data.Bar;
import belajar.spring.belajar_spring_dasar.data.Foo;
import belajar.spring.belajar_spring_dasar.data.FooBar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    public void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(DependencyInjectionConfiguration.class);
    }

    @Test
    void TestDI(){

        Foo foo = applicationContext.getBean("fooSecond", Foo.class);
        Bar bar= applicationContext.getBean(Bar.class);
        FooBar foobar = applicationContext.getBean(FooBar.class);

        Assertions.assertSame(foo, foobar.getFoo());
        Assertions.assertSame(bar, foobar.getBar());


    }

}

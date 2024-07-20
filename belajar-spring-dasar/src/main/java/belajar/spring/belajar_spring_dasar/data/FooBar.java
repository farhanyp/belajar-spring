package belajar.spring.belajar_spring_dasar.data;

public class FooBar {

    public FooBar(Foo foo, Bar bar) {
        this.foo = foo;
        this.bar = bar;
    }

    private Foo foo;

    private Bar bar;

    public Foo getFoo() {
        return foo;
    }

    public void setFoo(Foo foo) {
        this.foo = foo;
    }

    public Bar getBar() {
        return bar;
    }

    public void setBar(Bar bar) {
        this.bar = bar;
    }

    @Override
    public String toString() {
        return "FooBar{" +
                "foo=" + foo +
                ", bar=" + bar +
                '}';
    }
}

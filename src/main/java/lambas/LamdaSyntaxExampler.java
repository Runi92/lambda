package lambas;

import anonymous.SomeInterface;

public class LamdaSyntaxExampler {
    public static void main(String[] args) {
        SomeInterface someInterface = () -> System.out.println("Hello!");
        doSomething(someInterface);
    }

    private static void doSomething(SomeInterface someInterface) {
        someInterface.someMethod();
    }
}

package anonymous;

public class Main {
    public static void main(String[] args) {
        SomeInterface someInterface = new SomeInterface() {
            @Override
            public void someMethod() {
                System.out.println("1");
            }
        };
        doSomething(someInterface);
    }

    private static void doSomething(SomeInterface someInterface) {
        someInterface.someMethod();
    }
}

package lambas;

public class MethodLinker {
    public static void main(String[] args) {

        double result = calc(Math :: sqrt, 9);
        System.out.println(result);
    }

    private static double calc(MyFuncInterface myFuncInterface, double d) {
        return myFuncInterface.calc(d);
    }
}

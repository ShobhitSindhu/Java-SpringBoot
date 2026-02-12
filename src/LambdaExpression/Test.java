package LambdaExpression;

public class Test {
    public static void main(String[] args) {

        Greeting g = () -> System.out.println("hello");
        g.greet();

        Washable w = (String b) -> {
            return "washing " + b;
        };

        String result = w.wash("shirt");
        System.out.println(result);
    }
}

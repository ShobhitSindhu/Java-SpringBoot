package ExceptionHandling;

public class Sample {
    public static void main(String[] args) {
        try {
            int x = 0;
            int y = 10;
            int z = y / x;   // ArithmeticException
            System.out.println(z);

            int[] num = new int[5];
            num[4] = 100;
        }
        catch (ArithmeticException e) {
            System.out.println("Cant divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException x) {
            System.out.println("Array issue");
        }
        catch (Exception x) {
            System.out.println("Array issue");
            System.out.println(x.getMessage());
        }
        finally {
            System.out.println("i will ");
        }
    }
}

package ExceptionHandling;

public class sampletest {
    public static void main(String[] args) {
        try {
            int x = 2;
            int y = 10;
            int z = y / x;
            System.out.println(z);

            int[] num = new int[5];
            num[4] = 100;   // valid index
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("i will");
        }
    }
}

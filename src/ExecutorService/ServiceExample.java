package ExecutorService;

import java.sql.SQLOutput;
import java.util.concurrent.Executor;
/*import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ServiceExample {

    public static void main(String[] args) {
        ExecutorService eServe1 = Executor.newFixedThreadPool(10);
        Future futu1 = eServe1.submit(()->{
            System.out.println("I am Triangle");
            for(int i=1;i<=4;i++)
            {
                for(int j=4;j>=i;j--){
                    System.out.println(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.println("* ");
                }
                System.out.println();
            }
        });
        Future<Integer>futu2 = eServe1.submit(()->{
            System.out.println("I printed");
            return 100+100+500+23;
        });
        try{
            Integer result = futu2.get(5, TimeUnit.SECONDS);
            System.out.println("The summation is "+result);
            SomeFunnyTask("having fun!");
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            //eServe1.shutdown();
        }
    }
    private static void SomeFunnyTask(String funnyname){
        System.out.println("I am not from ExecutorService "+funnyname);
    }
}
*/
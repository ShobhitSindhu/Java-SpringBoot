package Threading;

public class evenodd {

    static int i;

    public synchronized void printNum() {

        for (i = 0; i <= 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }

    public static class MyThread extends Thread {

        private evenodd obj;

        public MyThread(evenodd obj) {
            this.obj = obj;
        }

        @Override
        public void run() {
            obj.printNum();
        }
    }
}

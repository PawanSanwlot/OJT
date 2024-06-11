public class multithreadingex {
    public static void main(String[] args) {
        Thread th1 = new Thread(new MyRunnable("ADIT"));
        Thread th2 = new Thread(new MyRunnable("IBM"));
        th1.start();
        th2.start();
    }

    static class MyRunnable implements Runnable {
        private String threadName;

        public MyRunnable(String name) {
            this.threadName = name;
        }

        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(threadName + "running-" + i);
                /*
                 * try {
                 * Thread.sleep(5000);
                 * } catch (InterruptedException e) {
                 * e.printStackTrace();
                 * }
                 */
            }
        }
    }

}

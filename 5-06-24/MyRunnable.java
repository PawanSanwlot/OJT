public class MyRunnable implements{
    private String threadName;
    public MyRunnable(String name){
        this.threadName=name;
    }
    public void run(){
        for (int i=0; i<5; i++){
            System.out.println(threadName + "Running-" + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class multithreadingex {
    public static void main(String[] args) {
        Thread th1 = new Thread(new MyRunnable("ADIT"))
    }
}

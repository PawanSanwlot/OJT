class D implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("THIS IS MY CHILD THREAD");
        }
    }
}
class C {
    public static void main(String[] args) {
        D a = new D();
        Thread t = new Thread(a);
        t.start();
        for(int i=1; i<=5; i++){
            System.out.println("This is my main Thread");
        }
}
}
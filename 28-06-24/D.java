class A extends Thread{
    public void run()
    {
        for(int i=1; i<=5; i++)
        {
            try{
                System.out.println("NSTI");
                Thread.sleep(1000);
            } catch(InterruptedException e)
            {
                System.out.println("Thread A was interrupeted: " +e.getMessage());
            }
        }
    }
}

public class D {
    public static void main(String[] args) {
        A t = new A();
        t.start();
        for(int i= 1; i<5; i++)
        {
            try{
                System.out.println("I Love to travel");
                Thread.sleep(500);
            }
            catch (InterruptedException e){
                System.out.println("Main Thread was interrupted: " + e.getMessage());
            }
        }
    }
    
}
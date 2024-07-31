class Student {
    // Attributes
    String name;
    int age;
    String trade;
    int batch;
    
    //Constructor
    Student (String name, int age, int batch, String trade){
        this.name =name;
        this.age = age;
        this.batch = batch;
        this.trade = trade;
       
    }
    //method
   void displayInfo(){
       System.out.println("Student Info:");
       System.out.println("Name: "+ name);
       System.out.println("Age: " + age);
       System.out.println("Batch: " + batch);
       System.out.println("Trade: " + trade);
      
   }
}

public class Demo{
    public static void main (String[] args){
        //new object
        Student student1 = new Student ("Pavan", 24, 2022, "ADIT");
        
       student1.displayInfo();
    }
}
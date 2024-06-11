class rectangle{
  public  int lenght, breadth, area;
    // rectangle() {  //non-parametrized constructor
    //     System.out.println("Calculating the area of a rectangle");
    // }
    
    rectangle(int lenghth, int breadth){
       this.lenght= lenghth;
       this.breadth=breadth;
    }

    // void calarea(int lenght, int breadth) {
    //     area = lenght * breadth;
    //     System.out.println("There are of the rectangle is :" + area);
    // }
    void calarea(){
        area = lenght*breadth;
        System.out.println("The area of the rectangle is :" + area);
    }
}
public class constructorex {
public static void main(String[] args) {
    // rectangle rec = new rectangle();
    rectangle rect = new rectangle(12, 5);
    // rec.calarea(10, 25);
    rect.calarea();
    }
}
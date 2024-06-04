class rectangle {
    public int length, breadth, area;
    /*
     * rectangle(){ //non-parametrized constructor
     * System.out.println("------Calculating the area of a rectangle-------");
     * }
     */

    rectangle(int length, int breadth) { // paramertized constructors
        this.length = length;
        this.breadth = breadth;
    }

    /*
     * void calarea(int length, int breadth){
     * area=length*breadth;
     * System.out.println("The area of the rectangle is :"+ area);
     * }
     */
    void calarea() {
        area = length * breadth;
        System.out.println("The area of the rectangle is :" + area);
    }
}

public class constructorex {
    public static void main(String[] args) {
        // rectangle rec=new rectangle();
        rectangle rect = new rectangle(12, 5);
        // rec.calarea(10,25);
        rect.calarea();
    }
}

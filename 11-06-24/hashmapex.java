import java.util.*;
public class hashmapex {
    public static void main(String[] args) {
        HashMap<Integer,String> m1 = new HashMap<>();
        m1.put(1, "Apple");
        m1.put(2, "Mango");
        m1.put(3, "Grapes");

        System.out.println("Value at key 1:"+m1.get(1));
        for (Integer key:m1.keySet()){
            System.out.println("key:"+key+", value:"+m1.get(key));
        }
        System.out.println("----------------");
        m1.replace(3, "Grapes", "Watermelon");
        for (Integer key:m1.keySet()){
            System.out.println("key:" + key + ", value:" + m1.get(key));
        }
    }
}

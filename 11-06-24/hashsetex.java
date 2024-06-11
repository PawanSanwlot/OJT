import java.util.*;

public class hashsetex {
    public static void main(String[] args) {
        HashSet<String> s1 = new HashSet<>();
        s1.add("IBM");
        s1.add("TCS");
        s1.add("Infosys");
        s1.add("Wipro");
        s1.add("IBM");

        Iterator<String> itr = s1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        s1.remove("Wipro");
        System.out.println(s1);
    }
}

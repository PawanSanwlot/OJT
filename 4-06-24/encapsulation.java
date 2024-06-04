class employee {
    private String name;
    private int age;

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void ageinc() {
        age++;
    }

    public void agedec() {
        age--;
    }

    public int getAge() {
        return age;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        employee empobj = new employee();
        empobj.setName("Pavan");
        empobj.setAge(24);
        System.out.println(empobj.getName());
        empobj.ageinc();
        System.out.println(empobj.getAge());
        System.out.println("--------");
        empobj.agedec();
        System.out.println(empobj.getAge());

    }
}

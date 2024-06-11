import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnontation {
    String value();
}

public class customann {
    @MyAnnontation("Custom Annotation")
    public void annmethod() {
        System.out.println("This method is annotated");
    }

    public static void main(String[] args) throws Exception {
        customann obj = new customann();
        obj.annmethod();

        MyAnnontation ann = obj.getClass().getMethod("Method Annotated").getAnnotation(MyAnnontation.class);

        System.out.println("Annotation Value:" + ann.value());
    }
}

package BuilderDesignPattern.src.com.builder;

public class BuilderMain {
    public static void main(String args[]) {
        Phone p = new PhoneBuilder().setOs("Android").setBattery(100).getPhone();
        System.out.println(p);
    }
}

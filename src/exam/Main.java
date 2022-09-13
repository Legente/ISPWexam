package exam;

public class Main {
    public static void main(String[] args) throws Exception {
        SuperClass a = new SuperClass();
        SuperClass b = new SubClass();

        a.print();
        b.print();
    }
}

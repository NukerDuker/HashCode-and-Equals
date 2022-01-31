public class Main {

    public static void main(String[] args) {
        Test first = new Test(1, "First");
        Test second = new Test(1, "First");
        System.out.println(first.equals(second));
        System.out.println(first.hashCode());
        System.out.println(second.hashCode());
    }
}

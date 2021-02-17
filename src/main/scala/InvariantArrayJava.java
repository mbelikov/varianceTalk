public class InvariantArrayJava {

    public static void doSomething(Object[] array) {
        array[0] = 1233;
    }

    public static void main(String[] args) {
        String[] a = new String[1];

//        Object[] b = a;
//
//        b[0] = 123;

//        String str = a[0];

        doSomething(a);
    }
}

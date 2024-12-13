package inClassDemo.inner_classes;

public class Main {
    public int i = 4;
    public int getInt() {
        return 3;
    }
    static class NestedClass {
        public void innerMethod() {
//            int j = i; //compiler error
//            int k = getInt(); //compiler error
        }
    }
    public static void main(String[] args) {
        System.out.println("Starting");
    }
}

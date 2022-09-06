public class Main {
    public static void main(String[] args) {
        int one = 44;
        int two = 20;
        int three = 100;
        if (one>two&&one>three) {
            System.out.println("Первое число большее");
        } else if (two>one&&two>three) {
            System.out.println("Второе число большее");
        } else {
            System.out.println("Третье число большее");
        }
    }
}
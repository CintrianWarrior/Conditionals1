public class Main {
    public static void main(String[] args) {
        int childAge = 25;
        if (childAge >= 7 && childAge < 18) {
            System.out.println("Ты ходишь в школу");
        }
        if (childAge >=18 && childAge < 24) {
            System.out.println("Ты закончил школу, можешь поступать в университет");
        }
        if (childAge >= 24) {
            System.out.println("Ты окончил университет, пора искать первую работу");
        }
    }
}
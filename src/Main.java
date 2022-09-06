public class Main {
    public static void main(String[] args) {
        int childAge = 6;
        if (childAge >= 7 && childAge < 18) {
            System.out.println("Ты ходишь в школу");
        } else if (childAge >=18 && childAge < 24) {
            System.out.println("Ты закончил школу, можешь поступать в университет");
        } else if (childAge >=24){
            System.out.println("Ты окончил университет, пора искать первую работу");
        }
    }
}
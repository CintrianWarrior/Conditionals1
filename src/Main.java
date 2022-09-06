public class Main {
    public static void main(String[] args) {
        int age = 24;
        boolean kindergartenAge = age >= 2 && age <= 6;
        boolean schoolAge = age >= 7 && age <= 18;
        boolean universityAge = age > 18 && age < 24;
        boolean workAge = age >= 24;
        if (kindergartenAge) {
            System.out.println("Если возраст человека " + age + " то ему нужно ходить в детский сад");
        } else if (schoolAge) {
            System.out.println("Если возраст человека " + age + " то ему нужно ходить в школу");
        } else if (universityAge) {
            System.out.println("Если возраст человека " + age + " то ему нужно ходить в университет");
        } else if (workAge) {
            System.out.println("Если возраст человека " + age + " то ему пора ходить на работу");
        }
    }
}
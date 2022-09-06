public class Main {
    public static void main(String[] args) {
        int people = 102;
        if (people <= 60) {
            System.out.println("В вагоне есть сидячие места");
        }
        if (people < 102 && people > 60) {
            System.out.println("В вагоне есть стоячие места");
        }
        if (people >= 102) {
            System.out.println("Вагон полностью забит");
        }
    }
}
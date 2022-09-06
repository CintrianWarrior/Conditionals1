public class Main {
    public static void main(String[] args) {
        int people = 7;
        if (people <= 60) {
            System.out.println("В вагоне есть сидячие места");
        } else if (people > 102) {
            System.out.println("Вагон полностью забит");
        } else
            System.out.println("В вагоне есть стоячие места");
    }
}
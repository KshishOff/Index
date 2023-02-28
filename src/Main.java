public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double w = 91.2;
        double h = 1.81;
        double index = service.calculate(w, h);
        System.out.printf("Ваш индекс массы тела: " + "%.2f", index);
    }
}
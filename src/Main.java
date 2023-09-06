public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();
        int price = 15_000;
        int miles = service.calculate(price);
        System.out.println(miles);

    }
}

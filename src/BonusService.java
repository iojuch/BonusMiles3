public class BonusService {

    public int calculate(int price) {
        int bonus = 20;
        int miles = price / bonus;

        return miles;
    }
}

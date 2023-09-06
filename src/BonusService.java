public class BonusService {

    public int calculate(int price) {
        int bonus = 20;
        int miles = price / bonus;
        if (miles > 500) {
            miles = 500;
        }
        return miles;
    }
}

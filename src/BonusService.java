public class BonusService {
    public int calculate( int deposit  ) {
    int balance = 100;


    int percent;
        if (deposit >= 1000) {
        percent = 1;
    } else {
        percent = 0;

    }
    int bonus = deposit / 100 * percent;




        return bonus;
    }
}

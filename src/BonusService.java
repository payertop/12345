public class BonusService {
    public int calculate(boolean depositing, int deposit ) {
        int balance = 1000;

       int min = 1000;
       int sum = balance + deposit;
       int bonus = deposit / 100;
       int percent = depositing ? bonus : sum;
       int check = percent + sum;
       if (sum > min) {
       } else {
            check = sum;
      }

return bonus;
    }
}

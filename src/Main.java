public class Main {
    public static void main(String[] args) {

  BonusService service = new BonusService();
  int result = service.calculate(true,2000);
  System.out.println("Ваш бонус составляет :" +result+ " рублей ");
    }
}
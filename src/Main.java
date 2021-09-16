public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(10_000,20);
        System.out.println("Бонусные мили:" + miles);
    }
}

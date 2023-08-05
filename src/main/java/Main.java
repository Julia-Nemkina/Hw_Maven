public class Main {
    public static void main(String[] args){
        BonusService service = new BonusService();
        int bonus = service.calcBonus(3500, true);
        Sustem.out.println(bonus);
    }
}
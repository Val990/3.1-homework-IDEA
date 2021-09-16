public class BonusMilesService {
    public int calculate (int price, int rublesFor1Mile) {
        int miles = price / rublesFor1Mile;
        return miles;
    }
}

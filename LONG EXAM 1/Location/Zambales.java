package Location;
import Explorer.Tourist;

public class Zambales  implements Locations {
    
    int airFare = 300;

    public int getAirFare(){
        return airFare;
    }
    
    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}
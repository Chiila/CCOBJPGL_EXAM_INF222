package Location;
import Explorer.Tourist;

public class Siargao implements Locations {
    
    int airFare = 250;

    public int getAirFare(){
        return airFare;
    }
    
    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}

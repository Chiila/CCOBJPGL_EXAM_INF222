package Location;
import Explorer.Tourist;

public class Bohol implements Locations {
    
    int airFare = 200;

    public int getAirFare(){
        return airFare;
    }
    
    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}

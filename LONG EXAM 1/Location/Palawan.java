package Location;
import Explorer.Tourist;

public class Palawan implements Locations {
    
    int airFare = 150;

    public int getAirFare(){
        return airFare;
    }
    
    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}

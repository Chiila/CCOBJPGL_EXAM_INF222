package Location;
import Explorer.Tourist;

public class Batangas implements Locations {
    
    int airFare = 350;

    public int getAirFace(){
        return airFare;
    }

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}
package Location;
import Explorer.Tourist;

public class Boracay implements Locations {

    int airFare = 100;

    public int getAirFace(){
        return airFare;
    }

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}
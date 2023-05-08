package Explorer;
import Location.*;

public interface Tourist {

    int budget = 0;

    void visit();

    void visit(Boracay boracay);
    void visit(Palawan palawan);
    void visit(Bohol bohol);
    void visit(Siargao siargao);
    void visit(Zambales zambales);
    void visit(Batangas batangas);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}
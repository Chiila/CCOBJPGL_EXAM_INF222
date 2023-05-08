package Explorer;
import Location.*;

public class Cilla implements Tourist {

    static int budget = 1000;

    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }

    @Override
    public void visit(Boracay boracay) {
        if (this.budget - boracay.getAirFare() < 0){
            System.out.println("You don't have enough budget.");
        }else{
            System.out.println("Welcome to Boracay! <3");
            System.out.println("Enjoying my stay at Boracay!");
            budget -= boracay.getAirFare();
        }
        checkBudget();
        System.out.println("_____________________________");
    }

    public void visit(Palawan palawan) {
        if (this.budget - palawan.getAirFare() < 0){
            System.out.println("You don't have enough budget.");
        }else{
            System.out.println("Welcome to Palawan! <3");
            System.out.println("Enjoying my stay at Palawan!");
            budget -= palawan.getAirFare();
        }
        checkBudget();
        System.out.println("_____________________________");
    }

    public void visit(Bohol bohol) {
        if (this.budget - bohol.getAirFare() < 0){
            System.out.println("You don't have enough budget.");
        }else{
            System.out.println("Welcome to Bohol! <3");
            System.out.println("Enjoying my stay at Bohol!");
            budget -= bohol.getAirFare();
        }
        checkBudget();
        System.out.println("_____________________________");
    }

    public void visit(Siargao siargao) {
        if (this.budget - siargao.getAirFare() < 0){
            System.out.println("You don't have enough budget.");
        }else{
            System.out.println("Welcome to Siargao! <3");
            System.out.println("Enjoying my stay at Siargao!");
            budget -= siargao.getAirFare();
        }
        checkBudget();
        System.out.println("_____________________________");
    }

    public void visit(Zambales zambales) {
        if (this.budget - zambales.getAirFare() < 0){
            System.out.println("You don't have enough budget.");
        }else{
            System.out.println("Welcome to Zambales! <3");
            System.out.println("Enjoying my stay at Zambales!");
            budget -= zambales.getAirFare();
        }
        checkBudget();
        System.out.println("_____________________________");
    }

    public void visit(Batangas batangas) {
        if (this.budget - batangas.getAirFare() < 0){
            System.out.println("You don't have enough budget.");
        }else{
            System.out.println("Welcome to Batangas! <3");
            System.out.println("Enjoying my stay at Batangas!");
            budget -= batangas.getAirFare();
        }
        checkBudget();
        System.out.println("_____________________________");
    }
}
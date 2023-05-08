package Explorer;
import Location.*;

public class Cilla implements Tourist {

    static int budget = 10;

    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }

    @Override
    public void visit(Boracay boracay) {
        if (this.budget - boracay.getAirFace() < 0){
            System.out.println("You don't have enough budget.");
        }else{
            System.out.println("Welcome to Boracay! <3");
            System.out.println("Enjoying my stay at Boracay!");
            budget -= boracay.getAirFace();
        }
        checkBudget();
        System.out.println("_____________________________");
    }

    public void visit(Palawan palawan) {
        if (this.budget - palawan.getAirFace() < 0){
            System.out.println("You don't have enough budget.");
        }else{
            System.out.println("Welcome to Palawan! <3");
            System.out.println("Enjoying my stay at Palawan!");
            budget -= palawan.getAirFace();
        }
        checkBudget();
        System.out.println("_____________________________");
    }

    public void visit(Bohol bohol) {
        if (this.budget - bohol.getAirFace() < 0){
            System.out.println("You don't have enough budget.");
        }else{
            System.out.println("Welcome to Bohol! <3");
            System.out.println("Enjoying my stay at Bohol!");
            budget -= bohol.getAirFace();
        }
        checkBudget();
        System.out.println("_____________________________");
    }

    public void visit(Siargao siargao) {
        if (this.budget - siargao.getAirFace() < 0){
            System.out.println("You don't have enough budget.");
        }else{
            System.out.println("Welcome to Siargao! <3");
            System.out.println("Enjoying my stay at Siargao!");
            budget -= siargao.getAirFace();
        }
        checkBudget();
        System.out.println("_____________________________");
    }

    public void visit(Zambales zambales) {
        if (this.budget - zambales.getAirFace() < 0){
            System.out.println("You don't have enough budget.");
        }else{
            System.out.println("Welcome to Zambales! <3");
            System.out.println("Enjoying my stay at Zambales!");
            budget -= zambales.getAirFace();
        }
        checkBudget();
        System.out.println("_____________________________");
    }

    public void visit(Batangas batangas) {
        if (this.budget - batangas.getAirFace() < 0){
            System.out.println("You don't have enough budget.");
        }else{
            System.out.println("Welcome to Batangas! <3");
            System.out.println("Enjoying my stay at Batangas!");
            budget -= batangas.getAirFace();
        }
        checkBudget();
        System.out.println("_____________________________");
    }
}
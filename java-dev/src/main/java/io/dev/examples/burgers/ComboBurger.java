package io.dev.examples.burgers;

public class ComboBurger extends Hamburger {

    private String addChips;
    private String addCoke;

    public ComboBurger(String meat, double price) {
        super("Combo Burger", meat, price, "Multigrain");
        super.addHamburgerAddition1("Chips", 0.67);
        super.addHamburgerAddition2("Coke", 0.49);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("CANNOT ADD");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("CANNOT ADD");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("CANNOT ADD");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("CANNOT ADD");
    }
}

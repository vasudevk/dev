package io.dev.examples.burgers;

public class VeganBurger extends Hamburger {

    private String veganExtra1Name;
    private double veganExtra1Price;

    private String veganExtra2Name;
    private double veganExtra2Price;

    public VeganBurger(String meat, double price) {
        super("Vegan Burger", meat, price, "Brown rye");
    }

    public void addVeganAddition1(String name, double price) {
        this.veganExtra1Name = name;
        this.veganExtra1Price = price;
    }

    public void addVeganAddition2(String name, double price) {
        this.veganExtra2Name = name;
        this.veganExtra2Price = price;
    }

    @Override
    public double itemizedHamburger() {
        double veganBurgerPrice = super.itemizedHamburger();

        if (null != this.veganExtra1Name) {
            veganBurgerPrice += this.veganExtra1Price;
            System.out.println("Added " + this.veganExtra1Name + " for an extra " + this.veganExtra1Price);
        }

        if (null != this.veganExtra2Name) {
            veganBurgerPrice += this.veganExtra2Price;
            System.out.println("Added " + this.veganExtra2Name + " for an extra " + this.veganExtra2Price);
        }

        return veganBurgerPrice;
    }
}

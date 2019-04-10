public class Spartan extends Human{

    private Integer extraTolerance;

    public Spartan(Integer extraTolerance) {
        this.extraTolerance = extraTolerance;
    }

    public Spartan(String name, Integer age, Integer weight, Urinate urinate, Drink drink, Integer extraTolerance) {
        super(name, age, weight, urinate, drink);
        this.extraTolerance = extraTolerance;
    }

    public Integer getExtraTolerance() {
        return extraTolerance;
    }

    public void setExtraTolerance(Integer extraTolerance) {
        this.extraTolerance = extraTolerance;
    }

    @Override
    public String toString() {
        return "Spartan{" +
                " Nombre = " + super.getName() +
                " Edad = " + super.getAge() +
                " Peso = " + super.getWeight() +
                " ToleranciaExtra = " + extraTolerance +
                '}';
    }

    public void executeDrink(){
        super.getDrink().drink(getExtraTolerance());
    }

    public void executreUrinate(){
        super.getUrinate().urinate(getExtraTolerance());
    }
}

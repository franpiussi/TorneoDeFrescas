package models;
import interfaces.Drink;
import interfaces.Urinate;


public class FinalBoss extends Human {

    private Integer extraTolerance;
    private Integer professionalDrinker;

    public FinalBoss(Integer extraTolerance, Integer professionalDrinker) {
        this.extraTolerance = extraTolerance;
        this.professionalDrinker = professionalDrinker;
    }

    public FinalBoss(String name, Integer age, Integer weight, Urinate urinate, Drink drink, Integer extraTolerance, Integer professionalDrinker) {
        super(name, age, weight, urinate, drink);
        this.extraTolerance = extraTolerance;
        this.professionalDrinker = professionalDrinker;
    }

    public Integer getExtraTolerance() {
        return extraTolerance;
    }

    public void setExtraTolerance(Integer extraTolerance) {
        this.extraTolerance = extraTolerance;
    }

    public Integer getProfessionalDrinker() {
        return professionalDrinker;
    }

    public void setProfessionalDrinker(Integer professionalDrinker) {
        this.professionalDrinker = professionalDrinker;
    }

    @Override
    public void Drink() {
        int l = getLife() - getDrink().drink() + this.extraTolerance + this.professionalDrinker;
        setLife(l);
    }

    @Override
    public void Urinate() {
        int l = getLife() - getUrinate().urinate() +  this.extraTolerance + this.professionalDrinker;
        setLife(l);
    }

    @Override
    public String toString() {
        return "FinalBoss{" +
                " Nombre = " + super.getName() +
                " Edad = " + super.getAge() +
                " Peso = " + super.getWeight() +
                "extraTolerance=" + extraTolerance +
                ", professionalDrinker=" + professionalDrinker +
                '}';
    }
}

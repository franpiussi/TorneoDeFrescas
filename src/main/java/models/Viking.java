package models;

import interfaces.Drink;
import interfaces.Urinate;

public class Viking extends Human {
    private Integer professionalDrinker;

    public Viking(Integer professionalDrinker) {
        super();
        this.professionalDrinker = professionalDrinker;
    }

    public Viking(String name, Integer age, Integer weight, Urinate urinate, Drink drink, Integer professionalDrinker) {
        super(name, age, weight, urinate, drink);
        this.professionalDrinker = professionalDrinker;
    }

    public Integer getProfessionalDrinker() {
        return professionalDrinker;
    }

    public void setProfessionalDrinker(Integer professionalDrinker) {
        this.professionalDrinker = professionalDrinker;
    }

    @Override
    public String toString() {
        return "Viking{" +
                " Nombre = " + super.getName() +
                " Edad = " + super.getAge() +
                " Peso = " + super.getWeight() +
                " BebedorProfesional = " + this.professionalDrinker +
                '}';
    }

    @Override
    public void Drink() {
        int l = getLife() - getDrink().drink() + this.professionalDrinker;
        setLife(l);
    }

    @Override
    public void Urinate() {
        int l =  getLife() - getUrinate().urinate() + professionalDrinker;
        setLife(l);
    }

  /* public void executeDrink(){
       int l = getLife() - getDrink().drink() + getProfessionalDrinker();
       setLife(l);
    }

    public void executeUrinate(){
        int l =  getLife() - getUrinate().urinate() + getProfessionalDrinker();
        setLife(l);
    }*/

}

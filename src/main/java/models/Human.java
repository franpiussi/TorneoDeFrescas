package models;
import interfaces.Drink;
import interfaces.Urinate;

public class Human {

    private String name;
    private Integer age;
    private Integer weight;
    private Urinate urinate;
    private Drink drink;
    private Integer life;

    public Human(){

    }

    public Human(String name, Integer age, Integer weight, Urinate urinate, Drink drink) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.urinate = urinate;
        this.drink = drink;
        this.life = 100;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Urinate getUrinate() {
        return urinate;
    }

    public void setUrinate(Urinate urinate) {
        this.urinate = urinate;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public Integer getLife() {
        return life;
    }

    public void setLife(Integer life) {
        this.life = life;
    }

    public int Drink(){
        return getDrink().drink();
    }

    public int Urinate(){
        return getUrinate().urinate();
    }
}

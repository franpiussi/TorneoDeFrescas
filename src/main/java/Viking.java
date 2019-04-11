public class Viking extends Human {
    private Integer ProfessionalDrinker;

    public Viking(Integer professionalDrinker) {
        super();
        ProfessionalDrinker = professionalDrinker;
    }

    public Viking(String name, Integer age, Integer weight, Urinate urinate, Drink drink, Integer professionalDrinker) {
        super(name, age, weight, urinate, drink);
        ProfessionalDrinker = professionalDrinker;
    }

    public Integer getProfessionalDrinker() {
        return ProfessionalDrinker;
    }

    public void setProfessionalDrinker(Integer professionalDrinker) {
        ProfessionalDrinker = professionalDrinker;
    }

    @Override
    public String toString() {
        return "Viking{" +
                " Nombre = " + super.getName() +
                " Edad = " + super.getAge() +
                " Peso = " + super.getWeight() +
                " BebedorProfesional = " + ProfessionalDrinker +
                '}';
    }


    public void executeDrink(){
        super.getDrink().drink();
    }

    public void executreUrinate(){
        super.getUrinate().urinate();
    }

}

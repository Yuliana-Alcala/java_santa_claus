package models;

public class GoodToy extends Toy{

    private String brand;
    private int age;
    private String category;
    private static int idGood;

    public GoodToy( String title, String brand, int age, String category) {
        super(title);
        this.brand = brand;
        this.age = age;
        this.category = category;
        setId("B" + idGood++);
        
    }

    @Override
    public String toString() {
        return "GoodToy{id='" + id + "',Título='" + title + "',Marca='" + brand + "', Edad Recomendada = '" + age + "', categoría=" + category + "}";
    }


    

    

}

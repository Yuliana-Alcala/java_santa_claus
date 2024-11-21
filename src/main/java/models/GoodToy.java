package models;

public class GoodToy extends Toy{

    private String brand;
    private int age;
    private String category;
    

    public GoodToy(int id,String title, String brand, int age, String category) {
        super(id, title);
        this.brand = brand;
        this.age = age;
        this.category = category;
        setId(id);
        
    }
    public GoodToy(String title, String brand, int age, String category) {
        super(title);
        this.brand = brand;
        this.age = age;
        this.category = category;
    }

    
    @Override
    public void setId(int id) {

        this.id = "B" + id;
       
    }

    @Override
    public String toString() {
        return "GoodToy{id='" + id + "',Título='" + title + "',Marca='" + brand + "', Edad Recomendada = '" + age + "', categoría=" + category + "}";
    }
}

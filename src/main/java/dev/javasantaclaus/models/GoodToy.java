package dev.javasantaclaus.models;

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
        return 
        "  Id = '" + id + "',\n" +
        "  Título = '" + title + "',\n" +
        "  Marca = '" + brand + "',\n" +
        "  Edad Recomendada = '" + age + "',\n" +
        "  Categoría = " + category + "\n" 
        ;
    }
    public String getBrand() {
        return brand;
    }
    public int getAge() {
        return age;
    }
    public String getCategory() {
        return category;
    }
}

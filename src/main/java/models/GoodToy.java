package models;

public class GoodToy extends Toy{

    private String brand;
    private int age;
    private String category;

    public GoodToy(String id, String title, String brand, int age, String category) {
        super(id, title);
        this.brand = brand;
        this.age = age;
        this.category = category;
    }

}

package models;

public class Toy {
    protected String id;
    protected String title;

    public Toy(int id, String title) {

        this.title = title;
    }

    public Toy(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(int id) {
        this.id = "" + id ;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}

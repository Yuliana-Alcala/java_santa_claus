package models;

public class BadToy extends Toy{

    private String content;

    
    public BadToy(int id, String title, String content) {
        super(id, title);
        this.content = content;
        setId(id);
    }

    public BadToy(String title, String content) {
        super(title);
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    @Override
    public void setId(int id) {

        this.id = "B" + id;
       
    }

    @Override
    public String toString() {
        return "BadToy{id='" + id + "',Título='" + title + "', Contenido='" + content + " }";
    }
    
  


}

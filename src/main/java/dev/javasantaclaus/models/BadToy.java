package dev.javasantaclaus.models;

public class BadToy extends Toy {

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

        this.id = "M" + id;

    }

    @Override
    public String toString() {

        return "  id = '" + id + "',\n" +
               "  Título = '" + title + "',\n" +
               "  Contenido = '" + content + "',\n";

    }

}

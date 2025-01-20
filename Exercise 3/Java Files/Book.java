public class Book {
    //attributes
    private String name;
    private String author;
    private int published;

    //behaviour
    //name
    public String getName() {
        return name;
    }
    public void setName(String newName){
        name = newName;
    }

    //author
    public String getAuthor() {
        return name;
    }
    public void setAuthor(String newAuthor){
        author = newAuthor;
    }

    //year published
    public int getPublished() {
        return published;
    }
    public void setPublished(int newPublished){
        published = newPublished;
    }


    //no-argument constructor
    public Book() {
        this.name = "Ranger's Apprentice";
        this.author = "John Flanagan";
        this.published = 2004;
    }
    
}

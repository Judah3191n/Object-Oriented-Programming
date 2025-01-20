public class Car {
    //attributes
    private String name;
    private String color;
    private int model;

    //behaviour
    public String getName() {
        return name;
    }
    public void setName(String newName){
        name = newName;
    }


    //parameterized constructor
    public Car(String name, String color, int model) {
        this.name = name;
        this.color = color;
        this.model = model;
    }
}

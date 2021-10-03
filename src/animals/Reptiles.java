package animals;

public class Reptiles extends Animal {

    //Variable
    private Double tempCorporal;
    private String color;
    private Double velocidad;

    //Constructor
    public Reptiles(String nombre, int edad, String genero, Double tempCorporal, String color, Double velocidad) {
        super(nombre, edad, genero);
        this.tempCorporal = tempCorporal;
        this.color = color;
        this.velocidad = velocidad;
    }
}

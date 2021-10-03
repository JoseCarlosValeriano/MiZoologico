package animals;

public class Aves extends Animal{

    //Variables
    private int altitud;
    private String color;
    private String tipoPata;

    //Constructor
    public Aves(String nombre, int edad, String genero, int altitud, String color, String tipoPata) {
        super(nombre, edad, genero);
        this.altitud = altitud;
        this.color = color;
        this.tipoPata = tipoPata;
    }
}

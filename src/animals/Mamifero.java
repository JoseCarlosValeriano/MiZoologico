package animals;

public class Mamifero extends Animal {

    //Variables
    private int peso;
    private boolean diurNoctur;
    private int desplazamiento;
    private String dieta;

    //Constructor
    public Mamifero(String nombre, int edad, String genero, int peso, boolean diurNoctur, int desplazamiento, String dieta) {
        super(nombre, edad, genero);
        this.peso = peso;
        this.desplazamiento = desplazamiento;
        this.dieta = dieta;
        this.diurNoctur = diurNoctur;
    }
}

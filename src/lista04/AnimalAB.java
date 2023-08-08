package questao01;

public abstract class AnimalAB implements AnimalIF{
private int comidaIngerida = 0;
private int caminhoPercorrido = 0;
private int horasDormidas = 0;
private String nome;
private String tipoAnimal;
private int idade;
private String habitat;

    @Override
    public void comer(double comidaIngerida) {
        System.out.println("O animal está comendo.");
        this.comidaIngerida += comidaIngerida;
        System.out.println("O animal comeu " + comidaIngerida + " gramas de comida.");
    }

    @Override
    public void dormir(double horasDormidas) {
        System.out.println("O animal está dormindo.");
        this.horasDormidas += horasDormidas;
        System.out.println("O animal dormiu por " + horasDormidas + " horas.");
    }

    @Override
    public void moverse(double caminhoPercorrido) {
        System.out.println("O animal está se movendo.");
        this.caminhoPercorrido += caminhoPercorrido;
        System.out.println("O animal percorreu "+ caminhoPercorrido + " metros");
    }


}



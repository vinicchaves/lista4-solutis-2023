package lista04;

public abstract class AnimalAB implements AnimalIF{
protected double comidaIngerida;
protected double caminhoPercorrido;
protected double horasDormidas;
protected String nome;
protected String tipoAnimal;
protected int idade;
protected String habitat;
protected double altura;
protected double peso;
protected int quantidadeCaminhoPercorrido = 1;
protected int quantidadeVezesComeu = 1;
protected int quantidadeVezesDormidas = 1;


    public abstract void comer();
    public abstract void dormir();
    public abstract void moverse();
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
       this.nome = nome;
    }
    public String getTipoAnimal() {
        return tipoAnimal;
    }
    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }
    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getComidaIngerida() {

        return comidaIngerida * quantidadeVezesComeu;
    }
    public void setComidaIngerida(int comidaIngerida) {
        this.comidaIngerida = comidaIngerida;
    }
    public double getDistanciaPercorrida() {
        return caminhoPercorrido * quantidadeCaminhoPercorrido; }
    public void setCaminhoPercorrido(int caminhoPercorrido) {
        this.caminhoPercorrido = caminhoPercorrido;
    }
    public double getHorasDormidas() {
        return horasDormidas * quantidadeVezesDormidas;
    }
    public void setHorasDormidas(double horasDormidas) {
        this.horasDormidas = horasDormidas;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + getNome() + "\nIdade: " + getIdade() + "\nPeso (kg): " + getPeso()+ "\nAltura (m): " + getAltura()+ "\nHabitat: " + getHabitat()+ "\nTipo de Animal: " + getTipoAnimal() + "\nQuantidade que comeu (gramas): " + getComidaIngerida() + "\nDistância percorrida (metros): " + getDistanciaPercorrida() + "\nQuantidade de horas dormidas: " + getHorasDormidas());

    }


}



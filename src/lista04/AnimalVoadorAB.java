package lista04;

public abstract class AnimalVoadorAB extends AnimalAB{
    public int quantidadeAsas;
    public double envergaduraAsas;


    public int getQuantidadeAsas() {
        return quantidadeAsas; }

    public void setQuantidadeAsas(int quantidadeAsas) {
        this.quantidadeAsas = quantidadeAsas;
    }

    public double getEnvergaduraAsas() {
        return envergaduraAsas;
    }

    public void setEnvergaduraAsas(double envergaduraAsas) {
        this.envergaduraAsas = envergaduraAsas;
    }
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Quantidade de Asas:" + getQuantidadeAsas());
        System.out.println("Envergadura das Asas (metros):" + getEnvergaduraAsas());
    }
}

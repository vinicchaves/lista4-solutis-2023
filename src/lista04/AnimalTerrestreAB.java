package lista04;

public abstract class AnimalTerrestreAB extends AnimalAB{

    public int quantidadePatas;

    public int getQuantidadePatas(){
        return quantidadePatas;
        }
    public void setQuantidadePatas (int quantidadePatas){
        this.quantidadePatas = quantidadePatas;
    }

    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Quantidade de patas: " + getQuantidadePatas());
    }
}

package lista04;

public abstract class AnimalMarinhoAB extends AnimalAB{
    public int quantidadeNadadeiras;

    public abstract void nadar();


    public int getQuantidadeNadadeiras(){
        return quantidadeNadadeiras;
    }
    public void setQuantidadeNadadeiras(int quantidadeNadadeiras){
        this.quantidadeNadadeiras = quantidadeNadadeiras;
    }


    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Quantidade de Nadadeiras:" + getQuantidadeNadadeiras());
    }

}
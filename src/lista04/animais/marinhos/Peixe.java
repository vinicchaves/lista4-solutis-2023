package lista04.animais.marinhos;
import lista04.*;

public class Peixe extends AnimalMarinhoAB{

     @Override
    public void comer() {

        this.quantidadeVezesComeu++;
    }

    @Override
    public void moverse() {
        this.quantidadeCaminhoPercorrido++;
    }

    @Override
    public void dormir() {

        this.quantidadeVezesDormidas++;
    }

    public void nadar(){
         this.quantidadeCaminhoPercorrido++;
    }

}
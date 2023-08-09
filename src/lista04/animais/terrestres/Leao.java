package lista04.animais.terrestres;
import lista04.*;


public class Leao extends AnimalTerrestreAB {

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

}
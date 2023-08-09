package lista04.animais.voadores;
import lista04.*;
public class Pombo extends AnimalVoadorAB {
    public void voar() {
        this.quantidadeCaminhoPercorrido++;
    }
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

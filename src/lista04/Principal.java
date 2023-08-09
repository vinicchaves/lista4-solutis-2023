package lista04;
import lista04.animais.terrestres.*;
import lista04.animais.voadores.*;
import lista04.animais.marinhos.*;


public class Principal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Elefante elefante = new Elefante();
        Gato gato = new Gato();
        Leao leao = new Leao();
        Pombo pombo = new Pombo();
        Peixe peixe = new Peixe();

        System.out.println("\nCachorro:");
        cachorro.setNome("Dogão");
        cachorro.setPeso(14);
        cachorro.setIdade(2);
        cachorro.setHabitat("Doméstico");
        cachorro.setTipoAnimal("Terrestre");
        cachorro.setAltura(1);
        cachorro.setCaminhoPercorrido(200);
        cachorro.setHorasDormidas(8);
        cachorro.setComidaIngerida(200);
        cachorro.setQuantidadePatas(4);
        cachorro.moverse();
        cachorro.comer();
        cachorro.dormir();
        cachorro.exibirInformacoes();

        System.out.println("\nPombo:");
        pombo.setNome("Max");
        pombo.setPeso(14);
        pombo.setIdade(1);
        pombo.setHabitat("Campo");
        pombo.setTipoAnimal("Voador");
        pombo.setAltura(0.3);
        pombo.setCaminhoPercorrido(2000);
        pombo.setHorasDormidas(5);
        pombo.setComidaIngerida(200);
        pombo.setQuantidadeAsas(2);
        pombo.setEnvergaduraAsas(0.5);
        pombo.dormir();
        pombo.moverse();
        pombo.comer();
        pombo.voar();
        pombo.exibirInformacoes();

        System.out.println("\nPeixe:");
        peixe.setNome("Dori");
        peixe.setPeso(1);
        peixe.setIdade(2);
        peixe.setHabitat("Oceano");
        peixe.setTipoAnimal("Aquático");
        peixe.setAltura(0.3);
        peixe.setCaminhoPercorrido(5000);
        peixe.setHorasDormidas(5);
        peixe.setComidaIngerida(200);
        peixe.setQuantidadeNadadeiras(2);
        peixe.dormir();
        peixe.moverse();
        peixe.comer();
        peixe.nadar();
        peixe.exibirInformacoes();

        System.out.println("\nGato:");
        gato.setNome("Gatolino");
        gato.setPeso(5);
        gato.setIdade(4);
        gato.setHabitat("Doméstico");
        gato.setTipoAnimal("Terrestre");
        gato.setAltura(0.4);
        gato.setCaminhoPercorrido(30);
        gato.setHorasDormidas(14);
        gato.setComidaIngerida(650);
        gato.setQuantidadePatas(4);
        gato.moverse();
        gato.comer();
        gato.dormir();
        gato.exibirInformacoes();

        System.out.println("\nElefante:");
        elefante.setNome("Elefantão");
        elefante.setPeso(1000);
        elefante.setIdade(8);
        elefante.setHabitat("Selva");
        elefante.setTipoAnimal("Terrestre");
        elefante.setAltura(5);
        elefante.setCaminhoPercorrido(2500);
        elefante.setHorasDormidas(6);
        elefante.setComidaIngerida(3000);
        elefante.setQuantidadePatas(4);
        elefante.moverse();
        elefante.comer();
        elefante.dormir();
        elefante.exibirInformacoes();

        System.out.println("\nLeão:");
        leao.setNome("Aslan");
        leao.setPeso(190);
        leao.setIdade(5);
        leao.setHabitat("Selva");
        leao.setTipoAnimal("Terrestre");
        leao.setAltura(2);
        leao.setCaminhoPercorrido(1000);
        leao.setHorasDormidas(8);
        leao.setComidaIngerida(2500);
        leao.setQuantidadePatas(4);
        leao.moverse();
        leao.comer();
        leao.dormir();
        leao.exibirInformacoes();


    }
}

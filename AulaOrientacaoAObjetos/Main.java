package aula13;

import aula12.cachorro;

public class Main {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Lobo lobo = new Lobo();

        cachorro.emitirSom();
        lobo.emitirSom();

        cachorro.reagir(false);

    }
}

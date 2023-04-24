package br.edu.catolica.sub_liskov.Model;

public class Cachorro extends Animal{
    @Override
    public void emitirSom(){
        System.out.println("Au Au");
    }
}

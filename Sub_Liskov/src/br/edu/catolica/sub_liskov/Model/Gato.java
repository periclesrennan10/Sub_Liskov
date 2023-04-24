package br.edu.catolica.sub_liskov.Model;

public class Gato extends Animal{
    @Override
    public void emitirSom(){
        System.out.println("Miauu");
    }
}

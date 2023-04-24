package br.edu.catolica.sub_liskov.Model;

public class AnimalSelvagem extends Animal{
    @Override
    public void emitirSom(){
        System.out.println("Rugido");
    }

}

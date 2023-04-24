package br.edu.catolica.sub_liskov.Main;
import br.edu.catolica.sub_liskov.Model.*;

public class Main {
    public static void emitirSons(Animal[] animais) {
        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
    public static void main(String[] args) {
        Animal[] animais = {new Cachorro(), new Gato(), new AnimalSelvagem()};
        emitirSons(animais);
    }
}
package Classes.Felino;

import Classes.Animale;

import java.time.LocalDate;
import java.util.Date;

public class Felino extends Animale {

    private double lunghezzaCoda;

    public Felino(String name, String favouriteFood, int age, LocalDate dateJoinZoo, double weight, double height, double lunghezzaCoda) {
        super(name, favouriteFood, age, dateJoinZoo, weight, height);
        this.lunghezzaCoda = lunghezzaCoda;
    }

    public double getLunghezzaCoda() {
        return lunghezzaCoda;
    }

    public void setLunghezzaCoda(double lunghezzaCoda) {
        this.lunghezzaCoda = lunghezzaCoda;
    }
}

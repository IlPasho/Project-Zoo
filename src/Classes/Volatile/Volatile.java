package Classes.Volatile;

import Classes.Animale;

import java.time.LocalDate;
import java.util.Date;

public class Volatile extends Animale {
    private double aperturaAlare;

    public Volatile(String name, String favouriteFood, int age, LocalDate dateJoinZoo, double weight, double height, double aperturaAlare) {
        super(name, favouriteFood, age, dateJoinZoo, weight, height);
        this.aperturaAlare = aperturaAlare;
    }

    public double getAperturaAlare() {
        return aperturaAlare;
    }

    public void setAperturaAlare(double aperturaAlare) {
        this.aperturaAlare = aperturaAlare;
    }

}

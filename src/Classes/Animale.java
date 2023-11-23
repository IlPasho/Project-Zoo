package Classes;

import java.time.LocalDate;
import java.util.Date;

public class Animale {
    private String name;
    private String favouriteFood;
    private int age;
    private LocalDate dateJoinZoo;
    private double weight;
    private double height;

    public Animale(String name, String favouriteFood, int age, LocalDate dateJoinZoo, double weight, double height) {
        this.name = name;
        this.favouriteFood = favouriteFood;
        this.age = age;
        this.dateJoinZoo = dateJoinZoo;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateJoinZoo() {
        return dateJoinZoo;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDateJoinZoo(LocalDate dateJoinZoo) {
        this.dateJoinZoo = dateJoinZoo;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

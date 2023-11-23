import Classes.Felino.Felini.Leone;
import Classes.Felino.Felini.Tigre;
import Classes.Volatile.Volatili.Aquila;
import Manager.ZooManager;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Tigre tigre1 = new Tigre("Nerina", "latte", 16, LocalDate.of(2020, 07, 11), 191.8, 1.05, 0.86);
        Tigre tigre2 = new Tigre("Arty", "pollo", 8, LocalDate.of(2023, 07, 20), 266.7, 1.00, 0.71);
        Tigre tigre3 = new Tigre("Tony", "pizza surgelata", 18, LocalDate.of(2020, 10, 16), 221.7, 0.91, 1.09);
        Leone leone1 = new Leone("Papa", "ovino", 12, LocalDate.of(2022, 10, 07), 137.9, 0.85, 1.03);
        Leone leone2 = new Leone("Rosso", "formaggio", 20, LocalDate.of(2023, 06, 15), 165.9, 1.09, 0.99);
        Leone leone3 = new Leone("Astro", "bovino", 9, LocalDate.of(2021, 10, 15), 124.7, 1.12, 0.71);
        Aquila aquila1 = new Aquila("Yugi", "suino", 9, LocalDate.of(2022, 11, 03), 6.0, 0.91, 2.21);
        Aquila aquila2 = new Aquila("Killua", "tacchino", 14, LocalDate.of(2023, 02, 17), 5.4, 0.96, 1.88);
        Aquila aquila3 = new Aquila("Gabbana", "pasta", 14, LocalDate.of(2023, 04, 28), 4.4, 0.94, 2.15);

        ZooManager zooManager = new ZooManager();

        zooManager.addTiger(tigre1);
        zooManager.addTiger(tigre2);
        zooManager.addTiger(tigre3);
        zooManager.addLion(leone1);
        zooManager.addLion(leone2);
        zooManager.addLion(leone3);
        zooManager.addEagles(aquila1);
        zooManager.addEagles(aquila2);
        zooManager.addEagles(aquila3);

        System.out.println(zooManager.getHighestLion().getName() + "\n");
        System.out.println(zooManager.getShortestLion().getName() + "\n");
        System.out.println(zooManager.getHeaviestTiger().getName() + "\n");
        System.out.println(zooManager.getLightestEagle().getName() + "\n");
        System.out.println(zooManager.getLongestTail().getName() + "\n");
        System.out.println(zooManager.getWidestWings().getName() + "\n");

    }
}
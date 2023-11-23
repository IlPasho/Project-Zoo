package Manager;

import Classes.Animale;
import Classes.Felino.Felini.Leone;
import Classes.Felino.Felini.Tigre;
import Classes.Felino.Felino;
import Classes.Volatile.Volatile;
import Classes.Volatile.Volatili.Aquila;
import java.util.ArrayList;
import java.util.List;

public class ZooManager {

    private List<Tigre> tigri;
    private List<Leone> leoni;
    private List<Aquila> aquile;

    public ZooManager() {
        this.tigri = new ArrayList<>();
        this.leoni = new ArrayList<>();
        this.aquile = new ArrayList<>();
    }

    public void addTiger(Tigre tiger) {
        tigri.add(tiger);
    }

    public void addLion(Leone lion) {
        leoni.add(lion);
    }

    public void addEagles(Aquila eagle) {
        aquile.add(eagle);
    }

    public Tigre getHighestTiger() {
        Tigre tigerResult = null;
        double max = 0;

        for (Tigre tigre : tigri) {
            if (tigre.getHeight() > max) {
                max = tigre.getHeight();
                tigerResult = tigre;
            }
        }
        return tigerResult;
    }

    public Leone getHighestLion() {
        Leone lionResult = null;
        double max = 0;

        for (Leone leone : leoni) {
            if (leone.getHeight() > max) {
                max = leone.getHeight();
                lionResult = leone;
            }
        }
        return lionResult;
    }

    public Aquila getHigestEagle() {
        Aquila eagleResult = null;
        double max = 0;

        for (Aquila aquila : aquile) {
            if (aquila.getHeight() > max) {
                max = aquila.getHeight();
                eagleResult = aquila;
            }
        }
        return eagleResult;
    }

    public Tigre getShortestTiger() {
        Tigre tigerResult = tigri.getFirst();

        if(tigri.getFirst() != null) {
            for (Tigre tigre : tigri) {
                if (tigre.getHeight() < tigerResult.getHeight()) {
                    tigerResult = tigre;
                }
            }
        }
        return tigerResult;
    }

    public Leone getShortestLion() {
        Leone lionResult= leoni.getFirst();

        if(leoni.getFirst() != null) {
            for (Leone leone : leoni) {
                if (leone.getHeight() < lionResult.getHeight()) {
                    lionResult = leone;
                }
            }
        }
        return lionResult;
    }

    public Aquila getShortestEagle() {
        Aquila eagleResult = aquile.getFirst();

        if(aquile.getFirst() != null) {
            for (Aquila aquila : aquile) {
                if (aquila.getHeight() < eagleResult.getHeight()) {
                    eagleResult = aquila;
                }
            }
        }
        return eagleResult;
    }

    public Tigre getHeaviestTiger() {
        Tigre tigerResult = null;
        double max = 0;

        for (Tigre tigre : tigri) {
            if (tigre.getWeight() > max) {
                max = tigre.getWeight();
                tigerResult = tigre;
            }
        }
        return tigerResult;
    }

    public Leone getHeaviestLion() {
        Leone lionResult = null;
        double max = 0;

        for (Leone leone : leoni) {
            if (leone.getWeight() > max) {
                max = leone.getWeight();
                lionResult = leone;
            }
        }
        return lionResult;
    }

    public Aquila getHeaviestEagle() {
        Aquila eagleResult = null;
        double max = 0;

        for (Aquila aquila : aquile) {
            if (aquila.getWeight() > max) {
                max = aquila.getWeight();
                eagleResult = aquila;
            }
        }
        return eagleResult;
    }

    public Tigre getLightestTiger() {
        Tigre tigerResult = tigri.getFirst();

        if(tigri.getFirst() != null) {
            for (Tigre tigre : tigri) {
                if (tigre.getWeight() < tigerResult.getWeight()) {
                    tigerResult = tigre;
                }
            }
        }
        return tigerResult;
    }

    public Leone getLightestLion() {
        if (leoni.isEmpty()) {
            return null;
        }

        Leone lionResult= leoni.getFirst();

        for (Leone leone : leoni) {
            if (leone.getWeight() < lionResult.getWeight()) {
                lionResult = leone;
            }
        }
        return lionResult;
    }

    public Aquila getLightestEagle() {
        Aquila eagleResult = aquile.getFirst();

        if(aquile.getFirst() != null) {
            for (Aquila aquila : aquile) {
                if(aquila.getWeight() < eagleResult.getWeight()) {
                    eagleResult = aquila;
                }
            }
        }
        return eagleResult;
    }

    public Felino getLongestTail() {
        List<Felino> felini = new ArrayList<>();

        felini.addAll(tigri);
        felini.addAll(leoni);

        Felino felinoResult = felini.getFirst();

        if(felini.getFirst() != null) {
            for (Felino felino : felini) {
               if(felino.getLunghezzaCoda() > felinoResult.getLunghezzaCoda()) {
                   felinoResult = felino;
               }
            }
        }
        return felinoResult;
    }

    public Volatile getWidestWings() {
        List<Volatile> volatili = new ArrayList<>();

        volatili.addAll(aquile);

        Volatile birdResult = volatili.getFirst();

        if(volatili.getFirst() != null) {
            for (Volatile bird : volatili) {
                if(bird.getAperturaAlare() > birdResult.getAperturaAlare()) {
                    birdResult = bird;
                }
            }
        }
        return birdResult;
    }
}

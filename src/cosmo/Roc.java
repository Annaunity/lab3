package cosmo;

import cosmo.Movements;
import cosmo.Outskirts;
import cosmo.Place;

public class Roc extends Place implements Movements {
    public Roc(String name, Outskirts outskirts) {
        super(name, outskirts);
    }
    @Override
    public String Fly(Place f) {
        return "Ракета пролетела мимо " + f.getName() + " " + f.outskirts.getOutskirts();
    }
    @Override
    public String Fly1(Place a) {
        return "Ракета пролетела мимо " + a.getName() + " " + a.outskirts.getOutskirts();
    }
    @Override
    public String Fly2(Place b) {
        return "Ракета нашла " + b.getName() + " " + b.outskirts.getOutskirts() + " удобную для посадки";
    }
}
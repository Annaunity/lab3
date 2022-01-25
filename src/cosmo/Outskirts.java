package cosmo;

import human.Decisions;

public enum Outskirts {
    FIELDS("Поля"),
    FOREST("Леса"),
    GLADE("Полянка");

    private final String outskirts;

    Outskirts(String outskirts) {
        this.outskirts = outskirts;
    }
    public String getOutskirts() {
        return outskirts;
    }
}

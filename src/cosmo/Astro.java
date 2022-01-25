package cosmo;

public class Astro extends CosmoObj implements AstroAct {
    public Astro(String name, int count) {
        super(name, count);
    }

    @Override
    public String Notsurprised(CosmoObj a, CosmoObj r, CosmoObj c) {
        return a.getName() + " не были удивлены появлению " + r.getName() + " над городом " + c.getName();
    }

    @Override
    public String Spot(CosmoObj a, CosmoObj r) {
        return "В свое время " + a.getName() + " засекли куда прилунилась " + r.getName();
    }

    @Override
    public String Looking(CosmoObj t, CosmoObj r) {
        return t.getCount() + " " + t.getName() + " наблюдали за " + r.getName();
    }
    @Override
    public String Land(CosmoObj r) {
        return r.getName() + " оперлась хвостом о почву и остановилась в вертикальном положении";
    }
}


import cosmo.*;
import human.Police;
import human.Spritz;
import human.Znaika;

public class Main {
    public static void main(String[] args) {
        Spritz spritz = new Spritz("Спрутс", 45);
        Znaika znaika = new Znaika("Знайка", 27);
        Police police = new Police("Полиция", 35);
        City city = new City("Фантомас", 1);
        Rocket rocket = new Rocket("Ракета", 1);
        Astro astro = new Astro("Лунные астронавты", 150);
        Telescopes telescopes = new Telescopes("Гравитонных телескопов", 30);
        Roc roc = new Roc("Локации", Outskirts.FOREST);
        Place place = new Place("Локации", Outskirts.FIELDS);
        Glade glade = new Glade("Локацию", Outskirts.GLADE);
        System.out.println(astro.Notsurprised(astro, rocket, city));
        System.out.println(astro.Spot(astro, rocket));
        System.out.println(astro.Looking(telescopes, rocket));
        System.out.println(spritz.Know(spritz));
        System.out.println(spritz.Command(spritz, police));
        System.out.println(police.Working(police, znaika));
        System.out.println(znaika.Search(znaika));
        System.out.println(roc.Fly(place));
        System.out.println(roc.Fly1(roc));
        System.out.println(roc.Fly2(glade));
        System.out.println(znaika.Landing(znaika));
        System.out.println(astro.Land(rocket));

    }
}

package human;

public class Znaika extends AbsHuman implements Actions{
    public Znaika(String name, int age) {
        super(name, age);
    }

    @Override
    public String Search(AbsHuman z) {
        return z.getName() + " начал подыскивать удобное место для посадки";
    }
    @Override
    public String Landing(AbsHuman z) {
        return z.getName() + " начал приземление";
    }
}
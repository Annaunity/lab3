package human;

public class Spritz extends AbsHuman implements Decisions {
    public Spritz(String name, int age) {
        super(name, age);
    }

    @Override
    public String Know(AbsHuman s) {
        return s.getAge() + "-ти летний " + s.getName() + " узнал, что космический корабль прилунился";
    }

    @Override
    public String Command(AbsHuman s, AbsHuman p) {
        return s.getName() + " отдал приказ " + p.getName();
    }
}


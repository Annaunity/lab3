package human;

public class Police extends AbsHuman implements Work{
    public Police(String name, int age) {
        super(name, age);
    }

    @Override
    public String Working(AbsHuman p, AbsHuman z) {
        return p.getName() + " " + "была поднята на ноги как только корабрь " + z.getName() + " появился над Фантомасом";
    }
}
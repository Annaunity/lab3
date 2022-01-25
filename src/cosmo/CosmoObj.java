package cosmo;

public abstract class CosmoObj {
    private final String name;
    private final int count;

    public CosmoObj(String name, int count) {
        this.name = name;
        this.count = count;
    }
    public String getName() {
        return name;
    }
    public int getCount() {
        return count;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CosmoObj that = (CosmoObj) o;
        return java.util.Objects.equals(name + this.hashCode(), that.name + that.hashCode());
    }
    @Override
    public String toString() {
        return name;
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, count);
    }
}


package az.iktlab.javasiplessons.lesson14.gc;

public class Human {

    public Human() {
        System.out.println("Constructor for Human");
    }

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("GC is running now");
    }
}

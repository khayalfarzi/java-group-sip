package az.iktlab.javasiplessons.lesson15.generic;

public class Type<T> {
    private T element;

    public Object getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "Number{" +
                "element='" + element + '\'' +
                '}';
    }
}

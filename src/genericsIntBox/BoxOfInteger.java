package genericsIntBox;

public class BoxOfInteger<T> {
    private T element;

    public BoxOfInteger(T element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return this.element.getClass().getName()+" : "+this.element;
    }
}

package Exercice1.metier;
import java.util.ArrayList;
import java.util.List;

public class StorageGenerique<T> {
    private List<T> elements = new ArrayList();

    public StorageGenerique() {
    }

    public void addElement(T o) {
        this.elements.add(o);
    }

    public T getElement(int index) {
        if (index >= 0 && index < this.elements.size()) {
            return this.elements.get(index);
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    public void removeElement(int index) {
        if (index >= 0 && index < this.elements.size()) {
            this.elements.remove(index);
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    public int getSize() {
        return this.elements.size();
    }
}

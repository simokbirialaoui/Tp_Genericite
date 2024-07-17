package Exercice2.metier;
import java.util.List;

public interface IMetier<T, U> {
    void add(T var1);

    List<T> getAll();

    T findById(U var1);

    void delete(U var1);
}
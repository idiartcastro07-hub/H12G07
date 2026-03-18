package c.ejercicio3_6;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal[name=" + name + "]";
    }
}

// Aqui no podemos hacer una llamada a greets() porque esta función solo esta definida en cat y dog
// Sin embargo, en Cat si que podriamos coger otros metodos de Animal porque Cat esta incluido dentro de Animal
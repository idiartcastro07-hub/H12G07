package d.ejerciciosclase7;

public class TestMain7 {
    public static void main(String[] args) {
        // Using the subclasses
        //Creamos gato, perro y bigdog que saluden
        cat cat1 = new cat();
        cat1.greeting();//saludo gato
        dog dog1 = new dog();
        dog1.greeting();//saludo perro
        bigdog bigdog1 = new bigdog();
        bigdog1.greeting();//saludo perro

        // Using Polymorphism
        //Con el polimorfismo creamos gato, perro y bigdog en la clase abstracta animal lo cual permite adueñarse de su respectiva clase a la que se define
        animal animal1 = new cat();
        animal1.greeting();//saludo gato
        animal animal2 = new dog();
        animal2.greeting();//saludo dog
        animal animal3 = new bigdog();
        animal3.greeting();//saludo bigdog
        //animal animal4 = new animal(); Error, la clase animal es abstracta

        // Downcast/herencia
        dog dog2 = (dog)animal2;//animal2 era dog original
        bigdog bigdog2 = (bigdog)animal3;//animal3 era bigdog herencia de dog
        dog dog3 = (dog)animal3;//animal3 era dog original
        cat cat2 = (cat)animal2;//animal2 no es un cat original
        //Saludos de los dogs y bigdogs
        dog2.greeting(dog3);
        dog3.greeting(dog2);
        dog2.greeting(bigdog2);
        bigdog2.greeting(dog2);
        bigdog2.greeting(bigdog1);
    }
}



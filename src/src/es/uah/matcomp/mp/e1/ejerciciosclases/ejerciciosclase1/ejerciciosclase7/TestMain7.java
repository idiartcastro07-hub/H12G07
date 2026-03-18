package src.es.uah.matcomp.mp.e1.ejerciciosclases.ejerciciosclase1.ejerciciosclase7;

public class TestMain7 {
    public static void main(String[] args) {
        // Using the subclasses
        cat cat1 = new cat();
        cat1.greeting();
        dog dog1 = new dog();
        dog1.greeting();
        bigdog bigdog1 = new bigdog();
        bigdog1.greeting();

        // Using Polymorphism
        animal animal1 = new cat();
        animal1.greeting();
        animal animal2 = new dog();
        animal2.greeting();
        animal animal3 = new bigdog();
        animal3.greeting();
        //animal animal4 = new animal(); Error, la clase animal es abstracta

        // Downcast
        dog dog2 = (dog)animal2;
        bigdog bigdog2 = (bigdog)animal3;
        dog dog3 = (dog)animal3;
        cat cat2 = (cat)animal2;
        dog2.greeting(dog3);
        dog3.greeting(dog2);
        dog2.greeting(bigdog2);
        bigdog2.greeting(dog2);
        bigdog2.greeting(bigdog1);
    }
}



package b.introduccion;

public class TestAuthor {
    public static void main(String[] args) {
        //Author
        author ahTeck = new author("Tan Ah Teck", "ahteck@nowhere.com", 'm'); // Test the constructor
        System.out.println(ahTeck);  // Test toString()
        ahTeck.setEmail("paulTan@nowhere.com");  // Test setter
        System.out.println("name is: " + ahTeck.getName());
    // Test getter
        System.out.println("eamil is: " + ahTeck.getEmail());
    // Test getter
        System.out.println("gender is: " + ahTeck.getGender()); // Test

        //Book
        //Crea un libro y calcula los datos con sus respectivos metodos y los muestra
        book b1 = new book("12345", "Java for dummies", a1, 8.8, 88);
        System.out.println(b1);
        b1.setPrice(9.9);
        b1.setQty(99);
        System.out.println(b1);
        System.out.println("isbn is: " + b1.getIsbn());
        System.out.println("name is: " + b1.getName());
        System.out.println("price is: " + b1.getPrice());
        System.out.println("qty is: " + b1.getQty());
        System.out.println("author is: " + b1.getAuthor());  // Author's toString()
        System.out.println("author's name: " + b1.getAuthorname());
        System.out.println("author's name: " + b1.getAuthor().getName());
        System.out.println("author's email: " + b1.getAuthor().getEmail());

    }
}

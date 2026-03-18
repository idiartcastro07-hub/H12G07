package b;

import b.ejerciciosclases2.account;
import b.ejerciciosclases2.customer;

public class TestMain2 {
    public static void main() {
        // Test Customer class
        //Crear customer con los datos propuestos y calcular los metodos especificados
        customer c2 = new customer(111, "Lola",'m');
        System.out.println(c2);  // Customer's toString()
        System.out.println("id is: " + c2.getId());
        System.out.println("name is: " + c2.getName());
        System.out.println("gender is: " + c2.getGender());
        // Test Invoice class
        //Crear invoice con un account donde con los datos propuestos calcule los metodos establecido en la clase
        account acc1 = new account(101, c2, 888.8);
        System.out.println(acc1);
        acc1.setBalance(999.9);
        System.out.println(acc1);
        System.out.println("id is: " + acc1.getId());
        System.out.println("customer is: " + acc1.getCustomer());  // Customer's toString()
        System.out.println("balance is: " + acc1.getBalance());
        System.out.println("customer's name is: " + acc1.getCustomerName());
        account a1 = new account(43, c2, 100);
        System.out.println("Deposit is: " +a1.deposit(289));
        System.out.println("Withdraw is: " +a1.withdraw(67));

    }

}

// 
// 
// 
// Run time polymorphism
// 
// 
// 

class Customer {
    private String id, name;

    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public double payBill(double totalPrise) {
        System.out.println("customer class call");
        return totalPrise;
    }
}

class RegularCustomer extends Customer {
    private double discount;

    public RegularCustomer(String id, String name) {
        super(id, name);
        this.discount = 5.0;
    }

    public double payBill(double totalPrise) {
        System.out.println("Regular customer class call ");
        double priseAfterDiscount = totalPrise * (1 - (discount / 100));
        return priseAfterDiscount;
    }
}

public class MethodOverriding {
    public static void main(String[] args) {

        // customer class onject create
        Customer obj1 = new Customer("21cs43", "kishan");
        double amount1 = obj1.payBill(40.0);
        System.out.println("final bill amount is " + amount1);

        // RegularCustomer class onject create
        Customer obj2 = new RegularCustomer("21cs44", "keshave");
        double amount2 = obj2.payBill(40.0);
        System.out.println("final bill amount is " + amount2);
    }
}

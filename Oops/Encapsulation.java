
// Q.1 without setter and getter function
// private data is not access
class Customer {
    public int id;
    public String name;
    private long number;
    public String address;

    void displayDetail() {
        System.out.println("enter employee detail");
        System.out.println("customer id : " + id);
        System.out.println("customer name : " + name);
        System.out.println("customer address : " + address);
        System.out.println("customer number : " + number);
        System.out.println();
    }
}

public class Encapsulation {
    public static void main(String[] var) {
        Customer customer = new Customer();
        customer.id = 1001;
        customer.name = "kishan sharma";
        customer.number = 73574125; // this line generate error
        customer.address = "plot no 19 ARG city ajmer ";
        customer.displayDetail();
    }
}

//
//
//
//
//

// Q.2 with setter and getter function
// when we use setter and getter method we are access a private data
// memberoutside the class
class Customer {
    public int id;
    public String name;
    private long number;
    public String address;

    public int getid() {
        return id;
    }

    public String getname() {
        return name;
    }

    public long getnumber() {
        return number;
    }

    public String getaddress() {
        return address;
    }

    public void setid(int id) {
        this.id = id;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setnumber(long number) {
        this.number = number;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    void displayDetail() {
        System.out.println("enter employee detail");
        System.out.println("customer id : " + customer.getid());
        System.out.println("customer name : " + customer.getname());
        System.out.println("customer address : " + customer.getnumber());
        System.out.println("customer number : " + customer.getaddress());
        System.out.println();
    }

}

class Tester {
    public static void main(String[] a) {
        Customer customer = new Customer();
        customer.setid(1);
        customer.setname("kishan");
        customer.setnumber(735741);
        customer.setaddress("arg city ajmer");
        customer.displayDetail();

        // use a displayDetail() method
        // System.out.println("enter employee detail");
        // System.out.println("customer id : " + customer.getid());
        // System.out.println("customer name : " + customer.getname());
        // System.out.println("customer address : " + customer.getnumber());
        // System.out.println("customer number : " + customer.getaddress());
        // System.out.println();

    }
}

//
//
//
//
//

// Q.3 another example

class Employee {

    private String employeeId;
    private String employeeName;
    private int salary;
    private int bonus;
    private int jobLevel;

    public void calculateSalary() {
        if (this.jobLevel >= 4) {
            this.bonus = 100;
        } else {
            this.bonus = 50;
        }
        this.salary += this.bonus;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(int jobLevel) {
        this.jobLevel = jobLevel;
    }
}

class Tester {

    public static void main(String args[]) {

        Employee employee = new Employee();
        employee.setEmployeeId("C101");
        employee.setEmployeeName("Steve");
        employee.setSalary(650);
        employee.setJobLevel(4);

        employee.calculateSalary();

        System.out.println("Employee Details");
        System.out.println("Employee Id: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.println("Salary: " + employee.getSalary());

    }
}
package model;

public class Staff extends User {
    private double salary;
    private String department;

    public Staff(String id, String name, String phone, String email,
            String address, String username, String password,
            double salary, String department) {
        super(id, name, phone, email, address, username, password);
        this.salary = salary;
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

package model;

public class Employee extends Staff {
    private double bonus;

    public Employee(String id, String name, String phone, String email,
            String address, String username, String password,
            double salary, String department, double bonus) {
        super(id, name, phone, email, address, username, password,
                salary, department);
        if (Double.isNaN(bonus) || Double.isInfinite(bonus) || bonus < 0) {
            throw new IllegalArgumentException("Bonus must be a non-negative number");
        }
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        if (bonus >= 0) {
            this.bonus = bonus;
        }
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }
}

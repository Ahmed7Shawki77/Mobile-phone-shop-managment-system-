package model;

public class Admin extends Staff {
    private String adminId;

    public Admin(String id, String name, String phone, String email,
            String address, String username, String password,
            double salary, String department, String adminId) {
        super(id, name, phone, email, address, username, password,
                salary, department);
        this.adminId = adminId;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }
}

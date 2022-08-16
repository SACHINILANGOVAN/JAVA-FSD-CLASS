public class Employee {
    private String name;
    private int id;
    private String role;
    private int phone;
    private String email;

    public Employee() {
    }

    public Employee(String name, int id, String role) {
        this.name = name;
        this.id = id;
        this.role = role;
    }

    public Employee(String name, int id, String role, int phone, String email) {
        this.name = name;
        this.id = id;
        this.role = role;
        this.phone = phone;
        this.email = email;
    }

    public void showEmployeeDetails() {
        System.out.println("Name : " + name + "\n Id : " + id + " \n Role : " + role + " \n Phone : " + phone + " \n Email : " + email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

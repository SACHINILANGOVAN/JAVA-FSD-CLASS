public class App {
    public static void main(String[] args) {
        Employee employeeOne = new Employee();
        Employee employeeTwo = new Employee("gfgh",8,"gjg");
        Employee employeeThree = new Employee("nbjnji",8,"mkn",809,"jkj");

        employeeOne.setName("SACHIN");
        employeeOne.setId(06154);
        employeeOne.setRole("DEVELOPER");
        employeeOne.setPhone(93611659);
        employeeOne.setEmail("sachini@nseit.com");
        employeeOne.showEmployeeDetails();

        employeeTwo.setPhone(779);
        employeeTwo.setEmail("vgvg");
    }
}

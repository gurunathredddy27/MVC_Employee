
public class Main {
    public static void main(String[] args) {

        Employee model = retriveEmployeeFromDatabase();

        EmployeeView view = new EmployeeView();

        EmployeeController controller = new EmployeeController(model, view);

        controller.updateView();

        controller.setEmployeeName("Nirnay");
        controller.setEmployeeDepartment("IT");
        System.out.println("\n Employee Details after updating: ");

        controller.updateView();
    }


    private static Employee retriveEmployeeFromDatabase(){
        Employee Employee = new Employee();
        Employee.setName("Anu");
        Employee.setId("11");
        Employee.setDepartment("Salesforce");
        return Employee;
    }
}
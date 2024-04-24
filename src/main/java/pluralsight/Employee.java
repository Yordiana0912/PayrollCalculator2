package pluralsight;

public class Employee {
    public String getEmployeeId;
    private  int Id;
    private String name;
    private double hoursWorked;
    private double payRate;

    public Employee (int id , String  name, double hoursWorked, double payRate){
        this.Id = Id;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public Employee(String employeeid, String name, Double payrate) {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public String getEmployeeId() {
    }
}

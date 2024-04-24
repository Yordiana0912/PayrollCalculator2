package pluralsight;

import java.io.*;

public class PayrollCalculator {
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("employees.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);

            String input = bufReader.readLine();

            while ((input = bufReader.readLine()) != null) {
                String line = null;
                String [] token = line.split("|");

                        String employeeid = token[0];
                        String name = token [1];
                        Double payrate = Double.valueOf(token [2]);

                        Employee employee = new Employee(employeeid, name , payrate);

                        System.out.println("employee ID"+ employee.getEmployeeId());
                        System.out.println("Name"+ employee.getName());
                        System.out.println("payrate"+ employee.getPayRate());




            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }}
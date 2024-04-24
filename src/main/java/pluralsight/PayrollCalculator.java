package pluralsight;

import java.io.*;

public class PayrollCalculator {
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("employees.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);

            String input;

            while ((input = bufReader.readLine()) != null) {
                System.out.println(input);


            }

            bufReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }}
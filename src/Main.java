import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    static int getIntegerInput() throws IOException
    {
        return Integer.parseInt(bufferedReader.readLine());
    }

    static String[] getStringsInput() throws IOException
    {
        return bufferedReader.readLine().split(" ");
    }

    static String getStringInput() throws IOException
    {
        return bufferedReader.readLine();
    }

    public static void main(String[] args) throws IOException {

        int testCases = getIntegerInput();
        while(testCases>0)
        {
            int noOfStudents = getIntegerInput();
            List<String> students = Arrays.asList(getStringsInput());
            String studentName = getStringInput();
            System.out.println(students.stream().filter(name -> name.equalsIgnoreCase(studentName)).findAny());
            testCases = testCases - 1;
        }
    }
}

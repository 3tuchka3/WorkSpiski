import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Practice {
    public static List<String> practice() throws FileNotFoundException {
        try (
                FileReader fr = new FileReader("C:\\Users\\Asup5\\Desktop\\WorkSpiski\\Program\\src\\data\\1_БЕЛИНВЕСТ.txt");
                Scanner scan = new Scanner(fr);
        ) {
            scan.useDelimiter(System.getProperty("line.separator"));
            List <String> List = new ArrayList<>();

            while (scan.hasNext()) {
                String next = scan.next();
                String[] nextMass = next.split("\\^");


                List.add(Arrays.toString(nextMass));

            }
            return (List);
        } catch (Exception exeption) {
            exeption.printStackTrace();
        }
        return null;
    }
}

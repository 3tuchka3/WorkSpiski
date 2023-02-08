import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> telephoneConversationsList = null;
        File file = new File("C:\\Users\\Asup5\\Desktop\\WorkSpiski\\Program\\src\\data\\1_БЕЛИНВЕСТ.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        Scanner scan = new Scanner(br);
        scan.useDelimiter(System.getProperty("line.separator"));
        telephoneConversationsList = new ArrayList();

        while (scan.hasNext()) {
            String next = scan.next();
            telephoneConversationsList.add(next);
        }

        br.close();
        fr.close();
        Iterator var13 = telephoneConversationsList.iterator();

        while (var13.hasNext()) {
            String nextMass = (String) var13.next();
            System.out.println(nextMass);
        }

        try {
            FileWriter writer = new FileWriter("C:\\Users\\Asup5\\Desktop\\WorkSpiski\\Program\\src\\data\\test.txt", false);

            try {
                Iterator var15 = telephoneConversationsList.iterator();

                while (var15.hasNext()) {
                    String nextMass = (String) var15.next();
                    writer.write(nextMass + System.getProperty("line.separator"));
                }
            } catch (Throwable var11) {
                try {
                    writer.close();
                } catch (Throwable var10) {
                    var11.addSuppressed(var10);
                }

                throw var11;
            }

            writer.close();
        } catch (IOException var12) {
            System.out.println(var12.getMessage());
        }

    }
}

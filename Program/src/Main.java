import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        File path = new File("C:\\Users\\Asup5\\Desktop\\WorkSpiski\\Program\\src\\data\\1_БЕЛИНВЕСТ.txt");
        List<String> telephoneConversationsList = new ArrayList<>();

        RandomAccessFile raf = new RandomAccessFile(path, "r");
        String scan;
        int temp = 0;

        do {
            scan = raf.readLine();
            String res = new String(scan.getBytes(StandardCharsets.ISO_8859_1), "windows-1251"); //UTF-8 выводила так же "??????".
            telephoneConversationsList.add(res);
            temp++;
            System.out.println(scan);
        }while (raf.readLine() != null);
        raf.close();


        System.out.println(temp);

        File file = new File("C:\\Users\\Asup5\\Desktop\\WorkSpiski\\Program\\src\\data\\1_БЕЛИНВЕСТ.txt");
        List<String> list = new ArrayList<>();
        try {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String fileString = new String(line.getBytes(StandardCharsets.ISO_8859_1), "UTF-8");
                    list.add(fileString);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String fileString:list){
            System.out.println(fileString);
        }
        System.out.println("ыватдфва");
    }
}

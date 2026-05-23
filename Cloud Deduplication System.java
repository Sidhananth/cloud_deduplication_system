import java.util.*;

public class DedCloud {
    public static void main(String[] args) {

        List<String> files = Arrays.asList("data1", "data2", "data1", "data3");

        Set<String> uniqueFiles = new HashSet<>(files);

        System.out.println("Original Files: " + files.size());
        System.out.println("Unique Files Stored: " + uniqueFiles.size());

        for(String file : uniqueFiles) {
            System.out.println("Stored File: " + file);
        }
    }
}

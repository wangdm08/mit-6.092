package Assignment7;

import sun.plugin.javascript.navig.Array;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MagicSquares {
    public static boolean testMagic(String pathName) throws IOException {
        // Open the file
        BufferedReader reader = new BufferedReader(new FileReader(pathName));

        boolean isMagic = true;
        int lastSum = -1;

        // For each line in the file ...
        String line;
        while ((line = reader.readLine()) != null) {
            // ... sum each row of numbers
            String[] parts = line.split("\t");
            int sum = 0;
            for (String part : parts) {
                if (!part.equals("")) {
                    sum += Integer.parseInt(part);
                }
            }
            if (lastSum == -1) {
                // If this is the first row, remember the sum
                lastSum = sum;
            } else if (lastSum != sum) {
                // if the sums don't match, it isn't magic, so stop reading
                isMagic = false;
                break;
            }
        }

        reader.close();
        return isMagic;
    }

    public static boolean testColumnMagic(String pathName) throws IOException {
        // Open the file
        BufferedReader reader = new BufferedReader(new FileReader(pathName));

        boolean isMagic = true;
        int lastSum = -1;
        int count = 0;
        int markRow = -1;
        boolean mark=true;

        // For each line in the file ...
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("\t");
            if ((markRow == -1) || (markRow == parts.length)) {
                markRow = parts.length;
                ArrayList<String> columns = new ArrayList<>();
                for (String part : parts) {
                    if (!part.equals("")) {
                        columns.add(part);
                    }
                }
            }
            else {
                mark = false;
                break;
            }
            count++;
        }

        if (mark) {
            ArrayList<String> columnSums =new ArrayList<>();
            int columnSum = 0;
            for (int i=0; i<markRow; i++) {
                for (int j=0; j<count; j++) {
                    columnSum+=Integer.parseInt(columnSums.get(i));
                }
            }
        }

        reader.close();
        return isMagic;
    }

    public static boolean testDiagonalMagic(String pathName) throws IOException {
        // Open the file
        BufferedReader reader = new BufferedReader(new FileReader(pathName));

        boolean isMagic = true;
        int lastSum = -1;

        // For each line in the file ...
        String line;
        while ((line = reader.readLine()) != null) {
            // ... sum each row of numbers
            String[] parts = line.split("\t");
            int sum = 0;
            for (String part : parts) {
                if (!part.equals("")) {
                    sum += Integer.parseInt(part);
                }
            }
            if (lastSum == -1) {
                // If this is the first row, remember the sum
                lastSum = sum;
            } else if (lastSum != sum) {
                // if the sums don't match, it isn't magic, so stop reading
                isMagic = false;
                break;
            }
        }

        reader.close();
        return isMagic;
    }

    public static void main(String[] args) throws IOException {
        String[] fileNames = { "Mercury.txt", "Luna.txt" };
        for (String fileName : fileNames) {
            System.out.println(fileName + " is magic? " + testMagic(fileName));
        }
    }
}
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
        while (((line = reader.readLine()) != null)) {
            // ... sum each row of numbers
            if (!line.equals("")) {
                String[] parts = line.split("\t");
                int sum = 0;
                for (String part : parts) {
                    sum += Integer.parseInt(part);
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
        }

        reader.close();
        return isMagic;
    }

    public static boolean testColumnMagic(String pathName) throws IOException {
        // Open the file
        BufferedReader reader = new BufferedReader(new FileReader(pathName));

        boolean isColumnMagic = true;
        int rowCount = 0;
        int colCount = -1;
        boolean mark=true;

        // For each line in the file ...
        String line;
        ArrayList<String> columns = new ArrayList<>();
        while (((line = reader.readLine()) != null)) {
            if (!line.equals("")) {
                String[] parts = line.split("\t");
                if ((colCount == -1) || (colCount == parts.length)) {
                    colCount = parts.length;
                    for (String part : parts) {
                        columns.add(part);
                    }
                }
                else {
                    mark = false;
                    break;
                }
                rowCount++;
            }
        }

        ArrayList<Integer> columnSums =new ArrayList<>();
        int columnSum = 0;
        if (mark) {
            for (int i=0; i<colCount; i++) {
                int cnt = 0;
                columnSum = 0;
                for (int j=0; j<rowCount; j++) {
                    columnSum+=Integer.parseInt(columns.get(cnt+i));
                    cnt+=8;
                }
                columnSums.add(columnSum);
            }
        }
        for (int eachSum : columnSums) {
            if (eachSum != columnSum) {
                isColumnMagic = false;
            }
        }

        reader.close();
        return isColumnMagic;
    }

    public static boolean testDiagonalMagic(String pathName) throws IOException {
        // Open the file
        BufferedReader reader = new BufferedReader(new FileReader(pathName));

        boolean isDiagonalMagic = true;
        int lastSum = -1;

        // For each line in the file ...
        String line;
        while (((line = reader.readLine()) != null)) {
            // ... sum each row of numbers
            if (!line.equals("")) {
                String[] parts = line.split("\t");
                int sum = 0;
                for (String part : parts) {
                    sum += Integer.parseInt(part);
                }
                if (lastSum == -1) {
                    // If this is the first row, remember the sum
                    lastSum = sum;
                } else if (lastSum != sum) {
                    // if the sums don't match, it isn't magic, so stop reading
                    isDiagonalMagic = false;
                    break;
                }
            }
        }

        reader.close();
        return isDiagonalMagic;
    }

    public static void main(String[] args) throws IOException {
        String[] fileNames = { "Mercury.txt", "Luna.txt" };
        for (String fileName : fileNames) {
            System.out.println(fileName + " is magic? " + testMagic(fileName));
            System.out.println(fileName + " is columnMagic? " + testColumnMagic(fileName));
            System.out.println(fileName + " is diagonalMagic? " + testDiagonalMagic(fileName));
        }
    }
}
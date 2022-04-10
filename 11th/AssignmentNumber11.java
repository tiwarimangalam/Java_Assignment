import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AssignmentNumber11 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileWriter fw = new FileWriter("introduction.txt");// Created the new file

            fw.write("Hi this is Mangalam Tiwari . I am 21 year old . Remember the name Mangalam Tiwari .");
            // Inserted the text in the file.
            fw.close();
            //System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
       // FileReader fr=new FileReader("introduction.txt");
        File file=new File("introduction.txt");
        Scanner sc = new Scanner(file);
        Map<Character ,Integer> myMap =new TreeMap<>();
        while (sc.hasNext()) {
           String s= sc.next(); // reading the text file word by word.
           for(int i=0;i<s.length();i++) {
               char c=s.charAt(i);
               if (myMap.containsKey(c)){
                   myMap.put(c, myMap.get(c) + 1);
               } else {
                   myMap.put(c, 1);
               }
           }
            //System.out.println(sc.nextLine());
        }
        System.out.println("This is the frequency array of all string present in txt file: ");
        for(Map.Entry<Character, Integer> val: myMap.entrySet())
        {
            System.out.println(val.getKey()+" : "+val.getValue());
        }
    }
}

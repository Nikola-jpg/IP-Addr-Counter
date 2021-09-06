package main;

import java.io.*;
import java.util.Date;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
            TreeSet<String> IP = new TreeSet<>();

            try (BufferedReader reader = new BufferedReader(new FileReader(""))) {//Вставьте сюда путь к вашему файлу
                String str;
                while (reader.ready()) {
                    str = reader.readLine();
                    if(!IP.contains(str))
                    IP.add(str);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println(IP.size());
    }
}

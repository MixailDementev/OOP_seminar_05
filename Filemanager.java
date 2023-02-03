// package OOP_seminar_05;

import java.util.*;
import java.util.jar.Attributes.Name;
import java.io.*;

public class Filemanager {

    static String FILE_PATH = "./";
    String FILE_NAME_EXPORT = "export.csv";
    String FILE_PATH_FULL = FILE_PATH + FILE_NAME_EXPORT;

    public void ExportFile(ArrayList<Phonebook> pb) {
        try (FileWriter writer = new FileWriter(FILE_PATH + FILE_NAME_EXPORT, false)) {
            // запись всей строки
            for (Phonebook i : pb) {
                String text = i.getName() + "/" + i.getPhone() + "/" + i.getCity();
                writer.write(text);
                // запись по символам
                writer.append('\n');
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void ImportFile(ArrayList<Phonebook> pb) {
        try {
            File file = new File(FILE_PATH_FULL);
            // создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            // создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                // System.out.println(line);
                // считываем остальные строки в цикле
                String[] tmp = line.split("/");
                pb.add(new Phonebook(tmp[0], tmp[1], tmp[2]));
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

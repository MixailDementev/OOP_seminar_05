// package OOP_seminar_05;

import java.util.*;

public class Addressbook {

    public ArrayList<Phonebook> pb = new ArrayList<>();

    public void AddressBook() {

        pb.add(new Phonebook("Иванов Иван Иванович", "79110020202", "Москва"));
        pb.add(new Phonebook("Сидоров Сидор Сидорович", "79991112233", "Питер"));
        pb.add(new Phonebook("Козловеч Инна Владимировна", "79815557661", "Владимир"));
        pb.add(new Phonebook("Поленович Юлия Индировна", "79024510697", "Ярославль"));

    }

    public void showAdressBook() {
        for (Phonebook i : pb) {
            System.out.println(i.getName()+" "+i.getPhone()+" "+i.getCity());
        }
    }
}

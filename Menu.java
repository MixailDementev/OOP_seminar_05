import java.util.Scanner;

public class Menu {
    public static void mainMenu() {
        Scanner in = new Scanner(System.in);
        System.out.println("1 - Отобразить справочник");
        System.out.println("2 - Выгрузить данные");
        System.out.println("3 - Загрузить данные");
        System.out.println(". ".repeat(15));
        System.out.println("Выберите действие: ");

        Filemanager run = new Filemanager();
        Addressbook phones = new Addressbook();

        switch (in.nextInt()) {
            case 1:
                phones.AddressBook();
                phones.showAdressBook();
                break;
            case 2:
                phones.AddressBook();
                run.ExportFile(phones.pb);
                System.out.println("Export data ");
                break;
            case 3:
                run.ImportFile(phones.pb);
                phones.showAdressBook();

                break;
        }
        
    }
}

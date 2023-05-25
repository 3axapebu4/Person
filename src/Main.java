import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    static int count;
    static int b;
    public static ArrayList<String> People=new ArrayList<>();

    public static void main(String[] args) {
        List<Person> personList = readFile();
        System.out.println("введено " + personList.size() + " пользоватлеей");
        writeInConsole(personList);
        System.out.println("введено " + count + " невалидных");

        for(int i = 0; i < b; ++i) {
            System.out.println(People.get(i));
        }

    }

    public static List<Person> readFile() {
        ArrayList personList = new ArrayList();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src\\Persons.txt"));

            while(reader.ready()) {
                int user = Integer.parseInt(reader.readLine());
                String name = reader.readLine();
                String surname = reader.readLine();
                int serial = Integer.parseInt(reader.readLine());
                int number = Integer.parseInt(reader.readLine());
                Person person = new Person(user, name, surname, serial, number);
                personList.add(person);
            }

            reader.close();
        } catch (IOException var8) {
            var8.printStackTrace();
        }

        return personList;
    }

    public static void writeInConsole(List<Person> personList) {
        Iterator var1 = personList.iterator();

        while(var1.hasNext()) {
            Person person = (Person)var1.next();
            if (validatePerson(person)) {
                System.out.println(person);
            }
        }

    }

    public static boolean validatePerson(Person person) {
        String name = person.getName();
        Integer serial = person.getSerial();
        if (name.length() >= 2 && serial.toString().length() == 6) {
            return true;
        } else {
            ++count;
            for(int i = b; i < count; ++i) {
                num[i] = name;
            }
            ++b;
            return false;
        }
    }
}


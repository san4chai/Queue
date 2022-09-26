import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();
        List<Person> people = generateClients();
        for (Person person : people) {
            queue.offer(person);
        }

        while (!queue.isEmpty()) {
            Person person = queue.poll();
            person.spendTicket();
            System.out.println("Посетитель " + person.getName() + " " + person.surname + " прокатился, осталось билетов " + person.getTickets_amount());
            if (person.getTickets_amount() > 0) {
                queue.offer(person);
            }
        }
    }

    public static List<Person> generateClients() {

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Ivan", "Ivanov", 2));
        persons.add(new Person("Petr", "Petrov", 1));
        persons.add(new Person("Oleg", "Kirpichnikov", 3));
        persons.add(new Person("Genadiy", "Gudermes", 11));
        persons.add(new Person("Pavel", "Dujekov", 5));
        return persons;
    }

}

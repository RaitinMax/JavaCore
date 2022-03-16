import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jack", "Connor", "Harry", "George", "Samuel", "John");
        List<String> families = Arrays.asList("Evans", "Young", "Harris", "Wilson", "Davies", "Adamson", "Brown");
        Collection<Person> persons = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            persons.add(new Person(
                    names.get(new Random().nextInt(names.size())),
                    families.get(new Random().nextInt(families.size())),
                    new Random().nextInt(100),
                    Sex.values()[new Random().nextInt(Sex.values().length)],
                    Education.values()[new Random().nextInt(Education.values().length)])
            );
        }
        countNonAdult(persons);
        militaryList(persons);
        highDegree(persons);

    }

    public static void countNonAdult(Collection<Person> person) {
        long count = person.stream()
                .filter(persons -> persons.getAge() < 18)
                .count();
        System.out.println(count);
    }

    public static void militaryList(Collection<Person> person) {
        List<String> collect = person.stream()
                .filter(persons -> persons.getSex().equals(Sex.MAN))
                .filter(persons -> persons.getAge() > 18 && persons.getAge() < 27)
                .map(name -> name.getName()).collect(Collectors.toList());
        System.out.println(collect);
    }
    public static void highDegree(Collection<Person> person){
        List<String> collect = person.stream()
                .filter(persons -> persons.getAge()>18 && persons.getAge()<65&&persons.getSex().equals(Sex.MAN)||
                        persons.getAge()>18 && persons.getAge()<60&&persons.getSex().equals(Sex.WOMAN)   )
                .sorted(Comparator.comparing(person1 -> person1.getFamily()))
                .map(name -> name.getFamily()).collect(Collectors.toList());
        System.out.println(collect);
    }
}

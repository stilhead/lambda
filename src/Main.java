import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {

    static  Calculate calculate;

    public static void main(String[] args) {
        /*System.out.println(Employee.getCount());
        Employee employee = new Employee("Dolon", 31);
        System.out.println(Employee.getCount());


        Employee employee1 = new Employee("kalys", 12);

        System.out.println(Employee.getCount());

        System.out.println(employee.getAge() + " - " + Employee.getCompany());
        System.out.println(employee1.getAge() + " - " + Employee.getCompany());
       /* calculate = (x,y) -> {
            System.out.println("Работает лямбда выражение");
            return x + y;
        };

        System.out.println(calculate.calculate(10,5));
        count();
        Application application = new Application();
        application.count(10,5, calculate);

        Printable printable = () -> System.out.println("print");
        printable.print();*/

        /*List<Integer> numbers = Arrays.asList(123,34,56,34,2,56,34,569);
        System.out.println(numbers);
        List<Integer> nums = numbers.stream().map(a-> (a + 2)/3).collect(Collectors.toList());

        List<String> names = Arrays.asList("Dolon", "Kalys", "Melis");
        List<String> sorted = names.stream().filter(s -> s.contains("s")).collect(Collectors.toList());

        System.out.println(names);
        System.out.println(sorted);

        Stream stream = Stream.empty();


        Stream.of(1,2,4,5,6,2).forEach(s-> System.out.println(s));


        int age = 12;

        String str = age > 12 && true ? "ТЫ нам подходишь" : "ТЫ слишком молод";


        System.out.println(str);*/

        //Stream.generate(()->5).limit(10).forEach(System.out::println);

        Stream.
                of(LocalDate.now(), LocalDate.of(1992, 12,21),  LocalDate.of(1992, 12,21))
                .sorted()
                .distinct()
                .forEach(System.out::println);
    }

    private static void count(){
        calculate = (x,y)-> x-y;
        System.out.println(calculate.calculate(10,5));
    }
}

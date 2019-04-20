public class Employee {

    private static String company = "It Run";
    private String name;
    private int age;
    private static int count = 0;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
        count++;
    }

    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        Employee.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0){
            System.out.println("Неверное значение - " + age);
            return;
        }
        this.age = age;
    }

    public static int getCount(){
        return count;
    }
}

package homework_5;
/**
 * 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
 * 2. Конструктор класса должен заполнять эти поля при создании объекта.
 * 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
 * 4. Создать массив из 5 сотрудников.
 * Пример:
 * Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
 * persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
 * persArray[1] = new Person(...);
 * ...
 * persArray[4] = new Person(...);
 * <p>
 * 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
 */
public class UserHome {
    private String name; //ФИО
    private String position; //Должность
    private String email; //Эл.почта
    private long telNumber; //Тел. номер
    private int age; //возраст
    private double salary; //зарплата

    public UserHome(String name, String position, String email, long telNumber, int age, double salary) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telNumber = telNumber;
        this.age = age;
        this.salary = salary;

    }

    // вывод объекта на печать
    public void info() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "UserHome{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", telNumber=" + telNumber +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;

    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(long telNumber) {
        this.telNumber = telNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 40) {
            this.age = age;
        } else {
            System.out.println("Age is negative");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

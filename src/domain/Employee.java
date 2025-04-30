package domain;

/**
 * Клас Employee представляє загальну модель працівника з основними атрибутами:
 * ім'я, посада, ID, рівень та відділ.
 */
public class Employee {

    /**
     * Перевизначений метод toString для текстового представлення інформації про працівника.
     * @return рядок із даними працівника
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle +
               "\nLevel= " + level + "\nDept= " + dept;
    }

    // Поля класу Employee
    private String name;       // Ім'я працівника
    private String jobTitle;   // Посада працівника
    private int ID;            // Унікальний ідентифікатор працівника
    private int level;         // Рівень працівника (1-3)
    private String dept;       // Відділ, в якому працює працівник

    // Створення нового працівника із заданими параметрами
    public Employee(String name, String jobTitle, int level, String dept) {
        this(); // Викликає конструктор за замовчуванням для генерації ID
        setName(name);
        this.jobTitle = jobTitle;
        // Встановлення рівня тільки якщо він дорівнює 1, 2 або 3
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1; // Якщо рівень некоректний, встановлюється 1
        }
        this.dept = dept;
    }

    /**
     * Конструктор за замовчуванням.
     * Генерує випадковий ID для працівника в діапазоні 0-999.
     */
    public Employee() {
        ID = (int)(Math.random() * 1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }

    /**
     * Встановлює посаду працівника.
     * @param job нова посада
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * Повертає посаду працівника.
     * @return назва посади
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Повертає ім'я працівника.
     * @return ім'я
     */
    public String getName() {
        return name;
    }

    /**
     * Встановлює рівень працівника.
     * Якщо введене значення некоректне, встановлюється рівень 1.
     * @param level рівень працівника
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     * Повертає рівень працівника.
     * @return рівень
     */
    public int getLevel() {
        return level;
    }

    /**
     * Повертає відділ працівника.
     * @return назва відділу
     */
    public String getDept() {
        return dept;
    }

    /**
     * Встановлює відділ працівника.
     * @param dept новий відділ
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Встановлює ім'я працівника.
     * Перевіряє, чи ім'я відповідає шаблону (без цифр і неправильних символів).
     * Якщо ім'я некоректне, встановлюється "John Doe".
     * @param name ім'я для встановлення
     */
    public void setName(String name) {
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe"; // Значення за замовчуванням
        }
    }
}

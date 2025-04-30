package domain;

/**
 * Клас Manager є підкласом Employee.
 * 
 * Представляє менеджера, який керує масивом підлеглих працівників.
 */
public class Manager extends Employee {

    /**
     * Конструктор для створення менеджера із вказаними працівниками та даними.
     * @param employees масив підлеглих працівників
     * @param name ім'я менеджера
     * @param jobTitle посада менеджера
     * @param level рівень менеджера
     * @param dept відділ менеджера
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Перевизначений метод для текстового представлення об'єкта Manager.
     * Додає список імен підлеглих працівників до загальної інформації.
     * @return рядкове представлення об'єкта
     */
    @Override
    public String toString() {
        return super.toString() + "\nEmployees: " + getEmployees();
    }

    /**
     * Конструктор для створення менеджера лише з масивом працівників.
     * Інші дані встановлюються за замовчуванням.
     * @param employees масив підлеглих працівників
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    /**
     * Конструктор за замовчуванням.
     * Ініціалізує масив підлеглих розміром 10.
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    // Поле для зберігання підлеглих працівників
    private Employee[] employees;

    /**
     * Повертає список імен підлеглих у вигляді одного рядка, розділеного комами.
     * @return рядок із іменами підлеглих
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        // Видалення останньої коми та пробілу
        s = s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює масив підлеглих працівників.
     * @param employees масив працівників
     */
    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    /**
     * Повертає масив підлеглих працівників.
     * @return масив працівників
     */
    public Employee[] getEmployeesList() {
        return employees;
    }
}

package domain;

/**
 * Клас Artist є підкласом Employee і представляє співробітника-художника,
 * який має набір навичок (skills).
 */
public class Artist extends Employee {

    // Масив навичок художника
    private String[] skills;

    /**
     * Конструктор із параметрами для ініціалізації всіх полів.
     * @param skills масив навичок художника
     * @param name ім'я працівника
     * @param jobTitle посада працівника
     * @param level рівень працівника
     * @param dept відділ працівника
     */
    public Artist(String[] skills, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skills = skills;
    }

    /**
     * Конструктор з параметром skills, інші поля ініціалізуються конструктором суперкласу без параметрів.
     * @param skills масив навичок художника
     */
    public Artist(String[] skills) {
        super();
        this.skills = skills;
    }
    
    /**
     * Конструктор за замовчуванням. Ініціалізує масив навичок розміром 10.
     */
    public Artist() {
        super();
        this.skills = new String[10];
    }

    /**
     * Перевизначений метод для рядкового представлення об'єкта Artist.
     * Додає до інформації з Employee список навичок.
     * @return текстовий опис об'єкта
     */
    @Override
    public String toString() {
        return super.toString() + "\nSkills: " + getSkills();
    }

    /**
     * Отримання навичок у вигляді одного рядка, розділеного комами.
     * @return рядок з навичками
     */
    public String getSkills() {
        if (skills == null || skills.length == 0) {
            return "No skills listed";
        }
        return String.join(", ", skills);
    }

    /**
     * Встановлення масиву навичок.
     * @param skills новий масив навичок
     */
    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    /**
     * Отримання масиву навичок.
     * @return масив навичок
     */
    public String[] getSkillsList() {
        return skills;
    }
}

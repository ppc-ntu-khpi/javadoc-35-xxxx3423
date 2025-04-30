package domain;

/**
 * Клас Editor є підкласом Artist і представляє редактора,
 * який має інформацію про перевагу типу редагування (електронне або паперове).
 */
public class Editor extends Artist {

    // Поле, що зберігає інформацію про перевагу редагування (електронне або паперове)
    private boolean electronicEditing;

    /**
     * Конструктор із параметрами для повної ініціалізації полів.
     * @param electronicEditing чи використовує редактор електронне редагування
     * @param skills масив навичок редактора
     * @param name ім'я працівника
     * @param jobTitle посада працівника
     * @param level рівень працівника
     * @param dept відділ працівника
     */
    public Editor(boolean electronicEditing, String[] skills, String name, String jobTitle, int level, String dept) {
        super(skills, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор із навичками і типом редагування, інші поля - за замовчуванням.
     * @param electronicEditing чи використовується електронне редагування
     * @param skills масив навичок
     */
    public Editor(boolean electronicEditing, String[] skills) {
        super(skills);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор із типом редагування, навички створюються за замовчуванням.
     * @param electronicEditing чи використовується електронне редагування
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор за замовчуванням.
     * Встановлює електронне редагування true та викликає конструктор суперкласу за замовчуванням.
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Перевизначення методу для текстового представлення об'єкта Editor.
     * Додає до інформації про художника ще й перевагу типу редагування.
     * @return рядкове представлення об'єкта
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nEditing preferences: " + (electronicEditing ? "electronic" : "paper");
    }

    /**
     * Отримання переваги редагування.
     * @return true, якщо електронне редагування, false якщо паперове
     */
    public boolean isElectronicEditing() {
        return electronicEditing;
    }

    /**
     * Встановлення переваги редагування.
     * @param electronicEditing true для електронного редагування, false для паперового
     */
    public void setElectronicEditing(boolean electronicEditing) {
        this.electronicEditing = electronicEditing;
    }
}

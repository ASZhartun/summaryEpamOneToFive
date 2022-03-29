package block4.simplestClassesAndObjects.task03;

import java.util.ArrayList;

/**
 * 3. Создайте класс с именем Student, содержащий поля:
 *      - фамилия и инициалы,
 *      - номер группы,
 *      - успеваемость (массив из пяти элементов).
 * Создайте массив из десяти элементов такого типа.
 * Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("Zhirkov", "D.A.", 114510, new int[]{7,8,9,4,10}),
                new Student("IvanovBest", "R.A.", 114510, new int[]{10,10,10,10,10}),
                new Student("Kaluzhniy", "D.S.", 114510, new int[]{7,8,9,4,10}),
                new Student("Zmagar", "V.N.", 114510, new int[]{7,8,9,4,10}),
                new Student("KraevBest", "A.G.", 114510, new int[]{9,9,9,10,10}),
                new Student("Drozd", "N.R.", 114510, new int[]{7,8,9,4,10}),
                new Student("Parhomchik", "A.A.", 114510, new int[]{7,8,9,4,10}),
                new Student("Nurlaev", "A.U.", 114510, new int[]{7,8,9,4,10}),
                new Student("ShpakBest", "G.T.", 114510, new int[]{10,10,10,10,10}),
                new Student("Zhirkov", "M.U.", 114510, new int[]{7,8,9,4,10}),
        };
        ArrayList<Student> topStudents = Student.getTopStudents(students);
    }
}

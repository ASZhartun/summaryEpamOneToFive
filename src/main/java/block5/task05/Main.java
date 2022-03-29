package block5.task05;

import block5.task05.flowerComposition.FlowerComposer;

/**
 * <h1>Задача 5.</h1>
 * Создать консольное приложение, удовлетворяющее следующим требованиям:
 * <ul>
 *     <li>Корректно спроектируйте и реализуйте предметную область задачи.</li>
 *     <li>Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов проектирования.</li>
 *     <li>Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.</li>
 *     <li>Для проверки корректности переданных данных можно применить регулярные выражения.</li>
 *     <li>Меню выбора действия пользователем можно не реализовывать, используйте заглушку.</li>
 *     <li>Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().</li>
 * </ul>
 * <ol>
 *     <li>Вариант A. Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции
 *  (объект, представляющий собой цветочную композицию). Составляющими цветочной композиции являются цветы и упаковка.</li>
 *
 * </ol>
 */

public class Main {
    public static void main(String[] args) {
        FlowerComposer flowerComposer = new FlowerComposer();
        flowerComposer.addFlower();
        flowerComposer.addFlower();
        flowerComposer.addWrapper();
        flowerComposer.getInfo();
    }
}

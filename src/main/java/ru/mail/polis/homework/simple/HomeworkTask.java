package ru.mail.polis.homework.simple;

import java.util.function.ToDoubleFunction;

public class HomeworkTask {

    /**
     * Нужно численно посчитать интеграл от a до b с шагом delta от функции function
     * Для того, что бы получить значение по Y для точки X, надо просто написать function.applyAsDouble(t)
     * Считаем, что функция определена на всем пространстве от a до b
     */
    public static double calcIntegral(double a, double b, ToDoubleFunction<Double> function, double delta) {
        double tmp  = a;
        double sum = 0;
        while (tmp < b) {
            sum += function.applyAsDouble(tmp);
            tmp += delta;
        }
        return delta * sum;
    }

    /**
     * Вывести номер максимальной цифры. Счет начинается слева направо,
     * выводим номер первой максимальной цифры (если их несколько)
     */
    public static byte maxNumber(long a) {
        byte currentRank = 0;
        byte maxRank = 0;
        byte maxRankValue = 0;

        do {
            if (Math.abs(a % 10) >= maxRankValue) {
                maxRankValue = (byte) Math.abs(a % 10);
                maxRank = currentRank;
            }
            currentRank++;

        } while ((a /= 10) != 0 );

        return (byte) (currentRank - maxRank);
    }


    /**
     * Даны две точки в пространстве (x1, y1) и (x2, y2). Вам нужно найти Y координату третьей точки (x3, y3),
     * которая находится на той же прямой что и первые две.
     */
    public static double lineFunction(int x1, int y1, int x2, int y2, int x3) {
        return ((double) (x3 - x1) * (y2 - y1) / (x2 - x1) + y1);
    }

    /**
     * Даны 4 точки в пространстве A(x1, y1), B(x2, y2), C(x3, y3), D(x4, y4). Найдите площадь выпуклого
     * четырехуголька ABCD.
     * Это дополнительное задание, необязательное для выполнения
     */
    public static double square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
        return (double) Math.abs(((x1 - x2) * (y3 - y2) - (y1 - y2) * (x3 - x2))) / 2
                            + (double) Math.abs(((x1 - x3) * (y4 - y3) - (y1 - y3) * (x4 - x3))) / 2;
    }
}

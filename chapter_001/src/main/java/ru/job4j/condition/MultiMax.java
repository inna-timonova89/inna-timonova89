package ru.job4j.condition;

/**
 * Возвращает наибольшее число из 3-х чисел.
 * @return Результат сравнения чисел попарно и выбора наибольшего из 3-х чисел.
 * @author inna.timonova (ms.timonovai@mail.ru)
 */
public class MultiMax {
    public int max(int first, int second, int third) {
        if (first > second) {
            return (first > third) ? first : third;
        } else {
            return (second > third) ? second : third;
        }
    }
}



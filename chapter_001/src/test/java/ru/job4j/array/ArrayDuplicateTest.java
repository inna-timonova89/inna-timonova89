package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.arrayContainingInAnyOrder;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author inna.timonova (ms.timonovai@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] input = new String[] {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] result = duplicate.remove(input);
        String[] expect = new String[] {"Привет", "Мир", "Супер"};
        assertThat(result, arrayContainingInAnyOrder(expect));
        //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
    }
    @Test
    public void whenRemoveDublicatesThenElementsInArrayAreUnique() {
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] input = new String[] {"June", "August", "August", "June", "July", "July"};
        String[] result = duplicate.remove(input);
        String[] expect = new String[] {"June", "August", "July"};
        assertThat(result, arrayContainingInAnyOrder(expect));
    }
}
package ru.sberuniversity.junit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
//@TestInstance(Lifecycle.PER_METHOD)
class TestClass {

    @Test
    void testMethodStructure() {
        // Arrange - Подготовка объектов и окружения теста
        // Act - Выполнение действия
        // Assert - Выполнение проверки или проверок, связанных с выполненным действием
    }

    @Test
    void testMethod1() {
        System.out.println(this);
    }

    @Test
    void testMethod2() {
        System.out.println(this);
    }

}

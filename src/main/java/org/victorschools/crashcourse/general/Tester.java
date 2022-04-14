package org.victorschools.crashcourse.general;

import java.util.function.Predicate;

public final class Tester {
    private Tester() {}

    public static <T> boolean matches(T expected, T actual) {
        return (expected == actual) || (expected != null && expected.equals(actual));
    }

    public static <T> boolean passesCheck(T object, Predicate<T> function) {
        return function.test(object);
    }
}

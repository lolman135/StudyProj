package ua.lesson22.app.validator;

public interface Validator<T> {
    boolean isValid(T value);
}

package com.nevermindsoft.robotOS.types;

/**
 * Created by rcracel on 12/23/13.
 */
public class UndefinedValueHolder extends ValueHolder<Object> {

    private static final UndefinedValueHolder INSTANCE = new UndefinedValueHolder();

    private UndefinedValueHolder() {
        super( null );
    }

    @Override
    public final Object setValue( Object value ) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Object getValue() {
        return this;
    }

    public static UndefinedValueHolder instance() {
        return INSTANCE;
    }

    @Override
    public ValueHolder<Object> increase() {
        throw new UnsupportedOperationException();
    }

    @Override
    public ValueHolder<Object> decrease() {
        throw new UnsupportedOperationException();
    }

    @Override
    public ValueHolder<Object> add(ValueHolder rhs) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ValueHolder<Object> subtract(ValueHolder rhs) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ValueHolder<Object> multiply(ValueHolder rhs) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ValueHolder<Object> divide(ValueHolder rhs) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ValueHolder<Object> power(ValueHolder exp) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ValueHolder<Object> compare(ValueHolder rhs) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ValueHolder<Object> swapSign() {
        throw new UnsupportedOperationException();
    }
}

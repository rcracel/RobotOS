package com.nevermindsoft.robotOS.types;

import com.nevermindsoft.robotOS.operations.Addition;
import com.nevermindsoft.robotOS.operations.Multiplication;
import com.nevermindsoft.robotOS.operations.Subtraction;

/**
 * Created by rcracel on 12/23/13.
 */
public class LongHolder extends ValueHolder<Long> {

    public LongHolder( Long value ) {
        super( value );
    }

    @Override
    public ValueHolder<Long> increase() {
        return null;
    }

    @Override
    public ValueHolder<Long> decrease() {
        return null;
    }

    @Override
    public ValueHolder<Long> add(ValueHolder rhs) {
        return ValueHolder.wrap( Addition.add(getValue(), rhs.getValue()) );
    }

    @Override
    public ValueHolder<Long> subtract(ValueHolder rhs) {
        return ValueHolder.wrap( Subtraction.subtract(getValue(), rhs.getValue()) );
    }

    @Override
    public ValueHolder<Long> multiply(ValueHolder rhs) {
        return ValueHolder.wrap(Multiplication.multiply(getValue(), rhs.getValue()));
    }

    @Override
    public ValueHolder<Long> divide(ValueHolder rhs) {
        return null;
    }

    @Override
    public ValueHolder<Long> power(ValueHolder exp) {
        return null;
    }

    @Override
    public ValueHolder<Long> compare(ValueHolder rhs) {
        return null;
    }

    @Override
    public ValueHolder<Long> swapSign() {
        return null;
    }
}

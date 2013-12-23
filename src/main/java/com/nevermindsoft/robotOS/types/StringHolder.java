package com.nevermindsoft.robotOS.types;

import com.nevermindsoft.robotOS.operations.Addition;
import com.nevermindsoft.robotOS.operations.Multiplication;
import com.nevermindsoft.robotOS.operations.Subtraction;

/**
 * Created by rcracel on 12/23/13.
 */
public class StringHolder extends ValueHolder<String> {

    public StringHolder( String value ) {
        super( value );
    }

    @Override
    public ValueHolder<String> increase() {
        return null;
    }

    @Override
    public ValueHolder<String> decrease() {
        return null;
    }

    @Override
    public ValueHolder<String> add(ValueHolder rhs) {
        return ValueHolder.wrap( Addition.add(getValue(), rhs.getValue() ) );
    }

    @Override
    public ValueHolder<String> subtract(ValueHolder rhs) {
        return ValueHolder.wrap( Subtraction.subtract(getValue(), rhs.getValue()) );
    }

    @Override
    public ValueHolder<String> multiply(ValueHolder rhs) {
        return ValueHolder.wrap(Multiplication.multiply(getValue(), rhs.getValue()));
    }

    @Override
    public ValueHolder<String> divide(ValueHolder rhs) {
        return null;
    }

    @Override
    public ValueHolder<String> power(ValueHolder exp) {
        return null;
    }

    @Override
    public ValueHolder<String> compare(ValueHolder rhs) {
        return null;
    }

    @Override
    public ValueHolder<String> swapSign() {
        return null;
    }
}

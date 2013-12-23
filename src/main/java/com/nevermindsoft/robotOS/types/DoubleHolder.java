package com.nevermindsoft.robotOS.types;

import com.nevermindsoft.robotOS.operations.Addition;
import com.nevermindsoft.robotOS.operations.Multiplication;
import com.nevermindsoft.robotOS.operations.Subtraction;

/**
 * Created by rcracel on 12/23/13.
 */
public class DoubleHolder extends ValueHolder<Double> {

    public DoubleHolder( Double value ) {
        super( value );
    }

    @Override
    public ValueHolder<Double> increase() {
        return null;
    }

    @Override
    public ValueHolder<Double> decrease() {
        return null;
    }

    @Override
    public ValueHolder<Double> add(ValueHolder rhs) {
        return ValueHolder.wrap(Addition.add(getValue(), rhs.getValue()));
    }

    @Override
    public ValueHolder<Double> subtract(ValueHolder rhs) {
        return ValueHolder.wrap( Subtraction.subtract( getValue(), rhs.getValue() ) );
    }

    @Override
    public ValueHolder<Double> multiply(ValueHolder rhs) {
        return ValueHolder.wrap(Multiplication.multiply(getValue(), rhs.getValue()));
    }

    @Override
    public ValueHolder<Double> divide(ValueHolder rhs) {
        return null;
    }

    @Override
    public ValueHolder<Double> power(ValueHolder exp) {
        return null;
    }

    @Override
    public ValueHolder<Double> compare(ValueHolder rhs) {
        return null;
    }

    @Override
    public ValueHolder<Double> swapSign() {
        return null;
    }
}

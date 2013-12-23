package com.nevermindsoft.robotOS.types;

/**
 * Created by rcracel on 12/23/13.
 */
public abstract class ValueHolder<T> {

    private T value;

    protected ValueHolder(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public Object setValue( T newValue ) {
        Object prevValue = value;
        value = newValue;
        return prevValue;
    }

    public abstract ValueHolder<T> increase();
    public abstract ValueHolder<T> decrease();
    public abstract ValueHolder<T> add( ValueHolder rhs );
    public abstract ValueHolder<T> subtract( ValueHolder<?> rhs );
    public abstract ValueHolder<T> multiply( ValueHolder<?> rhs );
    public abstract ValueHolder<T> divide( ValueHolder rhs );
    public abstract ValueHolder<T> power( ValueHolder exp );
    public abstract ValueHolder<T> compare( ValueHolder rhs );
    public abstract ValueHolder<T> swapSign();

    public static <K> ValueHolder<K> wrap( K o ) {
        if ( o instanceof String ) {
            return (ValueHolder) new StringHolder( (String) o );
        } else if ( o instanceof Long ) {
            return (ValueHolder) new LongHolder( (Long) o );
        } else if ( o instanceof Double ) {
            return (ValueHolder) new DoubleHolder( (Double) o );
        } else {
            throw new UnsupportedOperationException();
        }
    }

    /**
     * Returns a string representation of the object. In general, the
     * {@code toString} method returns a string that
     * "textually represents" this object. The result should
     * be a concise but informative representation that is easy for a
     * person to read.
     * It is recommended that all subclasses override this method.
     * <p/>
     * The {@code toString} method for class {@code Object}
     * returns a string consisting of the name of the class of which the
     * object is an instance, the at-sign character `{@code @}', and
     * the unsigned hexadecimal representation of the hash code of the
     * object. In other words, this method returns a string equal to the
     * value of:
     * <blockquote>
     * <pre>
     * getClass().getName() + '@' + Integer.toHexString(hashCode())
     * </pre></blockquote>
     *
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + (value == null ? null : value.toString()) + ")";
    }
}

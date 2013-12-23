package com.nevermindsoft.robotOS;

/**
 * Created by rcracel on 12/22/13.
 */
public class Operations {

    public static Number plus( Number left, Number right ) {
        if ( left instanceof Double ) {
            return left.doubleValue() + right.doubleValue();
        } else {
            return left.longValue() + right.longValue();
        }
    }
    public static Number minus( Number left, Number right ) {
        if ( left instanceof Double ) {
            return left.doubleValue() - right.doubleValue();
        } else {
            return left.longValue() - right.longValue();
        }
    }

    public static Number multiply( Number left, Number right ) {
        if ( left instanceof Double ) {
            return left.doubleValue() * right.doubleValue();
        } else {
            return left.longValue() * right.longValue();
        }
    }

    public static Number divide( Number left, Number right ) {
        if ( left instanceof Double ) {
            return left.doubleValue() / right.doubleValue();
        } else {
            return left.longValue() / right.longValue();
        }
    }

    public static Number exp( Number left, Number right ) {
        Number result = Math.pow( left.doubleValue(), right.doubleValue() );
        if ( left instanceof Double ) {
            return result.doubleValue();
        } else {
            return result.longValue();
        }
    }


}

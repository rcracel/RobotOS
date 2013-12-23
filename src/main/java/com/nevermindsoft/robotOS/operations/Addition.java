package com.nevermindsoft.robotOS.operations;

/**
 * Created by rcracel on 12/23/13.
 */
public class Addition {

    public static Long add( Long lhs, Object rhs ) {
        if ( rhs instanceof Long ) {
            return lhs + (Long) rhs;
        } else if ( rhs instanceof Double ) {
            return lhs + ((Double) rhs).longValue();
        } else if ( rhs instanceof String ) {
            throw new UnsupportedOperationException();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public static Double add( Double lhs, Object rhs ) {
        if ( rhs instanceof Long ) {
            return lhs + (Long) rhs;
        } else if ( rhs instanceof Double ) {
            return lhs + (Double) rhs;
        } else if ( rhs instanceof String ) {
            throw new UnsupportedOperationException();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public static String add( String lhs, Object rhs ) {
        if ( rhs instanceof Long ) {
            return lhs + (Long) rhs;
        } else if ( rhs instanceof Double ) {
            return lhs + (Double) rhs;
        } else if ( rhs instanceof String ) {
            return lhs + rhs;
        } else {
            throw new UnsupportedOperationException();
        }
    }

}

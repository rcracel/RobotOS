package com.nevermindsoft.robotOS;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rcracel on 12/22/13.
 */
public class Context {


    private Map<String, Object> vars = new HashMap<String, Object>();

    public Object set( String name, Object value ) {
        return vars.put( name, value );
    }

    public Object get( String name ) {
        return vars.get( name );
    }

}

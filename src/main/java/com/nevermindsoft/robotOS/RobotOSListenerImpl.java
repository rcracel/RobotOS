package com.nevermindsoft.robotOS;

import com.nevermindsoft.antlr.RobotOSBaseListener;
import com.nevermindsoft.antlr.RobotOSListener;
import com.nevermindsoft.antlr.RobotOSParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * Created by rcracel on 12/22/13.
 */
public class RobotOSListenerImpl extends RobotOSBaseListener {

    private Context context;

    public RobotOSListenerImpl( Context context ) {
        this.context = context;
    }

}

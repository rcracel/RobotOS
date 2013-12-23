package com.nevermindsoft;

import com.nevermindsoft.antlr.RobotOSLexer;
import com.nevermindsoft.antlr.RobotOSListener;
import com.nevermindsoft.antlr.RobotOSParser;
import com.nevermindsoft.antlr.RobotOSVisitor;
import com.nevermindsoft.robotOS.Context;
import com.nevermindsoft.robotOS.RobotOSListenerImpl;
import com.nevermindsoft.robotOS.RobotOSVisitorImpl;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.Reader;
import java.io.StringReader;

/**
 * Created by rcracel on 12/22/13.
 */
public class Main {

    public static final String SCRIPT = "/Users/rcracel/workspace/RobotOS/src/main/resources/script.robotos";

    public static void main( String[] args ) throws Exception {
        CharStream script = new ANTLRInputStream( new FileInputStream( SCRIPT ) );

        RobotOSLexer lexer = new RobotOSLexer( script );
        TokenStream tokens = new CommonTokenStream( lexer );

        RobotOSParser parser = new RobotOSParser(tokens);

        RobotOSListener listener = new RobotOSListenerImpl( new Context() );
        RobotOSVisitor visitor = new RobotOSVisitorImpl();

        ParseTree tree = parser.program();
        visitor.visit( tree );

        //parser.addParseListener(new RobotOSListenerImpl( new Context() ));
        RobotOSParser.ExprContext uu = parser.expr();
    }

}

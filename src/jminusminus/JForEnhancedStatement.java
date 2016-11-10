// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package jminusminus;

import java.util.ArrayList;
import static jminusminus.CLConstants.*;

class JForEnhancedStatement extends JStatement {

    private Type mType;
    private String id;
    private JExpression expr;
    private JStatement forStatem;

    public JForEnhancedStatement(int line, Type mType,
				String id,
				JExpression expr,
				JStatement forStatem) {
        super(line);
	this.mType = mType;
	this.id = id;
	this.expr = expr;
	this.forStatem = forStatem;
    }

    public JStatement analyze(Context context) {
        return this;
    }

    public void codegen(CLEmitter output) {

    }

    public void writeToStdOut(PrettyPrinter p) {
        p.printf("<JForEnhancedStatement line=\"%d\">\n", line());
	    p.indentRight();
	    p.printf("<Type>\n");
	    p.indentRight();
	    p.printf(mType.toString()+"\n");
	    p.indentLeft();
	    p.printf("</Type>\n");
	    p.printf("<Identifier>\n");
	    p.indentRight();
	    p.printf(id+"\n");
	    p.indentLeft();
	    p.printf("</Identifier>\n");
            p.printf("<JExpression>\n");
            p.indentRight();
            p.printf(expr.toString()+"\n");
            p.indentLeft();
            p.printf("</JExpression>\n");
            p.printf("<StatementFor>\n");
            p.indentRight();
            p.printf(forStatem.toString()+"\n");
            p.indentLeft();
            p.printf("</StatementFor>\n");        	
        p.indentLeft(); 
        p.printf("</JForEnhadcedStatement>\n");
    }

}

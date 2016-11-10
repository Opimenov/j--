// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package jminusminus;

import java.util.ArrayList;
import static jminusminus.CLConstants.*;

class JForRegularStatement extends JStatement {

    private JForInit initFor;
    private JExpression testConditionFor;
    private JForUpdate updateFor;
    private JStatement statementFor;

    public JForRegularStatement(int line, JForInit initFor,
				JExpression testConditionFor,
				JForUpdate updateFor,
				JStatement statementFor) {
        super(line);
	this.initFor = initFor;
	this.testConditionFor = testConditionFor;
	this.updateFor = updateFor;
	this.statementFor = statementFor;
    }

    public JStatement analyze(Context context) {
        return this;
    }

    public void codegen(CLEmitter output) {

    }

    public void writeToStdOut(PrettyPrinter p) {
        p.printf("<JForRegularStatement line=\"%d\">\n", line());
	    p.indentRight();
	    if (initFor != null) {
	    	p.printf("<JForInit>\n");
	    	p.indentRight();
	    	p.printf(initFor.toString()+"\n");
	    	p.indentLeft();
	    	p.printf("</JForInit>\n");
	    }
	    if (testConditionFor != null) {
	    	p.printf("<TestCondition>\n");
	    	p.indentRight();
	    	p.printf(testConditionFor.toString()+"\n");
	    	p.indentLeft();
	    	p.printf("</TestCondition>\n");
	    }
        if (updateFor != null) {
            p.printf("<ForUpdate>\n");
            p.indentRight();
            p.printf(updateFor.toString()+"\n");
            p.indentLeft();
            p.printf("</ForUpdate>\n");
        }
        if (statementFor != null) {
            p.printf("<StatementFor>\n");
            p.indentRight();
            p.printf(statementFor.toString()+"\n");
            p.indentLeft();
            p.printf("</StatementFor>\n");        	
        }
        p.indentLeft(); 
        p.printf("</JForRegualarStatement>\n");
    }

}

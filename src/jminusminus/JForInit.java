// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package jminusminus;

import static jminusminus.CLConstants.*;
import java.util.ArrayList;

class JForInit extends JStatement {

    private ArrayList<JStatement> statements;
    private Type mType;
    private ArrayList<JVariableDeclarator> vars;

    public JForInit(int line, ArrayList<JStatement> statements,
		    Type mType,ArrayList<JVariableDeclarator> vars) {
        super(line);
	this.statements = statements;
	this.mType = mType;
	this.vars = vars;
    }

    public JStatement analyze(Context context) {
        return this;
    }

    public void codegen(CLEmitter output) {
    }

    public void writeToStdOut(PrettyPrinter p) {
        p.printf("<JForInit line=\"%d\">\n", line());
        p.indentRight();
        p.printf("<Statements>\n");
        p.indentRight();
        if (statements != null){
        	for (JStatement st : statements) 
        	p.printf(st.toString()+"\n");
        }
        p.indentLeft();
        p.printf("</Statements>\n");
        p.printf("<Type>\n");
        p.indentRight();
        if (mType != null) p.printf(mType.toString()+"\n");
        p.indentLeft();
        p.printf("</Type>\n");
        p.printf("<variables>\n");
        p.indentRight();
        if (vars != null)
        	for (JVariableDeclarator vd : vars)
		    p.printf(vars.toString()+"\n");
        p.indentLeft();
        p.printf("</variables>\n");
        p.indentLeft();
        p.printf("</JForInit>\n");
    }

}

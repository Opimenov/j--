package jminusminus;

import java.util.ArrayList;
import static jminusminus.CLConstants.*;

class JSwitchBlockStatementGroup extends JStatement {

    private ArrayList <JExpression> switchLabelsList = new ArrayList<>();
    private ArrayList <JStatement> switchBlockStatements = new ArrayList<>();

    public JSwitchBlockStatementGroup(int line,
				      ArrayList <JExpression> switchLabelsList,
				     ArrayList <JStatement> switchBlockStatements) {
        super(line);
        this.switchLabelsList = switchLabelsList;
        this.switchBlockStatements = switchBlockStatements;
    }

    public JStatement analyze(Context context) {
	JExpression temp_expr;
	// switch var must have type int
	for (JExpression je : switchLabelsList) {
	    temp_expr = (JExpression) je.analyze(context);
	    temp_expr.type().mustMatchExpected(line(), Type.INT);
	    type = Type.INT;
	}
        return this;
    }
    /*
     look up Swamy's hand out for generating the code for this

     right here most of the work needs to be done

     output.addNoArgInstruction(ILOAD_0); // load int in switch(int)
   TreeMap<Integer, String> t = new TreeMap<Integer, String>(); 
   t.put(1, "case1"); // add labels
   t.put(2, "case2");
   output.addLOOKUPSWITCHInstruction("default", t.size(), t); // create switch instructions
   output.addLabel("case1"); // what to do at each label. Just return the int for this test
   output.addNoArgInstruction(IRETURN);
   output.addLabel("case2");
   output.addNoArgInstruction(IRETURN);
   output.addLabel("default");
   output.addNoArgInstruction(IRETURN);
     */
    //switch variable should be on top of the stack at this point
    public void codegen(CLEmitter output, String skipThisCaseLabel) {
	
    }

    public void writeToStdOut(PrettyPrinter p) {
        p.printf("<JSwitchBlockStatementGroup line=\"%d\">\n", line());
	p.indentRight();
	p.printf("<SwitchLabelsList>");
		p.indentRight();
		p.printf(switchLabelsList.toString());
		//	for (JExpression je : switchLabelsList) {
		//	    p.printf(je);
		//	}
	         p.indentLeft();
	p.printf("<SwitchLabelsList>");
	p.printf("<SwitchBlockStatement>");
			p.indentRight();
			 p.indentLeft();
	p.printf("<SwitchBlockStatement>");		
		         p.indentLeft();
        p.printf("</JSwitchBlockStatementGroup>\n");
    }

}

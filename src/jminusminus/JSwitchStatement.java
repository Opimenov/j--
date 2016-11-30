package jminusminus;

import java.util.ArrayList;
import static jminusminus.CLConstants.*;

class JSwitchStatement extends JStatement {

    private ArrayList < JSwitchBlockStatementGroup>  sbsg;
    private JExpression exp;

    public JSwitchStatement(int line,JExpression exp,
			      ArrayList <JSwitchBlockStatementGroup> sbsg) {
        super(line);
        this.exp = exp;
        this.sbsg = sbsg;
    }

    public JStatement analyze(Context context) {
	exp = exp.analyze(context);
	exp.type().mustMatchExpected(line(), Type.BOOLEAN);
        return this;
    }

    public void codegen(CLEmitter output) {
	//put switch variable on top of the stack
	exr.codegen(output);
	//the rest of work is done by the JSwitchBlockStatementGroup codegen
	for (JSwitchBlockStatementGroup temp : sbsg)  {
	    temp.codegen(output);
	}
    }

    public void writeToStdOut(PrettyPrinter p) {
        p.printf("<JSwitchStatement line=\"%d\">\n", line());
        p.printf("</JSwitchStatement>\n");
    }

}

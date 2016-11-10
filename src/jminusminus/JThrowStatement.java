package jminusminus;

import static jminusminus.CLConstants.*;

public class JThrowStatement  extends JStatement {
	private JStatement expr;
	
	public JThrowStatement(int line, JExpression expr) {
		super(line);
		this.expr = expr;
	}
	
	public JStatement analyze(Context context) {
		return this;
	}
	
	public void codegen(CLEmitter output) {
		
	}
	  public void writeToStdOut(PrettyPrinter p) {
	        if (expr != null) {
	            p.printf("<JThrowStatement line=\"%d\">\n", line());
	            p.indentRight();
	            expr.writeToStdOut(p);
	            p.indentLeft();
	            p.printf("</JThrowStatement>\n");
	        } else {
	            p.printf("<JThrowStatement line=\"%d\"/>\n", line());
	        }
	    }	
}

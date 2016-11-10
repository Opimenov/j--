package jminusminus;

import static jminusminus.CLConstants.*;

class JTernaryOp extends JExpression {
	private JExpression condition;
	private JExpression fsrtOption;
	private JExpression secOptions;
	
	public JTernaryOp(int line, JExpression cond, JExpression fOption, JExpression sOption) {
		super(line);
		this.condition = cond;
		this.fsrtOption = fOption;
		this.secOptions = sOption;
	}
	
	public JExpression analyze(Context context) {
		condition = (JExpression) condition.analyze(context);
        condition.type().mustMatchExpected(line(), Type.BOOLEAN);
        fsrtOption = (JExpression) fsrtOption.analyze(context);
        secOptions = (JExpression) secOptions.analyze(context);
        return this;
	}
	public void codegen(CLEmitter output) {
		
	}
	
	 public void writeToStdOut(PrettyPrinter p) {
	        p.printf("<JTernaryOp line=\"%d\">\n", line());
	        p.indentRight();
	        p.printf("<TestExpression>\n");
	        p.indentRight();
	        condition.writeToStdOut(p);
	        p.indentLeft();
	        p.printf("</TestExpression>\n");
	        p.printf("<firstOption>\n");
	        p.indentRight();
	        fsrtOption.writeToStdOut(p);
	        p.indentLeft();
	        p.printf("</firstOption>\n");
	        p.printf("<secondOption>\n");
	         p.indentRight();
	         secOptions.writeToStdOut(p);
	        p.indentLeft();
	        p.printf("</secondOption>\n");
	        p.indentLeft();
	        p.printf("</JTernaryOp>\n");
	    }
}
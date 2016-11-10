package jminusminus;

import static jminusminus.CLConstants.*;

public class JTryStatement extends JStatement {
	private JStatement tryBlock;
	private JFormalParameter param;
	private JStatement catchBlock;
	private JStatement finallyBlock;
	
	public JTryStatement(int line, JStatement tryBlock, JFormalParameter param, JStatement catchBlock, JStatement finallyBlock) {
		super(line);
		this.tryBlock = tryBlock;
		this.param = param;
		this.catchBlock = catchBlock;
		this.finallyBlock = finallyBlock;
	}
	
	public JStatement analyze(Context context) {
        return this;
	}
	
	public void codegen(CLEmitter output) {
	}
	
	 public void writeToStdOut(PrettyPrinter p) {
	        p.printf("<JTryStatement line=\"%d\">\n", line());
	        p.indentRight();
	        p.printf("<tryBlockStatement>\n");
	        p.indentRight();
	        tryBlock.writeToStdOut(p);
	        p.indentLeft();
	        p.printf("</tryBlockStatement>\n");
	        p.printf("<param>\n");
	        p.indentRight();
//	        if (param != null) param.writeToStdOut(p);
	        p.indentLeft();
	        p.printf("</param>\n");
	        p.printf("<catchBlockStatement>\n");
	        p.indentRight();
//	        if (catchBlock != null) 
	        	catchBlock.writeToStdOut(p); 
	        p.indentLeft();
	        p.printf("</catchBlockStatement>\n");
	        p.indentLeft();
	        p.printf("<finallyBlockStatement>\n");
	        p.indentRight();
	        if (finallyBlock != null) finallyBlock.writeToStdOut(p);
	        p.indentLeft();
	        p.printf("</finallyBlockStatement>\n");
	        p.printf("</JTryStatement>\n");
	    }
}

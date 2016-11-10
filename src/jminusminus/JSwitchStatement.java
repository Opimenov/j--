package jminusminus;

import java.util.ArrayList;
import static jminusminus.CLConstants.*;

class JSwitchStatement extends JStatement {

    private JSwitchBlockStatementGroup sbsg;
    private JExpression exp;

    public JSwitchStatement(int line,JExpression exp,
			      JSwitchBlockStatementGroup sbsg) {
        super(line);
        this.exp = exp;
        this.sbsg = sbsg;
    }

    public JStatement analyze(Context context) {
        return this;
    }

    public void codegen(CLEmitter output) {

    }

    public void writeToStdOut(PrettyPrinter p) {
        p.printf("<JSwitchStatement line=\"%d\">\n", line());
        p.printf("</JSwitchStatement>\n");
    }

}

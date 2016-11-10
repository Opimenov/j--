package jminusminus;

import java.util.ArrayList;
import static jminusminus.CLConstants.*;

class JSwitchBlockStatementGroup extends JStatement {

    ArrayList<JExpression> switchLabelsList = new ArrayList<>();
    private JStatement switchBlockStatement;

    public JSwitchBlockStatementGroup(int line,
				      ArrayList<JExpression> switchLabelsList,
				      JStatement switchBlockStatement) {
        super(line);
        this.switchLabelsList = switchLabelsList;
        this.switchBlockStatement = switchBlockStatement;
    }

    public JStatement analyze(Context context) {
        return this;
    }

    public void codegen(CLEmitter output) {

    }

    public void writeToStdOut(PrettyPrinter p) {
        p.printf("<JSwitchBlockStatementGroup line=\"%d\">\n", line());
        p.printf("</JSwitchBlockStatementGroup>\n");
    }

}

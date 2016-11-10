package jminusminus;

import static jminusminus.CLConstants.*;

class JLiteralDouble extends JExpression {

    /** String representation of the double. */
    private String text;

    public JLiteralDouble(int line, String text) {
        super(line);
        this.text = text;
    }

    public JExpression analyze(Context context) {
        type = Type.DOUBLE;
        return this;
    }

    public void codegen(CLEmitter output) {

    }

    public void writeToStdOut(PrettyPrinter p) {
        p.printf("<JLiteralDouble line=\"%d\" type=\"%s\" " + "value=\"%s\"/>\n",
                line(), ((type == null) ? "" : type.toString()), text);
    }

}




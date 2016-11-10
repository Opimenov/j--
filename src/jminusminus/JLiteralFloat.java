package jminusminus;

import static jminusminus.CLConstants.*;

class JLiteralFloat extends JExpression {

    /** String representation of the float. */
    private String text;

    public JLiteralFloat(int line, String text) {
        super(line);
        this.text = text;
    }

    public JExpression analyze(Context context) {
        type = Type.FLOAT;
        return this;
    }

    public void codegen(CLEmitter output) {

    }

    /**
     * @inheritDoc
     */

    public void writeToStdOut(PrettyPrinter p) {
        p.printf("<JLiteralFloat line=\"%d\" type=\"%s\" " + "value=\"%s\"/>\n",
                line(), ((type == null) ? "" : type.toString()), text);
    }

}



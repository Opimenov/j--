// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package jminusminus;

import static jminusminus.CLConstants.*;
import java.util.ArrayList;

class JForUpdate extends JStatement {

    private ArrayList<JStatement> updates;

    public JForUpdate(int line, ArrayList<JStatement> updates) {
        super(line);
        this.updates = updates;
    }

    public JStatement analyze(Context context) {
        return this;
    }

    public void codegen(CLEmitter output) {
    }


    public void writeToStdOut(PrettyPrinter p) {
        p.printf("<JForUpdate line=\"%d\">\n", line());
        p.indentRight();
        p.printf("<updates>\n");
        p.indentRight();
        if (updates != null) p.printf(updates.toString()+"\n");
        p.indentLeft();
        p.printf("</updates>\n");
        p.indentLeft();
        p.printf("</JForUpdate>\n");
    }

}

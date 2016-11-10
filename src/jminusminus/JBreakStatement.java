// Copyright 2011 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package jminusminus;

import static jminusminus.CLConstants.*;

class JBreakStatement
    extends JStatement {

    private JExpression expr;

    public JBreakStatement(int line, JExpression expr) {
        super(line);
        this.expr = expr;
    }

    public JStatement analyze(Context context) {
        MethodContext methodContext = context.methodContext();

        // The methodContext can be null if return statement
        // occurs
        // in a block that is not within a method. For example,
        // in
        // the Java grammar, return statement, at least
        // syntactically, can occur in a static block. But since
        // j-- does not allow a block to occur outside of a
        // method,
        // we don't check for methodContext being null

/*        if (methodContext.methodReturnType() == Type.CONSTRUCTOR) {
            if (expr != null) {
                // Can't return a value from a constructor
                JAST.compilationUnit.reportSemanticError(line(),
                    "cannot return a value from a constructor");
            }
        } else {
            // Must be a method
            Type returnType = methodContext.methodReturnType();
	    methodContext.confirmMethodHasReturn();
            if (expr != null) {
                if (returnType == Type.VOID) {
                    // Can't return a value from void method
                    JAST.compilationUnit.reportSemanticError(line(),
                        "cannot return a value from a void method");
                } else {
                    // There's a (non-void) return expression.
                    // Its
                    // type must match the return type of the
                    // method
                    expr = expr.analyze(context);
                    expr.type().mustMatchExpected(line(), returnType);
                }
            } else {
                // The method better have void as return type
                if (returnType != Type.VOID) {
                    JAST.compilationUnit.reportSemanticError(line(),
                        "missing return value");
                }
            }
	    }   */
        return this;
    }

    public void codegen(CLEmitter output) {
/*        if (expr == null) {
            output.addNoArgInstruction(RETURN);
        } else {
            expr.codegen(output);
            if (expr.type() == Type.INT
                || expr.type() == Type.BOOLEAN
                || expr.type() == Type.CHAR) {
                output.addNoArgInstruction(IRETURN);
            } else {
                output.addNoArgInstruction(ARETURN);
            }
        }
*/
    }

    public void writeToStdOut(PrettyPrinter p) {
        if (expr != null) {
            p.printf("<JBreakStatement line=\"%d\">\n", line());
            p.indentRight();
            expr.writeToStdOut(p);
            p.indentLeft();
            p.printf("</JBreakStatement>\n");
        } else {
            p.printf("<JBreakStatement line=\"%d\"/>\n", line());
        }
    }
}

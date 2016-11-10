package jminusminus;

import java.util.ArrayList;

import static jminusminus.CLConstants.*;

class JInterfaceDeclaration extends JAST implements JTypeDecl, JMember {

    private ArrayList<String> mods;
    private String name;
    private ArrayList<Type> superInterfaces;
    private ArrayList<JMember> interfaceBody;
   
    public JInterfaceDeclaration(int line, ArrayList<String> mods,
				 String name, ArrayList<Type> superInterfaces,
				 ArrayList<JMember> interfaceBody) {
        super(line);
        this.mods = mods;
        this.name = name;
        this.superInterfaces = superInterfaces;
        this.interfaceBody = interfaceBody;
    }

    public String name() {
        return name;
    }

    public void preAnalyze(Context context, CLEmitter partial) {
	
    }

    public Type superType(){
	return null;
    }
    /**
     * Return the type that this interface declaration defines.
     * 
     * @return the defined type.
     */

    public Type thisType() {
        return null;
    }

    /**
     * The initializations for instance fields (now expressed as assignment
     * statments).
     * 
     * @return the field declarations having initializations.
     */

    public ArrayList<JFieldDeclaration> instanceFieldInitializations() {
        return null;
    }

    /**
     * Declare this class in the parent (compilation unit) context.
     * 
     * @param context
     *            the parent (compilation unit) context.
     */

    public void declareThisType(Context context) {
        
    }

    /**
     * Pre-analyze the members of this declaration in the parent context.
     * Pre-analysis extends to the member headers (including method headers) but
     * not into the bodies.
     * 
     * @param context
     *            the parent (compilation unit) context.
     */

    public void preAnalyze(Context context) {
      
    }

    /**
     * Perform semantic analysis on the class and all of its members within the
     * given context. Analysis includes field initializations and the method
     * bodies.
     * 
     * @param context
     *            the parent (compilation unit) context. Ignored here.
     * @return the analyzed (and possibly rewritten) AST subtree.
     */

    public JAST analyze(Context context) {
        return this;
    }

    /**
     * Generate code for the class declaration.
     * 
     * @param output
     *            the code emitter (basically an abstraction for producing the
     *            .class file).
     */

    public void codegen(CLEmitter output) {
        }

    public void writeToStdOut(PrettyPrinter p) {
    	 p.printf("<JInterfaceDeclaration line=\"%d\" name=\"%s\">\n", line(), name);
         if (superInterfaces != null && !superInterfaces.isEmpty()) {
	     p.indentRight();
	     p.printf("<SuperInterfaces>\n");
	     for (Type a : superInterfaces) {
		 p.indentRight();
		 p.printf("<Super Interface name=\"%s\"/>\n", a.toString());
		 p.indentLeft();
	     }
	     p.printf("</SuperInterfaces>\n");
	     p.indentLeft();
	 }

         if (mods != null) {
             p.println("<Modifiers>");
             p.indentRight();
             for (String mod : mods) {
                 p.printf("<Modifier name=\"%s\"/>\n", mod);
             }
             p.indentLeft();
             p.println("</Modifiers>");
         }

         if (interfaceBody != null) {
	     p.println("<InterfaceBody>");
             p.indentRight();
	     for (JMember member : interfaceBody) {
		 if (member != null)
		 ((JAST) member).writeToStdOut(p);
	     }
             p.indentLeft();
	     p.println("</InterfaceBody>");
         }
         p.indentLeft();
         p.println("</JInterfaceDeclaration>");
    }

    /**
     * Generate code for an implicit empty constructor. (Necessary only if there
     * is not already an explicit one.)
     * 
     * @param partial
     *            the code emitter (basically an abstraction for producing a
     *            Java class).
     */

    private void codegenPartialImplicitConstructor(CLEmitter partial) {
      
    }

    /**
     * Generate code for an implicit empty constructor. (Necessary only if there
     * is not already an explicit one.
     * 
     * @param output
     *            the code emitter (basically an abstraction for producing the
     *            .class file).
     */

    private void codegenImplicitConstructor(CLEmitter output) {
       
    }

    /**
     * Generate code for class initialization, in j-- this means static field
     * initializations.
     * 
     * @param output
     *            the code emitter (basically an abstraction for producing the
     *            .class file).
     */

    private void codegenClassInit(CLEmitter output) {
    }
}

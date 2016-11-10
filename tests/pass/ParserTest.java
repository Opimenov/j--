package pass;

import java.lang.System;
import java.util.ArrayList;

public final class ParserTest {
    public static void run(String[] args) throws IOException {
        int fInt = 100;
	int n = 10;
	String m1 = "TESTING  FLOATS";
	// float decimal
	float f = 0;
	f = 2;	
	f = 0f; 
	f = 91.9e+91f; 
	f = 90.01E-10F;  
	f =	0.8f; 
	f = 0.8F;  
	f = 2e+8f; 
	f =	3E-7F; 
	f =	3e5f; 
	f = .8f; 
	f =	.3e10f;				 
	// float hexadecimal
	f = 0x.9af; 		
	f = 0X.09fp+55f;  
	f = 0x.09FP+55F;
	f = 0x8af; 
	f =	0X8fp+55f; 
	f = 0x8FP+55F;
	f = 1e1f; 
	f = 2.f; 
	f = .3f;  
	f = 0f; 
	f = 	3.14f; 
	f = 6.022137e+23f;
	String m4 = "FLOAT CAST";

	f  = (float) x; 
	String m6 = "TESTING DOUBLE";
	double d = 0;
	d = 0d;
	d = 8d;
	d = 8.1;
	d = 8.2e+44d;
	d = 8.2E-33D; 
	d = 0.1d;
	d = 0.2D;
	d = 8.2d;
	d = 7.1e+10d;
	d = .2d; 
	d = .3e+9d;
	d = 1e1;
	d = 2.;
	d = .3;
	d = 0.0;
	d = 3.14;
	d = 1e-9d;
	d = 1e137;
	int i = 0; 
	int j = 0;
	int d = 0;
       	String m13 = "TESTING REGULAR FOR";
	for (int i = 0; i > 10; ++i)
	    { 
		d = 0; 
	    } 
	for (int i = 0, j = 0; ;i--, j--  )
	    { 
		;
	    }	
	for (i = 0; ; )
	    {
		f = 2;
	    }
	for (; n > 12; )
	    n--;
	for ( ; ; n-- )
	    {
		++n;
	    }
	for (; ; )
	    {
		;
	    }
	String m14 = "TESTING ENHANCED FOR";
	for (int i : arL) {
	    int v = 1;
	}
	for (String s : arS) {
	    ;
	}
    }
}

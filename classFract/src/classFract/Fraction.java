package classFract;

import java.util.Scanner;


public class Fraction {
	
	public static class Fract{
		
    int n, d;

    public String toString()
    {
        return n + "/" + d;
    }

    public boolean equals(Fract dr2) 
    { 
    	if(n>dr2.n && d<dr2.d){ 
    		return true;
    	} 
    	return false; 
    } 
    public String add(Fract dr2) 
    { 
    	int n1=n*dr2.d; 
    	int n2=dr2.n*d; 
    	int d1=dr2.d*d; 
    	n1+=n2; 
    	return n1+"/"+d1; 
    } 
    public String sub(Fract dr2) { 
    	int n1=n*dr2.d; 
    	int n2=dr2.n*d; 
    	int d1=dr2.d*d; 
    	n1-=n2; 
    	return n1+"/"+d1; 
    } 
    
    public String mul(Fract dr2) {
        int n1= n*dr2.n;
        int d1= d*dr2.d;
    	return n1+"/"+d1;
    }
    public String div(Fract dr2) {
       int n1=n*dr2.d;
       int d1=d*dr2.n;
    	return n1+""+d1;
    }
}

	
	public static void main(String[] args) { 
		// TODO Auto-generated method stub 
		Scanner sc = new Scanner(System.in); 
		Fract dr1=new Fract();
		Fract dr2=new Fract();
		
		dr1.n=2;
		dr1.d=3;
		dr2.n=2;
		dr2.d=5;
		
		System.out.println(dr1);
		System.out.println(dr2);
		
		System.out.println("dr1>dr1? "+dr1.equals(dr1)); 
		System.out.println("dr1>dr2? "+dr1.equals(dr2)); 
		System.out.println("dr2>dr1? "+dr2.equals(dr1)); 
		
		System.out.println(dr1+" + "+dr2+"="+dr1.add(dr2)); 
		System.out.println(dr1+" - "+dr2+"="+dr1.sub(dr2)); 
		System.out.println(dr1+" * "+dr2+"="+dr1.mul(dr2)); 
		System.out.println(dr1+" / "+dr2+"="+dr1.div(dr2));

		} 
}
	

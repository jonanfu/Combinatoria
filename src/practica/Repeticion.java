/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author Jonathan
 */
public class Repeticion {
	private int n;
	private int m;
	private int x, y, z;
	
	public Repeticion(int n, int m) {
		this.n = n;
		this.m = m;
	}
	
	
	
	public Repeticion(int n,int x, int y, int z) {
		this.n = n;
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Repeticion(int n) {
		this.n = n;
	}
	private long factorial(int factorial) {
		int fact = 1;
		if(factorial <= 0) {
			fact = 1;
		} else {
			for(int i = factorial; i > 0; i--) {
				fact*= i;
			}
		}
		return fact;
	}
	public long variacionSinRepeticion() { 
			
		long numerador;
		long denominador;
		long v;
		numerador = 1;
		denominador = 1;
		numerador = factorial(m);
		denominador = factorial((m-n));
		v = numerador/denominador;
		return v;
	}
	public int variacionConRepeticion() {
		
		int vr = 1;
		for(int i = 1; i <= m; i++) {
			vr *= n;
		}
		return vr;
	}
	public long combinaciones() {
				
		long numerador;
		long denominador;
		long c;
		numerador = factorial(n);
		denominador = factorial(m) * factorial((n-m));
		c = numerador/denominador;
		return c;
	}
	public long permutacionesSinRepeticion() {
		
		return factorial(n);
	}
	public long permutacionesConRepeticion() {
		
		long numerador = 0;
		long denominador = 0;
		long pr;
		numerador = factorial(n);
		
		System.out.println(numerador);
		System.out.println(denominador);
		
		denominador = factorial(x) * factorial(y) * factorial(z);
		pr = numerador / denominador;
		System.out.println(pr);
		return pr;
	}
}
    


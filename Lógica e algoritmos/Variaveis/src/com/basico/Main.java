package com.basico;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//calculo de juros
		double pv = 30000;
		double i = 0.02;
		int n = 24;
		
		double fv = pv * Math.pow(1 + i, n);
		System.out.println("Valor final: " + fv);
		
		//temperatura
		double tf = 95;
		double tc = (tf - 32) / 9 * 5;
		System.out.println("A temperatura em Celsius é: " + tc);
		
		
		//equação segundo grau
		int a = 2;
		int b = 4;
		int c = -6;
		
		double delta = b * b - 4 * a * c;
		
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		System.out.println("X1 = " + x1);
		System.out.println("X2 = " + x2);
		

	}

}

import java.util.Scanner;

public class cuadrado_suma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		double a,b,resultado;
		
		System.out.println("digite el valorde A: ");
		a = entrada.nextDouble();
		
		System.out.println("digite el valorde B: ");
		b = entrada.nextDouble();
		
		resultado = Math.pow(a, 2) +  Math.pow(b, 2) + (2*a*b);
		
		System.out.println("del resultado es: "+resultado);
	}

}

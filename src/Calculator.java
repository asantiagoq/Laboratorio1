
import java.util.Scanner;
/*Calculadora simple, sin excepciones */

public class Calculator {
	Scanner scan = new Scanner(System.in); 
	public void Menu() {
		System.out.println("Ingrese un numero para seleccionar la operacion");
		System.out.println("1.Adicion");
		System.out.println("2.Sustraccion");
		System.out.println("3.Multiplicacion");
		System.out.println("4.Division");
		System.out.println("5.Modulo");

	}

	public double Division() {
		double a, b;
		System.out.println("Ingrese primer valor");
		a = scan.nextDouble();
		System.out.println("Ingrese segundo valor");
		b = scan.nextDouble();
		double val = a / b;

		return val;
	}

	public double Multiplicacion() {
		double a, b;
		System.out.println("Ingrese primer valor");
		a = scan.nextDouble();
		System.out.println("Ingrese segundo valor");
		b = scan.nextDouble();
		double val = a * b;

		return val;
	}

	public double Sustraccion() {
		double a, b;
		System.out.println("Ingrese primer valor");
		a = scan.nextDouble();
		System.out.println("Ingrese segundo valor");
		b = scan.nextDouble();
		double val = a - b;

		return val;
	}

	public double Adicion() {
		double a, b;
		System.out.println("Ingrese primer valor");
		a = scan.nextDouble();
		System.out.println("Ingrese segundo valor");
		b = scan.nextDouble();
		double val = a + b;

		return val;
	}
	public double Modulo() {
		double a, b;
		System.out.println("Ingrese primer valor");
		a = scan.nextDouble();
		System.out.println("Ingrese segundo valor");
		b = scan.nextDouble();
		double val = a % b;

		return val;
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		int x;
		double resp;
		calc.Menu();
		x = scan.nextInt();

		switch (x) {
		case 1:
			resp = calc.Adicion();
			System.out.println(resp);
			break;
		case 2:
			resp = calc.Sustraccion();
			System.out.println(resp);
			break;
		case 3:
			resp = calc.Multiplicacion();
			System.out.println(resp);
			break;
		case 4:
			resp = calc.Division();
			System.out.println(resp);
			break;
		case 5:
			resp = calc.Modulo();
			System.out.println(resp);
			break;
		default:
			System.out.println("Numero invalido");
			break;
		}

	}

}
package Metodos;

public class Echo {
	public String echo(String name) {
		return name;
	}

	public static void main(String[] args) {
		Echo m = new Echo();
		String x = m.echo("CO2");
		String y = m.echo("Greta");
		System.out.println(x+"\n"+ y);
	}
} 

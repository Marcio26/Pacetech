package empresa;

public class Empregado {

	private String nome;
	private String sobrenome;
	private double salario;

	public Empregado(String nome, String sobrenome, double salario) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public double aumentarSalario() {
		return salario * 0.1;
	}
	public double retornarAumento() {
		return salario + aumentarSalario();
	}
	public void mostrarEmpregado() {
		System.out.println("O empregado " + getNome() + " " + getSobrenome() +
		" recebe " + getSalario() + ". Com o aumento, receberá " +
		retornarAumento());
	}
}

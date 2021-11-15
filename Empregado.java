package empresa;

public class Empregado {

	public String nome;
	public String sobrenome;
	public double salario;

	public Empregado() {
		nome = "";
		sobrenome = "";
		salario = 0;
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
}

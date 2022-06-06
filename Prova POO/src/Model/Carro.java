package Model;

public class Carro extends Automovel implements Interface{
	
	private String Modelo;
	private Integer Ano;
	private String Placa;
	private Integer Pneu;
	
	
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		this.Modelo = modelo;
	}
	
	
	public Integer getAno() {
		return Ano;
	}
	public void setAno(Integer ano) {
		this.Ano = ano;
	}
	
	
	public String getPlaca() {
		return Placa;
	}
	public void setPlaca(String placa) {
		this.Placa = placa;
	}
	
	
	public Integer getPneu() {
		return Pneu;
	}
	public void setPneu(Integer pneu) {
		Pneu = pneu;
	}
	
	
	@Override
	public void Velocidade() {
		System.out.format("| Velocidade - 100 Km em 5 segundos   |\n");
	}
	
	
	@Override
	public void Freio() {
		System.out.format("| Freio - Freio ABS                   |\n");
	}
	
}
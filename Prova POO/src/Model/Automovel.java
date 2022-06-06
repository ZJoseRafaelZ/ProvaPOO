package Model;

import java.util.ArrayList;
import java.util.List;

public class Automovel{
	
	List<Carro> carros = new ArrayList<Carro>();
	List<Moto> motos = new ArrayList<Moto>();
	
	
	public List<Carro> getCarros() {
		return carros;
	}
	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}
	
	
	public List<Moto> getMotos() {
		return motos;
	}
	public void setMotos(List<Moto> motos) {
		this.motos = motos;
	}
	
	
}
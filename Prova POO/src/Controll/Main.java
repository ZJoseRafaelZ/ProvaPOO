package Controll;


import Model.Automovel;
import Model.Carro;
import Model.Moto;

public class Main {
	
	public static void main(String[] args) {
	
    Automovel automovel = new Automovel();
    
	Carro carro = new Carro();
	carro.setModelo("Carro");
	carro.setAno(2022);
	carro.setPlaca("111-1111");
	carro.setPneu(4);
	
	Moto moto = new Moto();
	moto.setModelo("Moto");
	moto.setAno(2022);
	moto.setPlaca("111-1111");
	moto.setPneu(2);
	
	automovel.getCarros().add(carro);
	automovel.getMotos().add(moto);
	
	
	System.out.format("=======================================\n");
	System.out.format("|                CARRO                |\n");
	System.out.format("=======================================\n");
	System.out.format("| Modelo - %s"+ "                      |\n",carro.getModelo());
	System.out.format("| Ano - %d"+"                          |\n",carro.getAno());
	System.out.format("| Placa - %s"+    "                    |\n",carro.getPlaca());
	System.out.format("| Pneus - %d                           |\n",carro.getPneu());
	((Carro)carro).Velocidade();
	((Carro)carro).Freio();
	System.out.format("=======================================\n");
	
	System.out.format("\n\n");
	
	System.out.format("=======================================\n");
	System.out.format("|                 MOTO                |\n");
	System.out.format("=======================================\n");
	System.out.format("| Modelo - %s"+"                       |\n",moto.getModelo());
	System.out.format("| Ano - %d"+"                          |\n",moto.getAno());
	System.out.format("| Placa - %s"+    "                    |\n",moto.getPlaca());
	System.out.format("| Pneus - %d                           |\n",moto.getPneu());
	((Moto)moto).Velocidade();
	((Moto)moto).Freio();
	System.out.format("=======================================\n");
	
	}
}
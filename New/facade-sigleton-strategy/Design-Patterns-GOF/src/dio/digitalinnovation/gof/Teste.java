package dio.digitalinnovation.gof;

import dio.digitalinnovation.gof.facade.Facade;
import dio.digitalinnovation.gof.singleton.SingletonEager;
import dio.digitalinnovation.gof.singleton.SingletonLazy;
import dio.digitalinnovation.gof.singleton.SingletonLazyHolder;
import dio.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import dio.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import dio.digitalinnovation.gof.strategy.ComportamentoNormal;
import dio.digitalinnovation.gof.strategy.Robo;

public class Teste {

	public static void main(String[] args) {
		//Acessando pela classe o get instancia que retorna 
		//Teste relacionado ao Design Pattern Singleton
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		//Teste relacionado ao Design Pattern Strategy variacao de comportamentos
		ComportamentoNormal normal = new ComportamentoNormal();
		ComportamentoDefensivo defensivo = new ComportamentoDefensivo();
		ComportamentoAgressivo agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setStrategy(normal);
		robo.mover();
		robo.setStrategy(defensivo);
		robo.mover();
		robo.setStrategy(agressivo);
		robo.mover();
		robo.mover();
		
		//FACADE
		
		Facade facade = new Facade();
		facade.migrarCliente("Marcus", "53070070");
		
		
	}

}

package one.digitalinovationone.gof;

import one.digitalinovationone.gof.facede.Facade;
import one.digitalinovationone.gof.singleton.SingletonEager;
import one.digitalinovationone.gof.singleton.SingletonLazy;
import one.digitalinovationone.gof.singleton.SingletonLazyHolder;
import one.digitalinovationone.gof.strategy.Comportamento;
import one.digitalinovationone.gof.strategy.ComportamentoAgressivo;
import one.digitalinovationone.gof.strategy.ComportamentoDefensivo;
import one.digitalinovationone.gof.strategy.ComportamentoNormal;
import one.digitalinovationone.gof.strategy.Robo;

public class Test {
	// Singleton

	public static void main(String[] args) {

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

		// Strategy

		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();

		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();

		// Facade

		Facade facade = new Facade();
		facade.migrarClientes("Russor", "60340755");
	}

}

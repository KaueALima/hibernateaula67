package br.usjt.usjt_ccp3anmca_jpa_hibernate;

import javax.persistence.EntityManager;

public class TesteBuscaVeiculoComPlaca {
	
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Veiculo v = manager.find(Veiculo.class, 2L);
		System.out.println("---------------" + v);
		manager.close();
		JPAUtil.close();
	}
	
}

package br.com.rsinet.HUB_BDD.suporte;

public class Context {
	private Driver createDriver;
	private PageManager manager;
	
	public Context() {
		createDriver = new Driver();
		manager = new PageManager(Driver.createChrome());
	}
	public Driver getDriver() {
		return createDriver;
	}
	public PageManager getManager() {
		return manager;
	}

}

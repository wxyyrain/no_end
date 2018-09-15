package designPattern.proxy;

/**
 * 
 * 描述:代理类  
 * @author:Balaenoptera musculus
 * @date:2018年9月15日 上午10:47:31
 */
public class Proxy implements Subject {
	
	/**
	 * 要代理哪个实现类
	 */
	private Subject subject;
	
	/**
	 * 
	 * 描述:默认被代理者
	 * @author: Balaenoptera musculus
	 * @date:2018年9月15日 上午10:49:31
	 */
	public Proxy(){
		this.subject = new Proxy();
	}
	
	// 通过构造函数传递代理者
	public Proxy(Object...objects){
		
	}
	
	// 实现接口中定义的方法
	@Override
	public void request() {
		this.before();
		this.subject.request();
		this.after();
	}
	
	public void before(){
		
	}
	
	public void after(){
		
	}

}

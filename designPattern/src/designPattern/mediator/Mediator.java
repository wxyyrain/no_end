package designPattern.mediator;

/**
 * 
 * 描述:通用抽象中介者  
 * @author:Balaenoptera musculus
 * @date:2018年9月15日 上午11:02:26
 */
public abstract class Mediator {
	
	// 定义同事类
	protected ConcreteColleague2 c1;
	protected ConcreteColleague2 c2;
	public ConcreteColleague2 getC1() {
		return c1;
	}
	public void setC1(ConcreteColleague2 c1) {
		this.c1 = c1;
	}
	public ConcreteColleague2 getC2() {
		return c2;
	}
	public void setC2(ConcreteColleague2 c2) {
		this.c2 = c2;
	}
	
	// 中介者模式的业务逻辑
	public abstract void dosomething1();
	public abstract void dosomething2();
	
}

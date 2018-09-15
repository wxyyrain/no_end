package designPattern.mediator;
/**
 * 
 * 描述:抽象同事类  
 * @author:Balaenoptera musculus
 * @date:2018年9月15日 上午11:10:26
 */
public class Colleague {
	
	protected Mediator mediator;
	
	public Colleague(Mediator mediator){
		this.mediator = mediator;
	}
}

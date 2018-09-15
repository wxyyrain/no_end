package designPattern.mediator;

public class ConcreteColleague2 extends Colleague {

	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
	}

	// 自有方法 self-method
	public void selfmethod() {

	}

	// 依赖方法 dep-method
	public void depMethod(){
			// 自己不能处理的逻辑，委托给中介者处理
			super.mediator.dosomething2();
		}

}

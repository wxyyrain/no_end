package designPattern.chainOfResponsibility;
/**
 * 
 * 描述:场景类  
 * @author:Balaenoptera musculus
 * @date:2018年9月9日 下午8:14:15
 */
public class Client {
	
	public static void main(String[] args) {
		// 声明所有处理节点
		Handler handler1 = new ConcreteHandler1();
		Handler handler2 = new ConcreteHandler2();
		Handler handler3 = new ConcreteHandler3();
		// 设置链中的阶段顺1--2--3
		handler1.setNext(handler2);
		handler2.setNext(handler3);
		// 提交请求，返回结果
		Response response = handler1.handleMessage(new Request());
		System.out.println(response);
	}
}

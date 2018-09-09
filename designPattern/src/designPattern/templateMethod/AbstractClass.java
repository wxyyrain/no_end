package designPattern.templateMethod;
/**
 * 
 * 描述:抽象模版类  
 * @author:Balaenoptera musculus
 * @date:2018年9月2日 下午10:41:42
 */
public abstract class AbstractClass<T> {
	
	/**
	 * 
	 * 描述: 基本方法1
	 * @author: Balaenoptera musculus
	 * @date:2018年9月2日 下午10:43:11
	 */
	protected abstract void method1();
	
	/**
	 * 
	 * 描述: 基本方法2
	 * @author: Balaenoptera musculus
	 * @date:2018年9月2日 下午10:43:29
	 */
	protected abstract void method2();
	
	/**
	 * 
	 * 描述: 模版方法
	 * @author: Balaenoptera musculus
	 * @date:2018年9月2日 下午10:43:58
	 */
	public final void  templatedMethod(T t){
		this.method1();
		if(hook()){
			this.method2();
		}
	}
	
	/**
	 * 
	 * 描述: 钩子方法
	 * @author: Balaenoptera musculus
	 * @date:2018年9月2日 下午10:44:58
	 * @return
	 */
	public boolean hook(){
		return false;
	}
}

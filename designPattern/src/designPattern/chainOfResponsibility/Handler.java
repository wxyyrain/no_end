package designPattern.chainOfResponsibility;
/**
 * 
 * 描述:责任链模式-抽象处理者  
 * @author:Balaenoptera musculus
 * @date:2018年9月7日 下午7:59:11
 */
public abstract class Handler {
	
	/**
	 * 下一个处理者
	 */
	private Handler nextHandler;
	
	/**
	 * 
	 * 描述: 处理者处理请求
	 * @author: Balaenoptera musculus
	 * @date:2018年9月9日 下午8:06:26
	 * @param request
	 * @return
	 */
	public final Response handleMessage(Request request){
		Response response = null;
		// 判断是否是自己的处理级别
		if(request.getRequestLevel().equals(this.getHandlerLevel())){
			response = this.echo(request);
		}else{
			// 不属于自己的处理级别
			if(this.nextHandler != null){
				response = this.nextHandler.handleMessage(request);
			}else{
				// 没有适当处理者，业务自行处理
			}
		}
		return response;
	}
	
	/**
	 * 
	 * 描述: 设置下一个处理者是谁
	 * @author: Balaenoptera musculus
	 * @date:2018年9月7日 下午8:03:11
	 * @param handler
	 */
	public void setNext(Handler handler){
		this.nextHandler = handler;
	}
	
	/**
	 * 
	 * 描述: 每个处理者都有一个处理级别
	 * @author: Balaenoptera musculus
	 * @date:2018年9月9日 下午8:08:23
	 * @return
	 */
	protected abstract Level getHandlerLevel();
	
	/**
	 * 
	 * 描述: 每个处理者都必须实现处理任务
	 * @author: Balaenoptera musculus
	 * @date:2018年9月9日 下午8:09:05
	 * @param request
	 * @return
	 */
	protected abstract Response echo(Request request);
}

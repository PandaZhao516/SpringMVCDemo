package ConCurrency;

public class Apple implements Runnable{
	public int num = 50;//苹果总数
	
	@Override
	public  void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i<50;i++){
			synchronized(this){
				if(num>0){
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}//模拟网络延迟
					System.out.println(Thread.currentThread().getName()+"吃了编号为:"+num--+"的苹果");
				}
			}
			
		}//end for
	}//end run

}

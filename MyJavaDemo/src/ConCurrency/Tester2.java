package ConCurrency;

//比较并行和串行累加操作的速度
public class Tester2 {
	private static final long count = 1000000;//执行次数
	
	public static void main(String[] args) throws InterruptedException {
		concurrency();
		serial();
	}
	
	private static void concurrency() throws InterruptedException{
		long start = System.currentTimeMillis();
		
		//通过匿名内部类来创建线程
		Thread thread = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				int a = 0;
				for(long i = 0; i < count;i++){
					a+=5;
				}
			}
			
		});
		
		thread.start();
		
		//并行执行
		int b = 0;
		for(long i = 0;i < count;i++){
			b--;
		}
		
		thread.join();//等待线程结束
		long time = System.currentTimeMillis() - start;
		System.out.println("concurrency:"+time+"ms");
	}
	
	private static void serial(){
		long start = System.currentTimeMillis();
		
		int a = 0;
		for(long i = 0;i < count;i++){
			a += 5;
		}
		//串行执行
		int b = 0;
		for(long i = 0;i < count;i++){
			b--;
		}
		
		long time = System.currentTimeMillis()-start;
		System.out.println("serial:"+time+"ms");
	}
}

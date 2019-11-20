package ConCurrency;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("开始。。。");
//		
//		System.out.println("结束。。。");
		
//		//主线程运行游戏
//		for(int i = 0; i<50;i++){
//			System.out.println("打游戏"+i);
//			if(i == 10){
//				PlayMusicThread musicThread = new PlayMusicThread();
//				musicThread.start();
//			}
//		}
		
		//主线程播放音乐
		for(int i = 0; i<50;i++){
			System.out.println("播放音乐"+i);
			if(i == 10){
				Runnable target =new PlayGameThread();
				Thread t= new Thread(target);
				t.start();
			}
		}
	}
	
	public static void playGame(){
		for(int i = 0;i < 50;i++){
			System.out.println("打游戏"+i);
		}
	}
	
	public static void playMusic(){
		for(int i = 0;i < 50;i++){
			System.out.println("播放音乐"+i);
		}
	}

}

class PlayMusicThread extends Thread{
	private int playTime = 50;//播放时间，用循环来模拟播放过程
	public void run(){
		for(int i = 0;i < playTime; i++){
			System.out.println("播放音乐"+i);
		}
	}
}

class PlayGameThread implements Runnable{
	private int playTime = 50;//播放时间，用循环来模拟播放过程
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i < playTime; i++){
			System.out.println("打游戏"+i);
		}
	}
	
}




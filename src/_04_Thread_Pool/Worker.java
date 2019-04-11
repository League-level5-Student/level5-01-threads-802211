package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Worker implements Runnable {

	ConcurrentLinkedQueue<Task> taskQueue;
	
	Worker(ConcurrentLinkedQueue<Task> taskQueue){
		taskQueue = this.taskQueue;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(taskQueue != null) {
			taskQueue.remove().perform();
		}
	}


}

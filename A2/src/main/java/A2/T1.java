package A2;

public class T1 extends Main implements Runnable {

	private String[] lines;
	int count = 0;

	public T1(String[] lines) {
		this.lines = lines;
		// TODO Auto-generated constructor stub
	}

	public void run() {
		for(String lines : lines){
            if(lines.contains("/5/")||lines.contains("/6/")){
                count++;
            }
        }
		 try{
			 	System.out.println(Thread.currentThread().getName() +" Total number of courses           = " + count +" courses");
	            Thread.sleep(2000);
	        }catch(InterruptedException e){
	            e.printStackTrace();
	        }
		 
		// TODO Auto-generated method stub
		
	}

}

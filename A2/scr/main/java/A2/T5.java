package A2;

public class T5 extends Main implements Runnable{

	private String[] lines;
	int count = 0;

	public T5(String[] lines) {
		this.lines = lines;
		// TODO Auto-generated constructor stub
	}
	public void run() {
		// TODO Auto-generated method stub
		
		for(String lines : lines){
			if(lines.contains("STIW3054")){
				try{
        		 	System.out.println(Thread.currentThread().getName() +" The Information of STIW3054       = " + lines );
                    Thread.sleep(2000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
			}
		}
		
	}

}

package A2;

public class T3 extends Main implements Runnable{

	private String[] lines;
	int count = 0;

	public T3(String[] lines) {
		this.lines = lines;
		// TODO Auto-generated constructor stub
	}
	public void run() {
		
		for(String lines : lines){
			if(lines.contains("STIA") || lines.contains("STID") || lines.contains("STIJ") || lines.contains("STIK1")
					|| lines.contains("STIK2")|| lines.contains("STIN") || lines.contains("STIW") || lines.contains("STIX")
            		|| lines.contains("STQM") || lines.contains("STQS")) {
				
				try{
					System.out.println(Thread.currentThread().getName() +" List of courses from SOC          = " + lines );
		            Thread.sleep(2000);
		        }catch(InterruptedException e){
		            e.printStackTrace();
		        }
            }
        }		
	}
}

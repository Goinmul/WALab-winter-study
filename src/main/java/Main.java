

public class Main {

	public static void main(String[] args) throws Exception {
		//Step_E e = new Step_E();
		//Step_F f = new Step_F();
		//Step_G g = new Step_G();
		//Step_H h = new Step_H();
		//Step_I i = new Step_I();
		Step_J j = new Step_J();
		
		//checking execution time for algorithm evaluation
		long startTime = System.currentTimeMillis();
		
		System.out.printf("%.5f",j.goldenRatio(8));
		
		long endTime = System.currentTimeMillis();
		System.out.println("Execution time : "+(endTime-startTime)+"ms");
	}

}

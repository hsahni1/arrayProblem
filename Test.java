import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		
		ArrayList<Integer> array = new ArrayList<>();
		array.add(0, 1);
		array.add(1, 2);
		array.add(2, 4);
		array.add(3, 5);
		int finalNumber = getTheAddedNumber(array);
		System.out.println(finalNumber);
		
	}
	
	private static int getTheAddedNumber(ArrayList<Integer> array ){

		int number = 0;

		int power = array.size()-1;
		for(int i = array.size()-1; i>=0 ; i--){
			if(power >0){
				number = number +  array.get(i) * (int)Math.pow(10, power);
				power --;
			}
		}

		return number;

	}

}


public class Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = { 2, 4, 3, 5, 6, -2, 4, 7, 8, 9 };
		
		for(int i = 0; i < (array.length - 1); i++)
		{
		//System.out.println(array[i]);
			
			System.out.println(array[i] + array[i+1] == 7);
				
		}
	}

}

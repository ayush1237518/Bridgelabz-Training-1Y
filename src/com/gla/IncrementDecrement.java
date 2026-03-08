
// // general usecase and basic understanding of increment and decrement function
public class IncrementDecrement{
	public static void main(String[] args){
			int i=0;
			i++;
			System.out.println("val" + i++); 
			System.out.println("val" + i);
			++i;
			System.out.println("val" + i++);
			System.out.println("val" + i++);
			
		    int z=i+ i++ + ++i +i + ++i + i++;
		    System.out.println("val" + z);
		    System.out.println("val" + i);

			// int z= i-i++ - --i+i - ++i+i++ ;

		    System.out.println("val" + z);

	}
}

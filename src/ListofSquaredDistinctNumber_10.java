import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListofSquaredDistinctNumber_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10.Create a List of the square of all distinct numbers using stream api
		List <Integer> numList = Arrays.asList(1, 2, 3, 3, 5, 10, 21, 21, 30);
		List<Integer> noDupNumList = numList.stream().distinct().collect(Collectors.toList());
		System.out.println(noDupNumList);
	}

}

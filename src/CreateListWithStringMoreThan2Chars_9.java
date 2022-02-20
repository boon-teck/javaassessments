import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CreateListWithStringMoreThan2Chars_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//9.Create a List with String more than 2 characters using stream api

		List<String> wordList = Arrays.asList("God","Collect","Stream","Java","Python","SQL", "a","b","c","d","e","fu","yourmom","sister","dog");

		
		List<String> moreThanTwo = wordList.stream()
                .filter(x -> x.length()> 2)
                .collect(Collectors.toList());
		System.out.println(moreThanTwo);
	}

}

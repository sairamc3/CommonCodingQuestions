import java.util.*;
import java.util.Map.*;

public class SortHashMapByValue {

	public static void main(String[] args) {

		Map<String, Integer> scores = new HashMap<>();
		scores.put("Dravid", 99);
		scores.put("Sachin", 130);
		scores.put("Shewag", 200);
		scores.put("Pathan", 20);
		scores.put("Dhoni", 50);

		System.out.println(scores);
		
		scores = sortTheHashMap(scores);

		System.out.println(scores);
	}

	private static Map<String, Integer> sortTheHashMap(Map<String, Integer> scores) {

		Map<String, Integer> sortedScores = new LinkedHashMap<>();
		
		Set<Entry<String,Integer>> scoreSet = scores.entrySet();

		List<Entry<String,Integer>> scoreList = new ArrayList<>(scoreSet);

		scoreList.sort((x,y) -> x.getValue().compareTo(y.getValue()));

		scoreList.forEach(x -> sortedScores.put(x.getKey(), x.getValue()));

		return sortedScores;
	}
}





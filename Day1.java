package AoC_2018;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class Day1 {

	
	
	public static void main(String[] args) throws IOException {
		List<Integer> list = load();
		//list.forEach(System.out::println);
		System.out.println("Part 1 answer is: "+part1(list));
		System.out.println("Part 2 answer is: "+part2(list));
		
	}

	private static List<Integer> load() throws FileNotFoundException{
		
		List<Integer> tempList = new ArrayList<Integer>();
		String fileName = "input.txt";
		Scanner sc = new Scanner(new File(fileName));
		
		while(sc.hasNextLine()) {
			tempList.add(sc.nextInt());
		}
		sc.close();
		
		return tempList;
	}
	
	private static Integer part1(List<Integer> list) {
		
		int sum = 0;
		sum = list.stream()
				.mapToInt(Integer::intValue) // x -> x the same
				.sum();  
		return sum;
	}
	
	private static Integer part2(List<Integer> list) {
		
		Set<Integer> set = new HashSet<Integer>();
		int seeking = 0;
		Boolean found = false;
		 
		while(true) {
			for(int each : list) {
				seeking += each;
				if(!set.add(seeking)) {
					return seeking;
				}
			}
			
		}
			
			
		
	}
}

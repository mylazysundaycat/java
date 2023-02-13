package Chapter08;
import java.util.StringJoiner;

public class Chapter8_4StringJoiner {
	public static void main(String[] args) {
		//SPLIT
		String champion = "Anybia,Teemo,Izreal";
		String[] chamArr = champion.split(",");
		for(String s:chamArr) {
			System.out.print(s+" ");
		}
		
		
		//JOIN
		String chamStr = String.join("-", chamArr);
		System.out.println(chamStr);
		
		
		//StringJoiner
		StringJoiner chamSj = new StringJoiner(",","(",")");
		for(String s:chamArr) {
			chamSj.add(s);
		}
		System.out.println(chamSj.toString());
		
		
		
	}
}

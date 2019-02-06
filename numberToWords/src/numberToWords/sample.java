package numberToWords;

import java.util.Scanner;

public class sample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 111;
		
		String[] cNum = Integer.toString(num).split("");
		

		String disp = "";
		
		if(num < 10) {
			disp = convert(cNum[0]);
		}else if(num < 100) {
			disp = firstDigit(cNum[0]) + convert(cNum[1]);
		}else if(num < 1000) {
			if(cNum[1]=="1") {
				disp = convert(cNum[0]) + "hundred " +  
						less(cNum[2]);
			}else {
				disp = convert(cNum[0]) + "hundred " +  
						firstDigit(cNum[1]) + 
						convert(cNum[2]);
			}
			
		}else if(num < 10000) {
			disp = convert(cNum[0]) + "Thousand " +  
					convert(cNum[1]) + "hundred " + 
					firstDigit(cNum[2]) + 
					convert(cNum[3]);
		}else if(num < 100000) {
			disp = firstDigit(cNum[0]) + 
					convert(cNum[1]) + "Thousand " +  
					convert(cNum[2]) + "hundred " + 
					firstDigit(cNum[3]) + 
					convert(cNum[4]);
		}
		
		System.out.println(disp);
		
	}
	
	public static String convert(String x) {
		
		if(x.equals("1")) {
			return "one ";
		}else if(x.equals("2")) {
			return "two ";
		}else if(x.equals("3")) {
			return "three ";
		}else if(x.equals("4")) {
			return "four ";
		}else if(x.equals("5")) {
			return "five ";
		}else if(x.equals("6")) {
			return "six ";
		}else if(x.equals("7")) {
			return "seven ";
		}else if(x.equals("8")) {
			return "seven ";
		}else if(x.equals("9")){
			return "nine ";
		}else {
			return "";
		}
		
	}
	
	public static String firstDigit(String x) {
		
		if(x.equals("2")) {
			return "Twenty ";
		}else if(x.equals("3")) {
			return "Threety ";
		}else if(x.equals("4")) {
			return "Fourty ";
		}else if(x.equals("5")) {
			return "Fifty ";
		}else if(x.equals("6")) {
			return "Sixty ";
		}else if(x.equals("7")) {
			return "Seventy ";
		}else if(x.equals("8")) {
			return "Eighty ";
		}else if(x.equals("9")){
			return "Ninety ";
		}else {
			return "";
		}
	}
	
	public static String less(String x) {
		
		
		if(x.equals("1")) {
			return "Eleven ";
		}if(x.equals("2")) {
			return "Twelve ";
		}else if(x.equals("3")) {
			return "Thirteen ";
		}else if(x.equals("4")) {
			return "Fourteen ";
		}else if(x.equals("5")) {
			return "Fifteen ";
		}else if(x.equals("6")) {
			return "Sixteen ";
		}else if(x.equals("7")) {
			return "Seventeen ";
		}else if(x.equals("8")) {
			return "Eighteen ";
		}else if(x.equals("9")){
			return "Ninteen ";
		}else {
			return "Ten";
		}
	}
}

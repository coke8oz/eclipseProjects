package numberToWords;

import java.util.Scanner;

public class finals {
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		int num = number.nextInt();
		
		while(num < 1000000) {
			
			String[] cNum = Integer.toString(num).split("");
			

			String disp = "";
			if(num < 10) {
				disp = convert(cNum[0]);
			}else if(num < 100) {
				if(cNum[0].equals("1")) {
					disp = less(cNum[1]);
				}else {
					disp = firstDigit(cNum[0]) + convert(cNum[1]);
				}
				
			}else if(num < 1000) {
				if(cNum[1].equals("1")) {
					disp = convert(cNum[0]) + check(cNum[0]) +  
							less(cNum[2]);
				}else {
					disp = convert(cNum[0]) + check(cNum[0]) +  
							firstDigit(cNum[1]) + 
							convert(cNum[2]);
				}
				
			}else if(num < 10000) {
				if(cNum[2].equals("1")){
					disp = convert(cNum[0]) + checkThousand(cNum[0]) +  
							convert(cNum[1]) + check(cNum[1]) + 
							less(cNum[3]);
				}else {
					disp = convert(cNum[0]) + checkThousand(cNum[0]) +  
							convert(cNum[1]) + check(cNum[1]) + 
							firstDigit(cNum[2]) + 
							convert(cNum[3]);
				}
				
			}else if(num < 100000) {
				if(cNum[0].equals("1") || cNum[3].equals("1") ) {
					//check if all are equal to 1
					if(cNum[0].equals("1") && cNum[3].equals("1")) {
						disp = less(cNum[1]) + checkThousand(cNum[1]) +  
								convert(cNum[2]) + check(cNum[2]) + 
								less(cNum[4]);
					//check if only cNum[0] is equal to 1
					}else if(cNum[0].equals("1")) {
						disp = less(cNum[1]) + checkThousand(cNum[1]) +  
								convert(cNum[2]) + check(cNum[2]) + 
								firstDigit(cNum[3]) + 
								convert(cNum[4]);
					//check if only cNum[3] is equal to 1
					}else if(cNum[3].equals("1")){ 
						disp = firstDigit(cNum[0]) + 
								convert(cNum[1])+ checkThousand(cNum[1]) +  
								convert(cNum[2]) + check(cNum[2]) + 
								less(cNum[4]);
					}
				//if none are equal to one
				}else {
					disp = firstDigit(cNum[0]) + 
							convert(cNum[1]) + checkThousand(cNum[1]) +  
							convert(cNum[2]) + check(cNum[2]) + 
							firstDigit(cNum[3]) + 
							convert(cNum[4]);
				}
				
			}else if(num < 1000000) {
				if(cNum[1].equals("1") || cNum[4].equals("1") ) {
					//check if all are equal to 1
					if(cNum[1].equals("1") && cNum[4].equals("1")) {
						disp = convert(cNum[0]) + check(cNum[0]) +
								less(cNum[2]) + checkThousand(cNum[2]) +  
								convert(cNum[3]) + check(cNum[3]) + 
								less(cNum[5]);
					//check if only cNum[0] is equal to 1
					}else if(cNum[1].equals("1")) {
						disp = convert(cNum[0]) + check(cNum[0]) +
								less(cNum[2]) + checkThousand(cNum[2]) +  
								convert(cNum[3]) + check(cNum[3]) + 
								firstDigit(cNum[4]) + 
								convert(cNum[5]);
					//check if only cNum[3] is equal to 1
					}else if(cNum[4].equals("1")){ 
						disp = convert(cNum[0]) + check(cNum[0]) +
								firstDigit(cNum[1]) + 
								convert(cNum[2]) + checkThousand(cNum[2]) +  
								convert(cNum[3]) + check(cNum[3]) + 
								less(cNum[5]);
					}
				//if none are equal to one
				}else {
					disp = convert(cNum[0]) + check(cNum[0]) +
							firstDigit(cNum[1]) + 
							convert(cNum[2]) + checkThousand(cNum[2]) +  
							convert(cNum[3]) + check(cNum[3])+ 
							firstDigit(cNum[4]) + 
							convert(cNum[5]);
				}
				
						
			}
			
			System.out.println(disp);
			num = number.nextInt();
		}
		
		
		
		
	}
	
	public static String convert(String x) {
		String[] word = {"", "One ","Two ","Three ","Four ","Five ","Six ","Seven ","Eight ","Nine "};
		return word[Integer.parseInt(x)];		
	}
	
	public static String firstDigit(String x) {
		String[] word = {"","","Twenty ","Thirty ","Fourty ","Fifty ","Sixty ","Seventy ","Eighty ","Ninety "};
		return word[Integer.parseInt(x)];
	}
	
	public static String less(String x) {
		String[] word = {"ten ","Eleven ","Twelve ", "Thirteen ","Fourteen ","Fifteen ",
						"Sixteen ","Seventeen ","Eighteen ","Ninteen "};
		return word[Integer.parseInt(x)];
	}
	
	public static String check(String x) {
		if(x.equals("0")){
			return "";
		}
		return "Hundred ";
	}
	
	public static String checkThousand(String x) {
		if(x.equals("0")){
			return "";
		}
		return "Thousand ";
	}
}

package nit;

import java.util.StringTokenizer;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "my name is nitesh rawat from jharkhand";
		String arr[] = new String[12];
		String output = "";
		int count=0;
		StringTokenizer st = new StringTokenizer(word);
		while(st.hasMoreTokens()){
			String st1 = st.nextToken();
			
			arr[count]=(st1.replace(st1.charAt(0), st1.charAt(st1.length()-1)));
			
			
			output = output.concat(arr[count]);
					count++;
		}
		System.out.println(output);
			}
}

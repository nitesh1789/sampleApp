package nit;

public class Test3 {

	public static void main(String[] args) {
		String word = "my name is nitesh rawat from jharkhand";
		String[] str = word.split(" ");
		for (int i=str.length-1; i > 0; i--) {
		String temp = str[i];
		char temp1[] =temp.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int j = temp1.length-1; j >=0; j--) {
			sb = sb.append(temp1[j]);
		}
		System.out.print(sb +" ");
		}
		
	}

}

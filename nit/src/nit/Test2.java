package nit;

public class Test2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "my name is nitesh rawat from jharkhand";
		String arr[] = word.split(" ");
		for (int i = 0; i < arr.length; i++) {
			String s[] = arr[i].split("");
			int l = s.length - 1;
			String tem = s[0];
			String tem1 = s[l];
			s[0] = tem1;
			s[l] = tem;
			StringBuilder sb=new StringBuilder();
			String output = "";
			for (int j = 0; j < s.length; j++) {
				output =  output.concat(s[j]);
			}
			System.out.print(output+" ");
		}
		
	}

}

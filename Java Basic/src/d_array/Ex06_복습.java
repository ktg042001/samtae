package d_array;

public class Ex06_복습 {
	public static void main(String[]args) {
		
	
	// 1.3x4의 char형 배열 ch 선언하기
	
	char[][]ch =new char[3][4];
	
	// 2. 값입력
	char al = 'A';
	for(int i=0; i < ch.length ;i++) {
		for(int j=0; j<ch[i].length; j++, al++) {
			ch [i][j] = al;
						
		}
			
	}
	//3. 출력
	for(int i=0;i< ch.length ;i++) {
		for(int j=0; j<ch[i].length;j++) {
			System.out.print(ch[i][j] + " ");
						
		}
		System.out.println();
			
	}
	
	
	
	
	

	}
}

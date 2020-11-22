package array;

public class TwoDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 행,열
		// 메모리에는 일차원으로 적재
		int[][] arr = {{1,2,3}, {4,5,6,7}};
		
		for(int i = 0; i < arr.length;i++) {
			for(int j = 0; j < arr[i].length;j++) {
				System.out.println(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}

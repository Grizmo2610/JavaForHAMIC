package answer.matrix;

public class Matrix {
	public static int[][] reshape(int[][] matrix, int r, int c){
		if (matrix.length * matrix[0].length != r * c){
			return matrix;
		}

		int index = 0;
		int[][] ans = new int[r][c];
		for (int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				ans[index / c][index % c] = matrix[i][j];
				index++;
			}
		}
		return ans;
	}

	public static int[][] lowerTriangleMatrix(int[][] matrix){
		if (matrix.length != matrix[0].length){
			return matrix;
		}
		for (int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				if (i < j){
					matrix[i][j] = 0;
				}
			}
		}
		return matrix;
	}

	public static int[] convertToArray(int[][] matrix){
		int index = 0;
		int[] ans = new int[ matrix.length * matrix[0].length];
		for (int i = 0; i < matrix.length;i++){
			for(int j = 0; j < matrix[0].length; j++){
				ans[index] = matrix[i][j];
				index++;
			}
		}
		return ans;
	}

	public static int[] colMean(int[][] matrix){
		int[] means = new int[matrix[0].length];
		for (int col = 0; col < matrix[0].length; col++){
			int sum = 0;
			for(int i = 0; i < matrix.length; i++){
				sum += matrix[i][col];
			}
			means[col] = sum / matrix.length;
		}
		return means;
	}

}

public class BingoGame {
	
	int[][] valuesArray = new int[5][5];
	
	public BingoGame() {
		for (int i = 0; i < 5; i++) {
			int[] oneRow = setFive(i);
			valuesArray[i] = oneRow;
		
		}
		
		valuesArray[2][2] = 0;
	}
	
	//this method creates columns but in the instance array they are stored as columns for easy of transposing
	public int[] setFive(int col) { //indexes 0-4
		int index = col;
		int minimum = index*15 + 1;
		int[] valuesCol = new int[5];
		
		for (int n = 0; n < 5; n++) {
			int number = (int)(Math.random()*15) + minimum;
			for (int m = 0; m<5; m++) {
				if (number == valuesCol[m]) {
					while (number == valuesCol[m]) {
					number = (int)(Math.random()*15) + minimum;
					}
				}
			}
			valuesCol[n] = number;
		}
		return valuesCol;
	}
	
	public int[][] getValues() {
		return valuesArray;
		
	}
	
}

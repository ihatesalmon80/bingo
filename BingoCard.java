public class BingoCard {
	
	int[][] card = new int[5][5];
	
	public BingoCard(int[][] values) {
		
		card = values; //fit dimensions
		
		for (int c = 0; c<5; c++) {
			for (int r = 0; r<5 ;r++) {
				System.out.print(card[r][c] + "\t");
			}
			System.out.println("\n");
		}
	}
	
}

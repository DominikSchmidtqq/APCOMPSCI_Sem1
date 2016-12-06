public class Ex_03 {
	public static void main(String args[]) {
		String [][] xAndO = new String [4][4];
		for(int i=0; i<xAndO.length; i++) {
			for (int j=0; j<xAndO[i].length; j++) {
				int xoro = (int)(Math.random()*2)+1;
				if(xoro == 1) {
					xAndO[i][j]="x";
				}
				else if(xoro == 2) {
					xAndO[i][j]="o";
				}
			}
		}
		for(int i=0; i<xAndO.length; i++) {
			for(int d = 0; d<xAndO[i].length; d++) {
				System.out.print(xAndO[i][d] + "\t");
			}
			System.out.println();
		}
	}
}
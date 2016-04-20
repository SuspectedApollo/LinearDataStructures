package question1;

public class Hash2 implements Hash{

	private int[][] table;
	private boolean[][] filled;
	
	public Hash2(){
		table = new int[10][3];
		filled = new boolean[10][3];
	}
	
	public boolean add(int num){
		int key = -1;
		for(int i = 0; i < table.length; i++){
			key = (num + i) % table.length;
			for(int j = 0; j < table[i].length; j++){
				if(!filled[key][j]){
					table[key][j] = num;
					filled[key][j] = true;
					return true;
				}
			}
		}
		return false;
	}
	
	public String toString(){
		String ret = "";
		for(int i = 0; i < table.length; i++){
			ret = ret + i + " - ";
			for(int j = 0; j < table[i].length; j++){
				ret = ret + table[i][j] + '\t';
			}
			ret += '\n';
		}
		return ret;
	}
}

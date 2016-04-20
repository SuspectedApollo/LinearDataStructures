package question1;

public class Hash1 implements Hash{
	
	private int[] table;
	private boolean[] filled;
	
	public Hash1(){
		table = new int[20];
		filled = new boolean[table.length];
	}

	public boolean add(int num){
		int key = -1;
		for(int i = 0; i < table.length; i++){
			key = ( num + ( 3 * i ) ) % table.length;
			if(!filled[key]){
				table[key] = num;
				filled[key] = true;
				return true;
			}
		}
		return false;
	}
	
	public String toString(){
		String ret = "";
		for(int i = 0; i < table.length; i++){
			ret = ret + i + "-" + table[i] + '\n';
		}
		return ret;
	}
}

package question1;

public class HashTester {
	
	public static void main(String[] args){
		
		Hash[] hash = new Hash[2];
		
		hash[0] = new Hash1();
		hash[1] = new Hash2();
		
		for(int i = 0; i < hash.length; i++)
			hash[i].add(66);
		for(int i = 0; i < hash.length; i++)
			hash[i].add(47);
		for(int i = 0; i < hash.length; i++)
			hash[i].add(87);
		for(int i = 0; i < hash.length; i++)
			hash[i].add(90);
		for(int i = 0; i < hash.length; i++)
			hash[i].add(126);
		for(int i = 0; i < hash.length; i++)
			hash[i].add(140);
		for(int i = 0; i < hash.length; i++)
			hash[i].add(145);
		for(int i = 0; i < hash.length; i++)
			hash[i].add(153);
		for(int i = 0; i < hash.length; i++)
			hash[i].add(177);
		for(int i = 0; i < hash.length; i++)
			hash[i].add(285);
		for(int i = 0; i < hash.length; i++)
			hash[i].add(393);
		for(int i = 0; i < hash.length; i++)
			hash[i].add(395);
		for(int i = 0; i < hash.length; i++)
			hash[i].add(467);
		for(int i = 0; i < hash.length; i++)
			hash[i].add(566);
		for(int i = 0; i < hash.length; i++)
			hash[i].add(620);
		for(int i = 0; i < hash.length; i++)
			hash[i].add(735);
		
		System.out.print(hash[0].toString());
		System.out.println("\n\n");
		System.out.print(hash[1].toString());

	}
}

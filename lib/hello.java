	public class hello{
		public static void main(String args[]){
		//Default value id "World"
		//Author name is Aman Khullar(akhullar@tavisca.in)
		//More Attractive
		String name;
		if(args.length>0){
			name=args[0];
			}
		else{
			name="World";
			}
			System.out.println("Hello "+name);	
		}
}
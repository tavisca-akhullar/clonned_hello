	public class hello{
		public static void main(String args[]){
		//Default value id "World"
		//Require greet
		
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
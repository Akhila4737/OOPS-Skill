package skill2;

public class pro3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Hello");
		sb.append(" World");
		System.out.println(sb);
        sb.insert(6, "Java ");
        System.out.println(sb);
        sb.replace(6, 10, "Awesome");
        System.out.println(sb);
        sb.delete(6, 13);      
        System.out.println(sb);
        sb.reverse();    
		System.out.println(sb);
		System.out.println(sb.capacity());
		

	}

}

package interfaces.pila.cola;

public class probador {

	public static  void main(String[] args) {
		PilaHL<Integer> p=new PilaHL<>();

		p.push(2);
		
		System.out.println(p.peek());
		p.pop();
		System.out.println(p.peek());
	}

}

package com.Poly_Morphism;

public class Method_2 extends Method_1 {
	public void siva() {

		System.out.println("I'm Surya");
		//super.siva();
		super.siva("rrr", "yyy");
	//	siva("rajni","vijay");
	}

	public void siva(String name, String son) {

		System.out.println("Rajni"+"  "+"Kamal");
	}

	public static void main(String[] args) {

		Method_2 plm = new Method_2();
		plm.siva();
		plm.siva("sss","uuu");
		

	}

}

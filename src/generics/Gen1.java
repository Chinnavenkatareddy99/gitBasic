package generics;

public class Gen1<Type> {
	Type obj;

	public Gen1(Type obj) {
		super();
		this.obj = obj;
	}

	Type getObj() {
		return obj;
	}

	void show() {
		System.out.println("the name of the type is:" + obj.getClass().getName());

	}

	public static void main(String[] args) {
		Gen1 g = new Gen1("String");
		g.show();
	}

}

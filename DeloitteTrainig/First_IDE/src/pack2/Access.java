package pack2;

public class Access {
public static void main(String[] args) {
	Singleton sc = Singleton.getObject();
	Singleton sc1 = Singleton.getObject();
	Singleton sc2 = Singleton.getObject();
	sc.display(100);
	sc1.display(200);
	sc2.display(300);
}
}

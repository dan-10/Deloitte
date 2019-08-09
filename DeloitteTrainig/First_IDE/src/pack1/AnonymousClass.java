package pack1;

interface Parent{
	public void play();
	public void pause();
}
public class AnonymousClass {
public static void main(String[] args) {
	Parent p = new Parent() {

		@Override
		public void play() {
			System.out.println("Playing");
			
		}

		@Override
		public void pause() {
			System.out.println("Pausing");
			
		}
		
	};
	
	p.pause();
	p.play();
}
}

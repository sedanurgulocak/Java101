package boxingMatch;

public class Main {

	public static void main(String[] args) {
		Fighter marc = new Fighter("Marc", 15, 100, 90, 0);
        Fighter alex = new Fighter("Alex", 10, 95, 100, 0);
        Ring r = new Ring(marc, alex, 90, 100);
        r.run();
        int start = (int) (Math.random() * 2);
        if (start == 0) {
            System.out.println("Marc Baþlýyor");
            Ring r1 = new Ring(alex, marc, 90, 100);
            r1.run();
        }
        if (start == 1) {
            System.out.println("Alex Baþlýyor");
            Ring r2 = new Ring(marc, alex, 90, 100);
            r2.run();
        }

	}

}

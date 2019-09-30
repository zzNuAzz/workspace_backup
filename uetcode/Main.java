// Language: Java
import java.util.*;
class Point {
	int x;
	int y;
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class Main {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Point> line = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			line.add(new Point(x,y));
		}

		Collections.sort(line, (Point x, Point y) -> {
			if(x != y) return x.x - y.x;
			return 0;
		});
		if(line.isEmpty()) return;
		int start = line.get(0).x;
		int end = line.get(0).y;
		for(int i = 1; i < line.size(); i++) {
			if(line.get(i).x <= end + 1) {
				end = line.get(i).y;
			}
			else {
				System.out.println(start + " " + end);
				start = line.get(i).x;
				end = line.get(i).y;
			}
		}

		System.out.println(start + " " + end);

	}
}


public class Circle {
	public static void main(String[] args) {
		
		float radius = 5;
		
		Area ref = new Area ();
		
		ref.CircleArea(radius);

	}

}

class Area
{
	public void CircleArea(float r)
	{
		float result = (22f/7) * r;
		System.out.print("Area of circle = " + result);
	}
}

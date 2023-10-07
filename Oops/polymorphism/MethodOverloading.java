// 
// 
// 
// compile time polymorphism
// 
// 
// 
class shape {
    // area for circle
    public float area(float radious) {
        return (3.14f * radious * radious);
    }

    // area for rectabgle
    public float area(float length, float breadth) {
        return (length * breadth);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        shape obj = new shape();

        // call circle area function
        float circlearea = obj.area(2.5f);

        // call circle area function
        float reactanglearea = obj.area(1.2f, 2.2f);

        System.out.println("area of circle " + circlearea);
        System.out.println("area of reactangle " + reactanglearea);

    }
}

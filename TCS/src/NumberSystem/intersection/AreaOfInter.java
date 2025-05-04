package NumberSystem.intersection;

public class AreaOfInter {
    public static void main(String[] args) {
        double X1=0,Y1=0,R1=4;
        double X2=6,Y2=0,R2=4;
        System.out.println(find(X1, Y1, R1, X2, Y2, R2));
    }
    public static double find(double X1, double Y1, double R1, double X2, double Y2, double R2){
        double d = Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2));
        // Check if the circles do not intersect
        if (d >= R1 + R2) {
            return 0;
        }
        // Check if one circle is completely inside the other
        if (d <= Math.abs(R1 - R2)) {
            return (int) Math.floor(3.14 * Math.pow(Math.min(R1, R2), 2));
        }
        // Calculate the area of NumberSystem.intersection
        double part1 = Math.pow(R1, 2) * Math.acos((Math.pow(d, 2) + Math.pow(R1, 2) - Math.pow(R2, 2)) / (2 * d * R1));
        double part2 = Math.pow(R2, 2) * Math.acos((Math.pow(d, 2) + Math.pow(R2, 2) - Math.pow(R1, 2)) / (2 * d * R2));
        double part3 = 0.5 * Math.sqrt((-d + R1 + R2) * (d + R1 - R2) * (d - R1 + R2) * (d + R1 + R2));

        double area = part1 + part2 - part3;

        // Return the floor of the area
        return (int) Math.floor(area);
    }

}






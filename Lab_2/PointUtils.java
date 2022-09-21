package Lab_2;

public class PointUtils {
    /**
     * Checks if 2d points values are the same
     * 
     * @param p1
     * @param p2
     * @return
     */
    public static boolean isEqual(Point2d p1, Point2d p2) {
        return (p1.getX() == p2.getX() && p1.getY() == p2.getY());
    }

    /**
     * Checks if 3d points values are the same
     * 
     * @param p1
     * @param p2
     * @return
     */
    public static boolean isEqual(Point3d p1, Point3d p2) {
        return (p1.getX() == p2.getX() && p1.getY() == p2.getY() && p1.getZ() == p2.getZ());
    }

    /**
     * Counts distance between 2 dots for 2d points
     * 
     * @param p1
     * @param p2
     * @return
     */
    public static double distanceTo(Point2d p1, Point2d p2) {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }

    /**
     * Counts distance between 2 dots for 3d points
     * 
     * @param p1
     * @param p2
     * @return
     */
    public static double distanceTo(Point3d p1, Point3d p2) {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2)
                + Math.pow(p2.getZ() - p1.getZ(), 2));
    }

    /**
     * Computes area of triangle
     * 
     * @param p1
     * @param p2
     * @param p3
     * @return
     */
    public static double computeArea(Point3d p1, Point3d p2, Point3d p3) {
        double aSide = Math.abs(distanceTo(p1, p2));
        double bSide = Math.abs(distanceTo(p2, p3));
        double cSide = Math.abs(distanceTo(p3, p1));

        double p = (aSide + bSide + cSide) / 2;

        return Math.sqrt(p * (p - aSide) * (p - bSide) * (p - cSide));
    }
}

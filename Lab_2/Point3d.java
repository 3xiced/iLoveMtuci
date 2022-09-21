package Lab_2;

/**
 * 3dim point class
 */
public class Point3d extends Point2d {

    /**
     * Z coord variable
     */
    private double zCoord;

    /**
     * Ctor all args
     * 
     * @param x
     * @param y
     * @param z
     */
    public Point3d(double x, double y, double z) {
        super(x, y);
        this.zCoord = z;
    }

    /**
     * Ctor 0 args
     */
    public Point3d() {
        super();
        this.zCoord = 0;
    }

    /**
     * 
     * Вовзращение координаты Z
     **/

    public double getZ() {
        return this.zCoord;
    }

    /**
     * 
     * Установка значения
     * координаты Z.
     **/

    public void setZ(double val) {
        this.zCoord = val;
    }
}

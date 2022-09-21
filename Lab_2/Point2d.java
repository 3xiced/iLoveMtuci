package Lab_2;

/*** Двумерный класс точки. **/
public class Point2d {
    /**
     * Координата X
     **/
    private double xCoord;
    /**
     * Координата Y
     **/
    private double yCoord;

    /**
     * Конструктор инициализации
     **/

    public Point2d(double x, double y) {
        xCoord = x;
        yCoord = y;
    }

    /**
     * 
     * Конструктор по умолчанию.
     **/

    public Point2d() {
        // Вызовите Конструктор с двумя параметрами и определите источник.
        this(0, 0);
    }

    /**
     * 
     * Вовзращение координаты X
     **/

    public double getX() {
        return xCoord;
    }

    /**
     * 
     * Вовзращение координаты Y
     **/

    public double getY() {
        return yCoord;
    }

    /**
     * 
     * Установка значения
     * координаты X.
     **/

    public void setX(double val) {
        xCoord = val;
    }

    /**
     * 
     * Установка значения
     * координаты Y.
     **/

    public void setY(double val) {
        yCoord = val;
    }
}
/**
 * Локация в 2D
 **/
public class Location {
    public int xCoord;
    public int yCoord;

    public Location(int x, int y) {
        xCoord = x;
        yCoord = y;
    }

    public Location() {
        this(0, 0);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        // Проверяем что объект - Location
        if (obj instanceof Location) {
            // Делаем неявное преобразование (каустуем)
            Location other = (Location) obj;

            // Сравниваем координаты
            if (xCoord == other.xCoord &&
                    yCoord == other.yCoord)
                return true;
        }
        return false;
    }

    // Хеширование чтобы идентифицировать уникальные объекты
    public int hashCode() {
        // Случайное просто числое
        int result = 3;

        result = 5 * result + (xCoord * 7);
        result = 11 * result + (yCoord * 13);

        return result;
    }
}
import java.util.HashMap;

/**
 * This class stores the basic state necessary for the A* algorithm to compute a
 * path across a map. This state includes a collection of "open waypoints" and
 * another collection of "closed waypoints." In addition, this class provides
 * the basic operations that the A* pathfinding algorithm needs to perform its
 * processing.
 **/
public class AStarState {
    /** This is a reference to the map that the A* algorithm is navigating. **/
    private Map2D map;

    private HashMap<Location, Waypoint> openWaypoints;

    private HashMap<Location, Waypoint> closedWaypoints;

    /**
     * Initialize a new state object for the A* pathfinding algorithm to use.
     **/
    public AStarState(Map2D map) {
        if (map == null)
            throw new NullPointerException("map cannot be null");

        this.map = map;

        openWaypoints = new HashMap<Location, Waypoint>();
        closedWaypoints = new HashMap<Location, Waypoint>();
    }

    /** Returns the map that the A* pathfinder is navigating. **/
    public Map2D getMap() {
        return map;
    }

    // Возвращает вейпоинт с наименьшим расстоянием, либо null
    public Waypoint getMinOpenWaypoint() {
        Waypoint sol = null;

        float min = Float.POSITIVE_INFINITY;
        float totalCost = 0;

        for (Waypoint p : openWaypoints.values()) {
            totalCost = p.getTotalCost();

            if (min > totalCost) {
                min = totalCost;
                sol = p;
            }
        }

        return sol;
    }

    /*
     * Добавляет вейпоинт в openWaypoints, если нет вейпоинта для данного
     * местоположения, то добавляет новый, если есть меняет на новый старый
     * если путь меньше
     */
    public boolean addOpenWaypoint(Waypoint newWP) {
        Waypoint temp = openWaypoints.get(newWP.getLocation());

        if (temp == null || newWP.getPreviousCost() < temp.getPreviousCost()) {
            openWaypoints.put(newWP.getLocation(), newWP);
            return true;
        }

        return false;
    }

    // Получить текущий размер открытых вейпоинтов
    public int numOpenWaypoints() {
        return openWaypoints.size();
    }

    // Перемещает из закрытых в открытую
    public void closeWaypoint(Location loc) {
        Waypoint point = openWaypoints.remove(loc);

        if (point != null) {
            closedWaypoints.put(loc, point);
        }
    }

    // Возвращает true если closedWaypoints содержит вейпоинт
    public boolean isLocationClosed(Location loc) {
        return closedWaypoints.containsKey(loc);
    }
}

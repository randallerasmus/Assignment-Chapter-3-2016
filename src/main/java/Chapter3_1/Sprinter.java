package Chapter3_1;
/**
 * Created by User on 2016/10/25.
 */
public class Sprinter {

    private String name;
    private String surname;
    private double height;
    private double topSpeed;
    private double bestTime;

    public Sprinter() {
    }

    public Sprinter(String name, String surname, double height, double topSpeed, double bestTime) {
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.topSpeed = topSpeed;
        this.bestTime = bestTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sprinter sprinter = (Sprinter) o;

        if (Double.compare(sprinter.bestTime, bestTime) != 0) return false;
        if (Double.compare(sprinter.height, height) != 0) return false;
        if (Double.compare(sprinter.topSpeed, topSpeed) != 0) return false;
        if (name != null ? !name.equals(sprinter.name) : sprinter.name != null) return false;
        if (surname != null ? !surname.equals(sprinter.surname) : sprinter.surname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(topSpeed);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(bestTime);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Sprinter{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", height=" + height +
                ", topSpeed=" + topSpeed +
                ", bestTime=" + bestTime +
                '}';
    }
}

package by.epamtc.entity;

public class Ball {
    private BallColor color;
    private int weight;

    public Ball(){}

    public Ball(BallColor color, int weight){
        this.color = color;
        this.weight = weight;
    }

    public BallColor getColor() {
        return color;
    }

    public void setColor(BallColor color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ball ball = (Ball) o;

        if (weight != ball.weight) return false;
        return color == ball.color;
    }

    @Override
    public int hashCode() {
        int result = color != null ? color.hashCode() : 0;
        result = 31 * result + weight;
        return result;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color=" + color +
                ", weight=" + weight +
                '}';
    }
}

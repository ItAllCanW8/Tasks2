package by.epamtc.entity;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Ball> balls;

    public Basket(){
        balls = new ArrayList<Ball>();
    }

    public Basket(ArrayList<Ball> balls){
        this();
        this.balls = balls;
    }

    public void addBall(Ball ball){
        balls.add(ball);
    }

    public void removeBall(Ball ball){
        balls.remove(ball);
    }

    public ArrayList<Ball> getBalls() {
        return balls;
    }

    public void setBalls(ArrayList<Ball> balls) {
        this.balls = balls;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Basket basket = (Basket) o;

        return balls != null ? balls.equals(basket.balls) : basket.balls == null;
    }

    @Override
    public int hashCode() {
        return balls != null ? balls.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "balls=" + balls +
                '}';
    }
}

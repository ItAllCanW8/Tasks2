package by.epamtc.main;

import by.epamtc.entity.Ball;
import by.epamtc.entity.BallColor;
import by.epamtc.entity.Basket;
import by.epamtc.logic.BasketLogic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Basket basket = new Basket();

        System.out.println("Enter wanted number of balls: ");

        int numOfBalls = 0;

        while(!scanner.hasNextInt())
            scanner.next();

        numOfBalls = scanner.nextInt();

        Ball ball = new Ball(BallColor.BLUE, 5);

        for (int i = 0; i < numOfBalls; i++)
            basket.addBall(ball);

        System.out.println("Weight of balls in our basket = " + BasketLogic.calcBasketWeight(basket));
        System.out.println("Number of blue balls in our basket = " + BasketLogic.countBlueBalls(basket));
    }
}

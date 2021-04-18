package by.epamtc.logic;

import by.epamtc.entity.Ball;
import by.epamtc.entity.BallColor;
import by.epamtc.entity.Basket;

public class BasketLogic {

    public static int calcBasketWeight(Basket basket){
        if(basket != null)
            return basket.getBalls().stream().mapToInt(Ball::getWeight).sum();
        else
            //NullPtrException
            return -1;
    }

    public static int countBlueBalls(Basket basket){
        if(basket != null)
            return (int) basket.getBalls().stream().filter(ball -> ball.getColor() == BallColor.BLUE).count();
        else
            //NullPtrException
            return -1;
    }
}

package HM8;

import HM8.ingredients;

public class Recipes {


        public static void main(String[] args) {
            ingredients bananaChocolateInAMug = new ingredients();
            bananaChocolateInAMug.name = "Banana Chocolate In A Mug";
            bananaChocolateInAMug.ingredient1 = "1 slice bread";
            bananaChocolateInAMug.ingredient2 = "1 egg";
            bananaChocolateInAMug.ingredient3 = "2 tablespoons milk";
            bananaChocolateInAMug.ingredient4  = "teaspoon cocoa powder";
            bananaChocolateInAMug. ingredient5 =  "banana, sliced";
            bananaChocolateInAMug.ingredient6 = "chocolate chip, to taste";


            ingredients eggRollMozzarellaSticks = new ingredients();
            eggRollMozzarellaSticks.name = "Egg Roll Mozzarella Sticks";
            eggRollMozzarellaSticks.ingredient1 = "5 egg roll wrappers";
            eggRollMozzarellaSticks.ingredient2 = "10 sticks string cheese";
            eggRollMozzarellaSticks.ingredient3 = "water";
            eggRollMozzarellaSticks.ingredient4  = "oil, for frying";
            eggRollMozzarellaSticks. ingredient5 =  "marinara sauce";

            bananaChocolateInAMug.iLikeToEat();
            eggRollMozzarellaSticks.iLikeToEat();

        }
    }



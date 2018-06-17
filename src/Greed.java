public class Greed {

    public int score(int[] dice) {
        int x;
        int result = 0;
        int ones = 0;
        int twos = 0;
        int threes = 0;
        int fours = 0;
        int fives = 0;
        int sixes = 0;

        int die = dice.length;
        if(die < 1) return(result);

        for(x=0; x<die; x++) {
            if(dice[x] == 1) ones++;
            if(dice[x] == 2) twos++;
            if(dice[x] == 3) threes++;
            if(dice[x] == 4) fours++;
            if(dice[x] == 5) fives++;
            if(dice[x] == 6) sixes++;
        }

        if(ones == 1) result += 100;
        if(fives == 1) result += 50;
        if(ones == 3) result += 1000;
        if(twos == 3) result += 200;
        if(threes == 3) result += 300;
        if(fours == 3) result += 400;
        if(fives == 3) result += 500;
        if(sixes == 3) result += 600;

        return(result);
    }

}

//http://en.wikipedia.org/wiki/Greed_%28dice_game%29
//
//        Greed (Dice Game)
//
//        Write a class Greed with a score() method that accepts an array of die values (up to 6). Scoring rules are as follows:
//
//        A single one (100)
//        A single five (50)
//        Triple ones [1,1,1] (1000)
//        Triple twos [2,2,2] (200)
//        Triple threes [3,3,3] (300)
//        Triple fours [4,4,4] (400)
//        Triple fives [5,5,5] (500)
//        Triple sixes [6,6,6] (600)
//        Note that the scorer should work for any number of dice up to 6.
//
//        Four-of-a-kind (Multiply Triple Score by 2)
//        Five-of-a-kind (Multiply Triple Score by 4)
//        Six-of-a-kind (Multiply Triple Score by 8)
//
//        Three Pairs [2,2,3,3,4,4] (800)
//
//        Straight [1,2,3,4,5,6] (1200)

public class Greed {

    public int score(int[] dice) {
        int x;
        int result = 0;
        int threePair = 0;
        int straight = 0;
        int[] numbers = new int[]{0,0,0,0,0,0,0};

        int die = dice.length;
        if(die < 1) return(result);

        for(x=0; x<die; x++) numbers[dice[x]]++;

        if(numbers[1] == 1) result += 100;
        if(numbers[5] == 1) result += 50;

        if(numbers[1] >= 3) result += 1000;
        if(numbers[2] >= 3) result += 200;
        if(numbers[3] >= 3) result += 300;
        if(numbers[4] >= 3) result += 400;
        if(numbers[5] >= 3) result += 500;
        if(numbers[6] >= 3) result += 600;

        for(x=1; x<7; x++) {
            if(numbers[x] == 4) result *= 2;
            if(numbers[x] == 5) result *= 4;
            if(numbers[x] == 6) result *= 8;
            if(numbers[x] == 2) threePair++;
            if(numbers[x] == 1) straight++;
        }

        if(threePair == 3) result += 800;
        if(straight == 6) result += 1200;

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

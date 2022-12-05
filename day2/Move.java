package day2;

public class Move {

    private int score;

    public Move (char value) {
        this.score = getNumberValue(value);
    }

    public int getScore() {
        return this.score;
    }

    public int getNumberValue (char value) {
        switch(value){
            case 'A':
            case 'X': // rock
                return 1;
            case 'B': 
            case 'Y': // paper
                return 2;
            case 'C': 
            case 'Z': // scissors
                return 3;
            default:
                return 0;
        }
    }

    public int getScore (char value) {
        int opponent = getNumberValue(value);
        if(this.score == opponent) { //tie
            return this.score + 3;
        }
        if(this.score == 3 && opponent == 1) { //edge case
            return this.score;
        }
        if(this.score > opponent || (this.score == 1 && opponent == 3)) { // win
            return this.score + 6;
        } else { // lose
            return this.score;
        }
    }
}

public class TennisGame {

    public static final String ZERO_SCORE_MESS = "Love";
    public static final String ONE_SCORE_MESS = "Fifteen";
    public static final String SECOND_SCORE_MESS = "Thirty";
    public static final String THIRD_SCORE_MESS = "Forty";
    public static final String ALL_MESSAGE = "-All";
    public static final String DEUCE_MESSAGE = "Deuce";

    public static String getScore(String firstPlayerName, String secondPlayerName, int firstPlayerScore, int secondPlayerScore) {
        String finalScore = "";
        int tempScore = 0;
        boolean isScoreEqual = firstPlayerScore == secondPlayerScore;
        if (isScoreEqual) {
            switch (firstPlayerScore) {
                case 0:
                    finalScore = ZERO_SCORE_MESS + ALL_MESSAGE;
                    break;
                case 1:
                    finalScore = ONE_SCORE_MESS + ALL_MESSAGE;
                    break;
                case 2:
                    finalScore = SECOND_SCORE_MESS + ALL_MESSAGE;
                    break;
                case 3:
                    finalScore = THIRD_SCORE_MESS + ALL_MESSAGE;
                    break;
                default:
                    finalScore = DEUCE_MESSAGE;
                    break;

            }
        } else {
            boolean bothScoreGreaterThan4 = firstPlayerScore >= 4 || secondPlayerScore >= 4;
            if (bothScoreGreaterThan4) {
                int Hon2Diem = firstPlayerScore - secondPlayerScore;
                boolean hon1Diem = Hon2Diem == 1;
                if (hon1Diem) finalScore = "Advantage player1";
                else {
                    boolean itHon1Diem = Hon2Diem == -1;
                    if (itHon1Diem) finalScore = "Advantage player2";
                    else if (Hon2Diem >= 2) finalScore = "Win for player1";
                    else finalScore = "Win for player2";
                }
            } else {
                for (int i = 1; i < 3; i++) {
                    if (i == 1) tempScore = firstPlayerScore;
                    else {
                        finalScore += "-";
                        tempScore = secondPlayerScore;
                    }
                    switch (tempScore) {
                        case 0:
                            finalScore += ZERO_SCORE_MESS;
                            break;
                        case 1:
                            finalScore += ONE_SCORE_MESS;
                            break;
                        case 2:
                            finalScore += SECOND_SCORE_MESS;
                            break;
                        case 3:
                            finalScore += THIRD_SCORE_MESS;
                            break;
                    }
                }
            }
        }
        return finalScore;
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TennisGame1 implements TennisGame {

    private int player1Score;
    private int player2Score;
    private final String player1Name;
    private final String player2Name;

    private List<String> xx;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;

        xx = new ArrayList<>();
        xx.add("Love");
        xx.add("Fifteen");
        xx.add("Thirty");
        xx.add("Forty");

        // Add code are found from findbug
        // if (player1Name == null || player2Name == null) {
        //     throw new IllegalArgumentException("Player names cannot be null");
        // }
    }

    public void wonPoint(String playerName) {
        if (Objects.equals(playerName, player1Name)) {
            player1Score += 1;
        } else {
            player2Score += 1;
        }
    }

    public String getScore() {
        StringBuilder score = new StringBuilder();
        int tempScore = 0;

        // Deuce
        if (isDeuce()) {
            return "Deuce";
        }

        // Normal
        if (player1Score == player2Score && player1Score < 3) {
            score = new StringBuilder(switch (player1Score) {
                case 0 -> "Love-All";
                case 1 -> "Fifteen-All";
                case 2 -> "Thirty-All";
                default -> "xxxx";
            });
            return score.toString();
        }


        if (player1Score >= 4 || player2Score >= 4) {
            int minusResult = player1Score - player2Score;
            if (minusResult == 1) {
                score = new StringBuilder("Advantage player1");
            } else if (minusResult == -1) {
                score = new StringBuilder("Advantage player2");
            } else if (minusResult >= 2) {
                score = new StringBuilder("Win for player1");
            } else {
                score = new StringBuilder("Win for player2");
            }
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = player1Score;
                else {
                    score.append("-");
                    tempScore = player2Score;
                }
                score.append(xx.get(tempScore));
            }
        }
        return score.toString();
    }

    private boolean isDeuce() {
        return player1Score == player2Score && player1Score > 2;
    }
}

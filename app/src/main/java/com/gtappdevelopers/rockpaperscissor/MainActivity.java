package com.gtappdevelopers.rockpaperscissor;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView computerIV, playerIV;
    private LinearLayout rockLL, paperLL, scissorLL;
    private TextView computerScoreTV, playerScoreTV, playerWonTV;
    private Button restartGameBtn;
    private int computerMove, computerScore, playerScore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        computerScore = 0;
        playerScore = 0;
        computerIV = findViewById(R.id.idIVComputer);
        playerIV = findViewById(R.id.idIVPlayer);
        rockLL = findViewById(R.id.idLLRock);
        paperLL = findViewById(R.id.idLLPaper);
        scissorLL = findViewById(R.id.idLLScissor);
        playerWonTV = findViewById(R.id.idTVPlayerWon);
        computerScoreTV = findViewById(R.id.idTVComputerScore);
        playerScoreTV = findViewById(R.id.idTVPlayerScore);
        restartGameBtn = findViewById(R.id.idBtnRestartGame);

        scissorLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerIV.setImageDrawable(getResources().getDrawable(R.drawable.scissors));
                Random random = new Random();
                computerMove = random.nextInt(4 - 1) + 1;
                Log.e("TAG", "computer move is " + computerMove);
                if (computerMove == 1) {
                    //computer move is rock
                    computerIV.setImageDrawable(getResources().getDrawable(R.drawable.rock));
                    playerWonTV.setText("Computer Won");
                    computerScore = computerScore + 1;
                    computerScoreTV.setText("" + computerScore);
                } else if (computerMove == 2) {
                    //computer move is paper
                    computerIV.setImageDrawable(getResources().getDrawable(R.drawable.paper));
                    playerWonTV.setText("Player Won");
                    playerScore = playerScore + 1;
                    playerScoreTV.setText("" + playerScore);
                } else {
                    //computer move is scissor
                    computerIV.setImageDrawable(getResources().getDrawable(R.drawable.scissors));
                    playerWonTV.setText("Draw");
                }
            }
        });

        paperLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerIV.setImageDrawable(getResources().getDrawable(R.drawable.paper));
                Random random = new Random();
                computerMove = random.nextInt(4 - 1) + 1;
                Log.e("TAG", "computer move is " + computerMove);
                if (computerMove == 1) {
                    //computer move is rock
                    computerIV.setImageDrawable(getResources().getDrawable(R.drawable.rock));
                    playerWonTV.setText("Player Won");
                    playerScore = playerScore + 1;
                    playerScoreTV.setText("" + playerScore);
                } else if (computerMove == 2) {
                    //computer move is paper
                    computerIV.setImageDrawable(getResources().getDrawable(R.drawable.paper));
                    playerWonTV.setText("Draw");

                } else {
                    //computer move is scissor
                    computerIV.setImageDrawable(getResources().getDrawable(R.drawable.scissors));
                    playerWonTV.setText("Computer Won");
                    computerScore = computerScore + 1;
                    computerScoreTV.setText("" + computerScore);
                }
            }
        });

        rockLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerIV.setImageDrawable(getResources().getDrawable(R.drawable.rock));
                Random random = new Random();
                computerMove = random.nextInt(4 - 1) + 1;
                Log.e("TAG", "computer move is " + computerMove);
                if (computerMove == 1) {
                    //computer move is rock
                    computerIV.setImageDrawable(getResources().getDrawable(R.drawable.rock));
                    playerWonTV.setText("Draw");

                } else if (computerMove == 2) {
                    //computer move is paper
                    computerIV.setImageDrawable(getResources().getDrawable(R.drawable.paper));
                    playerWonTV.setText("Computer Won");
                    computerScore = computerScore + 1;
                    computerScoreTV.setText("" + computerScore);

                } else {
                    //computer move is scissor
                    computerIV.setImageDrawable(getResources().getDrawable(R.drawable.scissors));
                    playerWonTV.setText("Player Won");
                    playerScore = playerScore + 1;
                    playerScoreTV.setText("" + playerScore);
                }
            }
        });

        restartGameBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computerScoreTV.setText("0");
                playerScoreTV.setText("0");
                playerWonTV.setText("");
                playerScore = 0;
                computerScore = 0;
                playerIV.setImageDrawable(getResources().getDrawable(R.drawable.question_mark));
                computerIV.setImageDrawable(getResources().getDrawable(R.drawable.question_mark));
            }
        });
    }
}
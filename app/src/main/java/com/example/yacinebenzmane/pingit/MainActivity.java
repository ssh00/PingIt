package com.example.yacinebenzmane.pingit;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends ActionBarActivity {
    private static double[] the_numbers;
    static int turn = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void  randomFill(){

        Random rand = new Random();
        for(int i = 0; i < 16; i++){
            this.the_numbers[i] = rand.nextInt();
        }
    }

    public void onClick(View v) {
        Button tile = (Button) v ;
        switch (tile.getId()) {
            case R.id.button:
                break ;
            case R.id.button_1:
                if ( turn == 0) {
                    player1 += numbers[0][0] ;
                    tile.setText("" + numbers[0][0]);
                } else {
                    player2 += numbers[0][0] ;
                    tile.setText("" + numbers[0][0]);
                }
                break ;
            case R.id.button_2:
                if ( turn == 0) {
                    player1 += numbers[0][1] ;
                    tile.setText("" + numbers[0][1]);
                } else {
                    player2 += numbers[0][1] ;
                    tile.setText("" + numbers[0][1]);
                }
                break ;
            case R.id.button_3:
                if ( turn == 0) {
                    player1 += numbers[0][2] ;
                    tile.setText("" + numbers[0][2]);
                } else {
                    player2 += numbers[0][2] ;
                    tile.setText("" + numbers[0][2]);
                }
                break ;
            case R.id.button_4:
                if ( turn == 0) {
                    player1 += numbers[0][3] ;
                    tile.setText("" + numbers[0][3]);
                } else {
                    player2 += numbers[0][3] ;
                    tile.setText("" + numbers[0][3]);
                }
                break ;
            case R.id.button_5:
                if ( turn == 0) {
                    player1 += numbers[1][0] ;
                    tile.setText("" + numbers[1][0]);
                } else {
                    player2 += numbers[1][0] ;
                    tile.setText("" + numbers[1][0]);
                }
                break ;
            case R.id.button_6:
                if ( turn == 0) {
                    player1 += numbers[1][1] ;
                    tile.setText("" + numbers[1][1]);
                } else {
                    player2 += numbers[1][1] ;
                    tile.setText("" + numbers[1][1]);
                }
                break ;
            case R.id.button_7:
                if ( turn == 0) {
                    player1 += numbers[1][2] ;
                    tile.setText("" + numbers[1][2]);
                } else {
                    player2 += numbers[1][2] ;
                    tile.setText("" + numbers[1][2]);
                }
                break ;
            case R.id.button_8:
                if ( turn == 0) {
                    player1 += numbers[1][3] ;
                    tile.setText("" + numbers[1][3]);
                } else {
                    player2 += numbers[1][3] ;
                    tile.setText("" + numbers[1][3]);
                }
                break ;
            case R.id.button_9:
                if ( turn == 0) {
                    player1 += numbers[1][3] ;
                    tile.setText("" + numbers[1][3]);
                } else {
                    player2 += numbers[1][3] ;
                    tile.setText("" + numbers[1][3]);
                }
                break ;
            case R.id.button_10:
                if ( turn == 0) {
                    player1 += numbers[1][3] ;
                    tile.setText("" + numbers[1][3]);
                } else {
                    player2 += numbers[1][3] ;
                    tile.setText("" + numbers[1][3]);
                }
                break ;
            case R.id.button_12:
                if ( turn == 0) {
                    player1 += numbers[1][3] ;
                    tile.setText("" + numbers[1][3]);
                } else {
                    player2 += numbers[1][3] ;
                    tile.setText("" + numbers[1][3]);
                }
                break ;
            case R.id.button_13:
                if ( turn == 0) {
                    player1 += numbers[1][3] ;
                    tile.setText("" + numbers[1][3]);
                } else {
                    player2 += numbers[1][3] ;
                    tile.setText("" + numbers[1][3]);
                }
                break ;
            case R.id.button_:
                if ( turn == 0) {
                    player1 += numbers[1][3] ;
                    tile.setText("" + numbers[1][3]);
                } else {
                    player2 += numbers[1][3] ;
                    tile.setText("" + numbers[1][3]);
                }
                break ;

        }

        playerOneResult.setText("" + player1) ;
        playerTwoResult.setText("" + player2);
        tile.setEnabled(false);
        if (turn == 0) {
            turn = 1 ;
        }
        else {
            turn = 0 ;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

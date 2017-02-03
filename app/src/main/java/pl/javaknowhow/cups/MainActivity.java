package pl.javaknowhow.cups;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView left, middle, right;
    Button new_game;
    List<Integer> cards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        left = (ImageView) findViewById(R.id.left);
        middle = (ImageView) findViewById(R.id.middle);
        right = (ImageView) findViewById(R.id.right);

        new_game = (Button) findViewById(R.id.new_game);


        cards = new ArrayList<>();
        cards.add(107); // six
        cards.add(207); // nine
        cards.add(407); // A



        new_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Collections.shuffle(cards);

                left.setImageResource(R.drawable.back);
                middle.setImageResource(R.drawable.back);
                right.setImageResource(R.drawable.back);
            }
        });

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //assign card
                if(cards.get(0) == 107) {
                    left.setImageResource(R.drawable.aclub);
                    Toast.makeText(MainActivity.this, "Guessed!", Toast.LENGTH_SHORT).show();
                } else if(cards.get(0) == 207) {
                    left.setImageResource(R.drawable.six);
                } else if(cards.get(0) == 407) {
                    left.setImageResource(R.drawable.nine);
                }

                if(cards.get(1) == 107) {
                    middle.setImageResource(R.drawable.aclub);
                } else if(cards.get(1) == 207) {
                    middle.setImageResource(R.drawable.six);
                } else if(cards.get(1) == 407) {
                    middle.setImageResource(R.drawable.nine);
                }

                if(cards.get(2) == 107) {
                    right.setImageResource(R.drawable.aclub);
                } else if(cards.get(2) == 207) {
                    right.setImageResource(R.drawable.six);
                } else if(cards.get(2) == 407) {
                    right.setImageResource(R.drawable.nine);
                }

            }
        });

        middle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //assign card
                if(cards.get(1) == 107) {
                    middle.setImageResource(R.drawable.aclub);
                    Toast.makeText(MainActivity.this, "Guessed!", Toast.LENGTH_SHORT).show();
                } else if(cards.get(1) == 207) {
                    middle.setImageResource(R.drawable.six);
                } else if(cards.get(1) == 407) {
                    middle.setImageResource(R.drawable.nine);
                }

                if(cards.get(0) == 107) {
                    left.setImageResource(R.drawable.aclub);
                } else if(cards.get(0) == 207) {
                    left.setImageResource(R.drawable.six);
                } else if(cards.get(0) == 407) {
                    left.setImageResource(R.drawable.nine);
                }

                if(cards.get(2) == 107) {
                    right.setImageResource(R.drawable.aclub);
                } else if(cards.get(2) == 207) {
                    right.setImageResource(R.drawable.six);
                } else if(cards.get(2) == 407) {
                    right.setImageResource(R.drawable.nine);
                }

            }
        });

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //assign card
                if(cards.get(2) == 107) {
                    right.setImageResource(R.drawable.aclub);
                    Toast.makeText(MainActivity.this, "Guessed!", Toast.LENGTH_SHORT).show();
                } else if(cards.get(2) == 207) {
                    right.setImageResource(R.drawable.six);
                } else if(cards.get(2) == 407) {
                    right.setImageResource(R.drawable.nine);
                }

                if(cards.get(0) == 107) {
                    left.setImageResource(R.drawable.aclub);
                } else if(cards.get(0) == 207) {
                    left.setImageResource(R.drawable.six);
                } else if(cards.get(0) == 407) {
                    left.setImageResource(R.drawable.nine);
                }

                if(cards.get(1) == 107) {
                    middle.setImageResource(R.drawable.aclub);
                } else if(cards.get(1) == 207) {
                    middle.setImageResource(R.drawable.six);
                } else if(cards.get(1) == 407) {
                    middle.setImageResource(R.drawable.nine);
                }
            }
        });
    }
}

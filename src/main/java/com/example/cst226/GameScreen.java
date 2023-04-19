package com.example.cst226;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;

public class GameScreen  extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gameactivity);
        StartGame(0);
    }
    private void StartGame(int wins)
    {
        int RoundsWon=wins;
        final int[] UserPoints = {0};
        final int[] DealerPoints = {0};
        final int[] NumOfDelt = {0};
        final int[] Clicked = {0};
        final int[] userpoint = new int[1];
        ArrayList<Integer> lstImages;
        //Image ArrayList
        lstImages = new ArrayList<Integer>();
        lstImages.add(R.drawable.aceclub);
        lstImages.add(R.drawable.club2);
        lstImages.add(R.drawable.club3);
        lstImages.add(R.drawable.club4);
        lstImages.add(R.drawable.club5);
        lstImages.add(R.drawable.club6);
        lstImages.add(R.drawable.club7);
        lstImages.add(R.drawable.club8);
        lstImages.add(R.drawable.club9);
        lstImages.add(R.drawable.club10);
        lstImages.add(R.drawable.clubjack);
        lstImages.add(R.drawable.clubqueen);
        lstImages.add(R.drawable.clubk);

        lstImages.add(R.drawable.acediamond);
        lstImages.add(R.drawable.diamond2);
        lstImages.add(R.drawable.diamond3);
        lstImages.add(R.drawable.diamond4);
        lstImages.add(R.drawable.diamond5);
        lstImages.add(R.drawable.diamond6);
        lstImages.add(R.drawable.diamond7);
        lstImages.add(R.drawable.diamond8);
        lstImages.add(R.drawable.diamond9);
        lstImages.add(R.drawable.diamond10);
        lstImages.add(R.drawable.diamondjack);
        lstImages.add(R.drawable.diamondqueen);
        lstImages.add(R.drawable.diamondking);

        lstImages.add(R.drawable.aceheart);
        lstImages.add(R.drawable.heart2);
        lstImages.add(R.drawable.heart3);
        lstImages.add(R.drawable.heart4);
        lstImages.add(R.drawable.heart5);
        lstImages.add(R.drawable.heart6);
        lstImages.add(R.drawable.heart7);
        lstImages.add(R.drawable.heart8);
        lstImages.add(R.drawable.heart9);
        lstImages.add(R.drawable.heart10);
        lstImages.add(R.drawable.heart24);
        lstImages.add(R.drawable.heart25);
        lstImages.add(R.drawable.heart26);
        lstImages.add(R.drawable.acespade);
        lstImages.add(R.drawable.spade2);
        lstImages.add(R.drawable.spade3);
        lstImages.add(R.drawable.spade4);
        lstImages.add(R.drawable.spade5);
        lstImages.add(R.drawable.spade6);
        lstImages.add(R.drawable.spade7);
        lstImages.add(R.drawable.spade8);
        lstImages.add(R.drawable.spade9);
        lstImages.add(R.drawable.spade10);
        lstImages.add(R.drawable.spade11);
        lstImages.add(R.drawable.spade12);
        lstImages.add(R.drawable.spade13);

        String ClubAce = lstImages.get(0).toString();
        String Club2 = lstImages.get(1).toString();
        String Club3 = lstImages.get(2).toString();
        String Club4 = lstImages.get(3).toString();
        String Club5 = lstImages.get(4).toString();
        String Club6 = lstImages.get(5).toString();
        String Club7 = lstImages.get(6).toString();
        String Club8 = lstImages.get(7).toString();
        String Club9 = lstImages.get(8).toString();
        String Club10 = lstImages.get(9).toString();
        String Club11 = lstImages.get(10).toString();
        String Club12 = lstImages.get(11).toString();
        String Club13 = lstImages.get(12).toString();
        String DieAce = lstImages.get(13).toString();
        String Die2 = lstImages.get(14).toString();
        String Die3 = lstImages.get(15).toString();
        String Die4 = lstImages.get(16).toString();
        String Die5 = lstImages.get(17).toString();
        String Die6 = lstImages.get(18).toString();
        String Die7 = lstImages.get(19).toString();
        String Die8 = lstImages.get(20).toString();
        String Die9 = lstImages.get(21).toString();
        String Die10 = lstImages.get(22).toString();
        String Die11 = lstImages.get(23).toString();
        String Die12 = lstImages.get(24).toString();
        String Die13 = lstImages.get(25).toString();
        String HeartAce = lstImages.get(26).toString();
        String Heart2 = lstImages.get(27).toString();
        String Heart3 = lstImages.get(28).toString();
        String Heart4 = lstImages.get(29).toString();
        String Heart5 = lstImages.get(30).toString();
        String Heart6 = lstImages.get(31).toString();
        String Heart7 = lstImages.get(32).toString();
        String Heart8 = lstImages.get(33).toString();
        String Heart9 = lstImages.get(34).toString();
        String Heart10 = lstImages.get(35).toString();
        String Heart11 = lstImages.get(36).toString();
        String Heart12 = lstImages.get(37).toString();
        String Heart13 = lstImages.get(38).toString();
        String SpadeAce = lstImages.get(39).toString();
        String Spade2 = lstImages.get(40).toString();
        String Spade3 = lstImages.get(41).toString();
        String Spade4 = lstImages.get(42).toString();
        String Spade5 = lstImages.get(43).toString();
        String Spade6 = lstImages.get(44).toString();
        String Spade7 = lstImages.get(45).toString();
        String Spade8 = lstImages.get(46).toString();
        String Spade9 = lstImages.get(47).toString();
        String Spade10 = lstImages.get(48).toString();
        String Spade11 = lstImages.get(49).toString();
        String Spade12 = lstImages.get(50).toString();
        String Spade13 = lstImages.get(51).toString();
        Collections.shuffle(lstImages);

        ImageView UCard1 = findViewById(R.id.UserCard1);//0
        ImageView UCard2 = findViewById(R.id.userCard2);//1
        ImageView UCard3 = findViewById(R.id.UserCard3);//2
        ImageView UCard4 = findViewById(R.id.UserCard4);//3
        ImageView UCard5 = findViewById(R.id.userCard5);//4
        ImageView UCard6 = findViewById(R.id.userCard6);//5
        ImageView UCard7 = findViewById(R.id.userCard7);//6
        ImageView UCard8 = findViewById(R.id.userCard8);//7
        ImageView UCard9 = findViewById(R.id.userCard9);//8
        ImageView UCard10 = findViewById(R.id.userCard10);//9
        ImageView UCard11 = findViewById(R.id.userCard11);//10

         ImageView DCard1 = findViewById(R.id.dealerCard1);//0
        ImageView DCard2 = findViewById(R.id.dealerCard2);//1
        ImageView DCard3 = findViewById(R.id.dealerCard3);//2
        ImageView DCard4 = findViewById(R.id.dealerCard4);//3
        ImageView DCard5 = findViewById(R.id.dealerCard5);//4
        ImageView DCard6 = findViewById(R.id.dealerCard6);//5
        ImageView DCard7 = findViewById(R.id.dealerCard7);//6
        ImageView DCard8 = findViewById(R.id.dealerCard8);//7
        ImageView DCard9 = findViewById(R.id.dealerCard9);//8
        ImageView DCard10 = findViewById(R.id.dealerCard10);//9
        ImageView DCard11 = findViewById(R.id.dealerCard11);//10
        UserPoints[0] = 0;
        Clicked[0] = 0;
        Button btnHit = findViewById(R.id.btnHit);
        Button btnStand = findViewById(R.id.btnStand);
        //<---------SET USER CARDS --------------->
        ArrayList<Integer> StartlstUCards;
        //Image ArrayList
        StartlstUCards = new ArrayList<Integer>();
        UCard1.setImageResource(lstImages.get(0));
        UCard2.setImageResource(lstImages.get(1));
        //<---------Reset Other Cards----------->
        UCard3.setImageResource(R.drawable.white);
        UCard4.setImageResource(R.drawable.white);
        UCard5.setImageResource(R.drawable.white);
        UCard6.setImageResource(R.drawable.white);
        UCard7.setImageResource(R.drawable.white);
        UCard8.setImageResource(R.drawable.white);
        UCard9.setImageResource(R.drawable.white);
        UCard10.setImageResource(R.drawable.white);
        UCard11.setImageResource(R.drawable.white);
        DCard2.setImageResource(R.drawable.b2fv);
        DCard3.setImageResource(R.drawable.white);
        DCard4.setImageResource(R.drawable.white);
        DCard5.setImageResource(R.drawable.white);
        DCard6.setImageResource(R.drawable.white);
        DCard7.setImageResource(R.drawable.white);
        DCard8.setImageResource(R.drawable.white);
        DCard9.setImageResource(R.drawable.white);
        DCard10.setImageResource(R.drawable.white);
        DCard11.setImageResource(R.drawable.white);

        StartlstUCards.add(Integer.parseInt(lstImages.get(0).toString()));
        StartlstUCards.add(Integer.parseInt(lstImages.get(1).toString()));
        //<----------END--------------->
        //<---------GET Current USER CARD AMOUNT--------------->
        userpoint[0] = CheckValues(StartlstUCards, ClubAce, Club2, Club3, Club4, Club5, Club6, Club7, Club8, Club9, Club10, Club11, Club12, Club13
                , DieAce, Die2, Die3, Die4, Die5, Die6, Die7, Die8, Die9, Die10, Die11, Die12, Die13,
                SpadeAce, Spade2, Spade3, Spade4, Spade5, Spade6, Spade7, Spade8, Spade9, Spade10, Spade11, Spade12, Spade13,
                HeartAce, Heart2, Heart3, Heart4, Heart5, Heart6, Heart7, Heart8, Heart9, Heart10, Heart11, Heart12, Heart13);

        TextView txt = findViewById(R.id.textView3);
        txt.setText("YOUR AMOUNT: " + userpoint[0]);
        //<---------END Current USER CARD AMOUNT--------------->
        //
        btnHit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Clicked[0]++;
                switch (Clicked[0]) {
                    case 1:
                        UCard3.setImageResource(lstImages.get(2));

                        StartlstUCards.add(Integer.parseInt(lstImages.get(2).toString()));
                        userpoint[0] = CheckValues(StartlstUCards, ClubAce, Club2, Club3, Club4, Club5, Club6, Club7, Club8, Club9, Club10, Club11, Club12, Club13
                                , DieAce, Die2, Die3, Die4, Die5, Die6, Die7, Die8, Die9, Die10, Die11, Die12, Die13,
                                SpadeAce, Spade2, Spade3, Spade4, Spade5, Spade6, Spade7, Spade8, Spade9, Spade10, Spade11, Spade12, Spade13,
                                HeartAce, Heart2, Heart3, Heart4, Heart5, Heart6, Heart7, Heart8, Heart9, Heart10, Heart11, Heart12, Heart13);
                        if (userpoint[0] > 21) {
                            FinishGame(RoundsWon);
                        }
                        txt.setText("YOUR AMOUNT: " + userpoint[0]);
                        break;
                    case 2:
                        UCard4.setImageResource(lstImages.get(3));
                        userpoint[0] = 0;
                        StartlstUCards.add(Integer.parseInt(lstImages.get(3).toString()));
                        userpoint[0] = CheckValues(StartlstUCards, ClubAce, Club2, Club3, Club4, Club5, Club6, Club7, Club8, Club9, Club10, Club11, Club12, Club13
                                , DieAce, Die2, Die3, Die4, Die5, Die6, Die7, Die8, Die9, Die10, Die11, Die12, Die13,
                                SpadeAce, Spade2, Spade3, Spade4, Spade5, Spade6, Spade7, Spade8, Spade9, Spade10, Spade11, Spade12, Spade13,
                                HeartAce, Heart2, Heart3, Heart4, Heart5, Heart6, Heart7, Heart8, Heart9, Heart10, Heart11, Heart12, Heart13);
                        if (userpoint[0] > 21) {
                            FinishGame(RoundsWon);
                        }
                        txt.setText("YOUR AMOUNT: " + userpoint[0]);
                        break;
                    case 3:
                        UCard5.setImageResource(lstImages.get(4));
                        userpoint[0] = 0;
                        StartlstUCards.add(Integer.parseInt(lstImages.get(4).toString()));
                        userpoint[0] = CheckValues(StartlstUCards, ClubAce, Club2, Club3, Club4, Club5, Club6, Club7, Club8, Club9, Club10, Club11, Club12, Club13
                                , DieAce, Die2, Die3, Die4, Die5, Die6, Die7, Die8, Die9, Die10, Die11, Die12, Die13,
                                SpadeAce, Spade2, Spade3, Spade4, Spade5, Spade6, Spade7, Spade8, Spade9, Spade10, Spade11, Spade12, Spade13,
                                HeartAce, Heart2, Heart3, Heart4, Heart5, Heart6, Heart7, Heart8, Heart9, Heart10, Heart11, Heart12, Heart13);
                        if (userpoint[0] > 21) {
                            FinishGame(RoundsWon);
                        }
                        txt.setText("YOUR AMOUNT: " + userpoint[0]);
                        break;
                    case 4:
                        UCard6.setImageResource(lstImages.get(5));
                        userpoint[0] = 0;
                        StartlstUCards.add(Integer.parseInt(lstImages.get(5).toString()));
                        userpoint[0] = CheckValues(StartlstUCards, ClubAce, Club2, Club3, Club4, Club5, Club6, Club7, Club8, Club9, Club10, Club11, Club12, Club13
                                , DieAce, Die2, Die3, Die4, Die5, Die6, Die7, Die8, Die9, Die10, Die11, Die12, Die13,
                                SpadeAce, Spade2, Spade3, Spade4, Spade5, Spade6, Spade7, Spade8, Spade9, Spade10, Spade11, Spade12, Spade13,
                                HeartAce, Heart2, Heart3, Heart4, Heart5, Heart6, Heart7, Heart8, Heart9, Heart10, Heart11, Heart12, Heart13);
                        if (userpoint[0] > 21) {
                            FinishGame(RoundsWon);
                        }
                        txt.setText("YOUR AMOUNT: " + userpoint[0]);
                        break;
                    case 5:
                        UCard7.setImageResource(lstImages.get(6));
                        userpoint[0] = 0;
                        StartlstUCards.add(Integer.parseInt(lstImages.get(6).toString()));
                        userpoint[0] = CheckValues(StartlstUCards, ClubAce, Club2, Club3, Club4, Club5, Club6, Club7, Club8, Club9, Club10, Club11, Club12, Club13
                                , DieAce, Die2, Die3, Die4, Die5, Die6, Die7, Die8, Die9, Die10, Die11, Die12, Die13,
                                SpadeAce, Spade2, Spade3, Spade4, Spade5, Spade6, Spade7, Spade8, Spade9, Spade10, Spade11, Spade12, Spade13,
                                HeartAce, Heart2, Heart3, Heart4, Heart5, Heart6, Heart7, Heart8, Heart9, Heart10, Heart11, Heart12, Heart13);
                        if (userpoint[0] > 21) {
                            FinishGame(RoundsWon);
                        }
                        txt.setText("YOUR AMOUNT: " + userpoint[0]);
                        break;
                    case 6:
                        UCard8.setImageResource(lstImages.get(7));
                        userpoint[0] = 0;
                        StartlstUCards.add(Integer.parseInt(lstImages.get(7).toString()));
                        userpoint[0] = CheckValues(StartlstUCards, ClubAce, Club2, Club3, Club4, Club5, Club6, Club7, Club8, Club9, Club10, Club11, Club12, Club13
                                , DieAce, Die2, Die3, Die4, Die5, Die6, Die7, Die8, Die9, Die10, Die11, Die12, Die13,
                                SpadeAce, Spade2, Spade3, Spade4, Spade5, Spade6, Spade7, Spade8, Spade9, Spade10, Spade11, Spade12, Spade13,
                                HeartAce, Heart2, Heart3, Heart4, Heart5, Heart6, Heart7, Heart8, Heart9, Heart10, Heart11, Heart12, Heart13);
                        if (userpoint[0] > 21) {
                            FinishGame(RoundsWon);
                        }
                        txt.setText("YOUR AMOUNT: " + userpoint[0]);
                        break;
                    case 7:
                        UCard9.setImageResource(lstImages.get(8));
                        userpoint[0] = 0;
                        StartlstUCards.add(Integer.parseInt(lstImages.get(8).toString()));
                        userpoint[0] = CheckValues(StartlstUCards, ClubAce, Club2, Club3, Club4, Club5, Club6, Club7, Club8, Club9, Club10, Club11, Club12, Club13
                                , DieAce, Die2, Die3, Die4, Die5, Die6, Die7, Die8, Die9, Die10, Die11, Die12, Die13,
                                SpadeAce, Spade2, Spade3, Spade4, Spade5, Spade6, Spade7, Spade8, Spade9, Spade10, Spade11, Spade12, Spade13,
                                HeartAce, Heart2, Heart3, Heart4, Heart5, Heart6, Heart7, Heart8, Heart9, Heart10, Heart11, Heart12, Heart13);
                        if (userpoint[0] > 21) {
                            FinishGame(RoundsWon);
                        }
                        txt.setText("YOUR AMOUNT: " + userpoint[0]);
                        break;
                    case 8:
                        UCard10.setImageResource(lstImages.get(9));
                        userpoint[0] = 0;
                        StartlstUCards.add(Integer.parseInt(lstImages.get(9).toString()));
                        userpoint[0] = CheckValues(StartlstUCards, ClubAce, Club2, Club3, Club4, Club5, Club6, Club7, Club8, Club9, Club10, Club11, Club12, Club13
                                , DieAce, Die2, Die3, Die4, Die5, Die6, Die7, Die8, Die9, Die10, Die11, Die12, Die13,
                                SpadeAce, Spade2, Spade3, Spade4, Spade5, Spade6, Spade7, Spade8, Spade9, Spade10, Spade11, Spade12, Spade13,
                                HeartAce, Heart2, Heart3, Heart4, Heart5, Heart6, Heart7, Heart8, Heart9, Heart10, Heart11, Heart12, Heart13);
                        if (userpoint[0] > 21) {
                            FinishGame(RoundsWon);
                        }
                        txt.setText("YOUR AMOUNT: " + userpoint[0]);
                        break;
                    case 9:
                        UCard11.setImageResource(lstImages.get(10));
                        userpoint[0] = 0;
                        StartlstUCards.add(Integer.parseInt(lstImages.get(10).toString()));
                        userpoint[0] = CheckValues(StartlstUCards, ClubAce, Club2, Club3, Club4, Club5, Club6, Club7, Club8, Club9, Club10, Club11, Club12, Club13
                                , DieAce, Die2, Die3, Die4, Die5, Die6, Die7, Die8, Die9, Die10, Die11, Die12, Die13,
                                SpadeAce, Spade2, Spade3, Spade4, Spade5, Spade6, Spade7, Spade8, Spade9, Spade10, Spade11, Spade12, Spade13,
                                HeartAce, Heart2, Heart3, Heart4, Heart5, Heart6, Heart7, Heart8, Heart9, Heart10, Heart11, Heart12, Heart13);
                        if (userpoint[0] > 21) {
                            FinishGame(RoundsWon);
                        }
                        txt.setText("YOUR AMOUNT: " + userpoint[0]);
                        break;
                }
            }
        });
        //<---------SET DEALER CARDS --------------->
        ArrayList<Integer> StartlstDCards;
        //Image ArrayList
        StartlstDCards = new ArrayList<Integer>();
         DCard1 = findViewById(R.id.dealerCard1);//0
        DCard1.setImageResource(lstImages.get(11));
        StartlstDCards.add(Integer.parseInt(lstImages.get(11).toString()));
        DCard1.setImageResource(lstImages.get(11));
         DCard2 = findViewById(R.id.dealerCard2);//0
        DCard2.setImageResource(R.drawable.b2fv);
        DealerPoints[0] = CheckValues(StartlstDCards, ClubAce, Club2, Club3, Club4, Club5, Club6, Club7, Club8, Club9, Club10, Club11, Club12, Club13
                , DieAce, Die2, Die3, Die4, Die5, Die6, Die7, Die8, Die9, Die10, Die11, Die12, Die13,
                SpadeAce, Spade2, Spade3, Spade4, Spade5, Spade6, Spade7, Spade8, Spade9, Spade10, Spade11, Spade12, Spade13,
                HeartAce, Heart2, Heart3, Heart4, Heart5, Heart6, Heart7, Heart8, Heart9, Heart10, Heart11, Heart12, Heart13);
        TextView txtD = findViewById(R.id.textView4);
        txtD.setText("Dealer AMOUNT: " + DealerPoints[0]);
        //<----------END--------------->
        btnStand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NumOfDelt[0]=0;
                while (DealerPoints[0]<17)
                {
                    DealerPoints[0]=0;
                    switch(NumOfDelt[0])
                    {
                        case 0:
                            ImageView DCard2 = findViewById(R.id.dealerCard2);//0
                            DCard2.setImageResource(lstImages.get(12));
                            StartlstDCards.add(Integer.parseInt(lstImages.get(12).toString()));
                            DealerPoints[0]=0;
                            DealerPoints[0] = CheckValues(StartlstDCards, ClubAce, Club2, Club3, Club4, Club5, Club6, Club7, Club8, Club9, Club10, Club11, Club12, Club13
                                    , DieAce, Die2, Die3, Die4, Die5, Die6, Die7, Die8, Die9, Die10, Die11, Die12, Die13,
                                    SpadeAce, Spade2, Spade3, Spade4, Spade5, Spade6, Spade7, Spade8, Spade9, Spade10, Spade11, Spade12, Spade13,
                                    HeartAce, Heart2, Heart3, Heart4, Heart5, Heart6, Heart7, Heart8, Heart9, Heart10, Heart11, Heart12, Heart13);
                            NumOfDelt[0]++;
                            txtD.setText("Dealer AMOUNT: " + DealerPoints[0]);
                            break;
                        case 1:

                            ImageView DCard3 = findViewById(R.id.dealerCard3);
                            DCard3.setImageResource(lstImages.get(13));
                            StartlstDCards.add(Integer.parseInt(lstImages.get(13).toString()));
                            DealerPoints[0]=0;
                            DealerPoints[0] = CheckValues(StartlstDCards, ClubAce, Club2, Club3, Club4, Club5, Club6, Club7, Club8, Club9, Club10, Club11, Club12, Club13
                                    , DieAce, Die2, Die3, Die4, Die5, Die6, Die7, Die8, Die9, Die10, Die11, Die12, Die13,
                                    SpadeAce, Spade2, Spade3, Spade4, Spade5, Spade6, Spade7, Spade8, Spade9, Spade10, Spade11, Spade12, Spade13,
                                    HeartAce, Heart2, Heart3, Heart4, Heart5, Heart6, Heart7, Heart8, Heart9, Heart10, Heart11, Heart12, Heart13);
                            NumOfDelt[0]++;
                            txtD.setText("Dealer AMOUNT: " + DealerPoints[0]);
                            break;
                        case 2:
                            ImageView DCard4 = findViewById(R.id.dealerCard3);
                            DCard4.setImageResource(lstImages.get(14));
                            StartlstDCards.add(Integer.parseInt(lstImages.get(14).toString()));
                            DealerPoints[0]=0;
                            DealerPoints[0] = CheckValues(StartlstDCards, ClubAce, Club2, Club3, Club4, Club5, Club6, Club7, Club8, Club9, Club10, Club11, Club12, Club13
                                    , DieAce, Die2, Die3, Die4, Die5, Die6, Die7, Die8, Die9, Die10, Die11, Die12, Die13,
                                    SpadeAce, Spade2, Spade3, Spade4, Spade5, Spade6, Spade7, Spade8, Spade9, Spade10, Spade11, Spade12, Spade13,
                                    HeartAce, Heart2, Heart3, Heart4, Heart5, Heart6, Heart7, Heart8, Heart9, Heart10, Heart11, Heart12, Heart13);
                            NumOfDelt[0]++;
                            txtD.setText("Dealer AMOUNT: " + DealerPoints[0]);
                            break;
                        case 3:
                            ImageView DCard5 = findViewById(R.id.dealerCard3);
                            DCard5.setImageResource(lstImages.get(15));
                            StartlstDCards.add(Integer.parseInt(lstImages.get(15).toString()));
                            DealerPoints[0]=0;
                            DealerPoints[0] = CheckValues(StartlstDCards, ClubAce, Club2, Club3, Club4, Club5, Club6, Club7, Club8, Club9, Club10, Club11, Club12, Club13
                                    , DieAce, Die2, Die3, Die4, Die5, Die6, Die7, Die8, Die9, Die10, Die11, Die12, Die13,
                                    SpadeAce, Spade2, Spade3, Spade4, Spade5, Spade6, Spade7, Spade8, Spade9, Spade10, Spade11, Spade12, Spade13,
                                    HeartAce, Heart2, Heart3, Heart4, Heart5, Heart6, Heart7, Heart8, Heart9, Heart10, Heart11, Heart12, Heart13);
                            NumOfDelt[0]++;
                            txtD.setText("Dealer AMOUNT: " + DealerPoints[0]);
                            break;
                        case 4:
                            ImageView DCard6 = findViewById(R.id.dealerCard3);
                            DCard6.setImageResource(lstImages.get(16));
                            StartlstDCards.add(Integer.parseInt(lstImages.get(16).toString()));
                            DealerPoints[0]=0;
                            DealerPoints[0] = CheckValues(StartlstDCards, ClubAce, Club2, Club3, Club4, Club5, Club6, Club7, Club8, Club9, Club10, Club11, Club12, Club13
                                    , DieAce, Die2, Die3, Die4, Die5, Die6, Die7, Die8, Die9, Die10, Die11, Die12, Die13,
                                    SpadeAce, Spade2, Spade3, Spade4, Spade5, Spade6, Spade7, Spade8, Spade9, Spade10, Spade11, Spade12, Spade13,
                                    HeartAce, Heart2, Heart3, Heart4, Heart5, Heart6, Heart7, Heart8, Heart9, Heart10, Heart11, Heart12, Heart13);
                            NumOfDelt[0]++;
                            txtD.setText("Dealer AMOUNT: " + DealerPoints[0]);
                            break;

                        case 5:
                            ImageView DCard7 = findViewById(R.id.dealerCard3);
                            DCard7.setImageResource(lstImages.get(17));
                            StartlstDCards.add(Integer.parseInt(lstImages.get(17).toString()));
                            DealerPoints[0]=0;
                            DealerPoints[0] = CheckValues(StartlstDCards, ClubAce, Club2, Club3, Club4, Club5, Club6, Club7, Club8, Club9, Club10, Club11, Club12, Club13
                                    , DieAce, Die2, Die3, Die4, Die5, Die6, Die7, Die8, Die9, Die10, Die11, Die12, Die13,
                                    SpadeAce, Spade2, Spade3, Spade4, Spade5, Spade6, Spade7, Spade8, Spade9, Spade10, Spade11, Spade12, Spade13,
                                    HeartAce, Heart2, Heart3, Heart4, Heart5, Heart6, Heart7, Heart8, Heart9, Heart10, Heart11, Heart12, Heart13);

                            txtD.setText("Dealer AMOUNT: " + DealerPoints[0]);
                            break;
                        case 6:
                            ImageView DCard8 = findViewById(R.id.dealerCard3);
                            DCard8.setImageResource(lstImages.get(18));
                            StartlstDCards.add(Integer.parseInt(lstImages.get(18).toString()));
                            DealerPoints[0]=0;
                            DealerPoints[0] = CheckValues(StartlstDCards, ClubAce, Club2, Club3, Club4, Club5, Club6, Club7, Club8, Club9, Club10, Club11, Club12, Club13
                                    , DieAce, Die2, Die3, Die4, Die5, Die6, Die7, Die8, Die9, Die10, Die11, Die12, Die13,
                                    SpadeAce, Spade2, Spade3, Spade4, Spade5, Spade6, Spade7, Spade8, Spade9, Spade10, Spade11, Spade12, Spade13,
                                    HeartAce, Heart2, Heart3, Heart4, Heart5, Heart6, Heart7, Heart8, Heart9, Heart10, Heart11, Heart12, Heart13);
                            NumOfDelt[0]++;
                            txtD.setText("Dealer AMOUNT: " + DealerPoints[0]);
                            break;
                        case 7:
                            ImageView DCard9 = findViewById(R.id.dealerCard3);
                            DCard9.setImageResource(lstImages.get(19));
                            StartlstDCards.add(Integer.parseInt(lstImages.get(19).toString()));
                            DealerPoints[0]=0;
                            DealerPoints[0] = CheckValues(StartlstDCards, ClubAce, Club2, Club3, Club4, Club5, Club6, Club7, Club8, Club9, Club10, Club11, Club12, Club13
                                    , DieAce, Die2, Die3, Die4, Die5, Die6, Die7, Die8, Die9, Die10, Die11, Die12, Die13,
                                    SpadeAce, Spade2, Spade3, Spade4, Spade5, Spade6, Spade7, Spade8, Spade9, Spade10, Spade11, Spade12, Spade13,
                                    HeartAce, Heart2, Heart3, Heart4, Heart5, Heart6, Heart7, Heart8, Heart9, Heart10, Heart11, Heart12, Heart13);
                            NumOfDelt[0]++;
                            txtD.setText("Dealer AMOUNT: " + DealerPoints[0]);
                            break;
                        case 8:
                            ImageView DCard10 = findViewById(R.id.dealerCard3);
                            DCard10.setImageResource(lstImages.get(20));
                            StartlstDCards.add(Integer.parseInt(lstImages.get(20).toString()));
                            DealerPoints[0]=0;
                            DealerPoints[0] = CheckValues(StartlstDCards, ClubAce, Club2, Club3, Club4, Club5, Club6, Club7, Club8, Club9, Club10, Club11, Club12, Club13
                                    , DieAce, Die2, Die3, Die4, Die5, Die6, Die7, Die8, Die9, Die10, Die11, Die12, Die13,
                                    SpadeAce, Spade2, Spade3, Spade4, Spade5, Spade6, Spade7, Spade8, Spade9, Spade10, Spade11, Spade12, Spade13,
                                    HeartAce, Heart2, Heart3, Heart4, Heart5, Heart6, Heart7, Heart8, Heart9, Heart10, Heart11, Heart12, Heart13);
                            NumOfDelt[0]++;
                            txtD.setText("Dealer AMOUNT: " + DealerPoints[0]);
                            break;
                    }
                }
                if (DealerPoints[0] > 16 && userpoint[0] < 22) {

                    CheckScore(DealerPoints[0], userpoint[0], RoundsWon);
                }
            }
        });
    }
    private int CheckValues(ArrayList<Integer> Cards, String clubAce, String club2, String club3, String club4, String club5, String club6, String club7, String club8, String club9, String club10, String club11, String club12, String club13,
                            String dieAce, String die2, String die3, String die4, String die5, String die6, String die7, String die8, String die9, String die10, String die11, String die12, String die13, String spadeAce, String spade2, String spade3, String spade4, String spade5, String spade6, String spade7, String spade8, String spade9, String spade10, String spade11, String spade12, String spade13, String heartAce, String heart2, String heart3, String heart4, String heart5, String heart6, String heart7, String heart8, String heart9, String heart10, String heart11, String heart12, String heart13) {
        int Point=0;
        for(int i =0; i<Cards.size();i++)
        {
            if(Cards.get(i)== Integer.parseInt(clubAce))
            {
                Point +=1;
            }
            if(Cards.get(i)== Integer.parseInt(club2))
            {
                Point +=2;
            }
            if(Cards.get(i)== Integer.parseInt(club3))
            {
                Point +=3;
            }
            if(Cards.get(i)== Integer.parseInt(club4))
            {
                Point +=4;
            }
            if(Cards.get(i)== Integer.parseInt(club5))
            {
                Point +=5;
            }
            if(Cards.get(i)== Integer.parseInt(club6))
            {
                Point +=6;
            }
            if(Cards.get(i)== Integer.parseInt(club7))
            {
                Point +=7;
            }
            if(Cards.get(i)== Integer.parseInt(club8))
            {
                Point +=8;
            }
            if(Cards.get(i)== Integer.parseInt(club9))
            {
                Point +=9;
            }
            if(Cards.get(i)== Integer.parseInt(club10))
            {
                Point +=10;
            }
            if(Cards.get(i)== Integer.parseInt(club11))
            {
                Point +=10;
            }
            if(Cards.get(i)== Integer.parseInt(club12))
            {
                Point +=10;
            }
            if(Cards.get(i)== Integer.parseInt(club13))
            {
                Point +=10;
            }
            if(Cards.get(i)== Integer.parseInt(dieAce))
            {
                Point +=1;
            }
            if(Cards.get(i)== Integer.parseInt(die2))
            {
                Point +=2;
            }
            if(Cards.get(i)== Integer.parseInt(die3))
            {
                Point +=3;
            }
            if(Cards.get(i)== Integer.parseInt(die4))
            {
                Point +=4;
            }
            if(Cards.get(i)== Integer.parseInt(die5))
            {
                Point +=5;
            }
            if(Cards.get(i)== Integer.parseInt(die6))
            {
                Point +=6;
            }
            if(Cards.get(i)== Integer.parseInt(die7))
            {
                Point +=7;
            }
            if(Cards.get(i)== Integer.parseInt(die8))
            {
                Point +=8;
            }
            if(Cards.get(i)== Integer.parseInt(die9))
            {
                Point +=9;
            }
            if(Cards.get(i)== Integer.parseInt(die10))
            {
                Point +=10;
            }
            if(Cards.get(i)== Integer.parseInt(die11))
            {
                Point +=10;
            }
            if(Cards.get(i)== Integer.parseInt(die12))
            {
                Point +=10;
            }
            if(Cards.get(i)== Integer.parseInt(die13))
            {
                Point +=10;
            }
            if(Cards.get(i)== Integer.parseInt(heartAce))
            {
                Point +=1;
            }
            if(Cards.get(i)== Integer.parseInt(heart2))
            {
                Point +=2;
            }
            if(Cards.get(i)== Integer.parseInt(heart3))
            {
                Point +=3;
            }
            if(Cards.get(i)== Integer.parseInt(heart4))
            {
                Point+=4;
            }
            if(Cards.get(i)== Integer.parseInt(heart5))
            {
                Point +=5;
            }
            if(Cards.get(i)== Integer.parseInt(heart6))
            {
                Point +=6;
            }
            if(Cards.get(i)== Integer.parseInt(heart7))
            {
                Point +=7;
            }
            if(Cards.get(i)== Integer.parseInt(heart8))
            {
                Point +=8;
            }
            if(Cards.get(i)== Integer.parseInt(heart9))
            {
                Point +=9;
            }
            if(Cards.get(i)== Integer.parseInt(heart10))
            {
                Point +=10;
            }
            if(Cards.get(i)== Integer.parseInt(heart11))
            {
                Point +=10;
            }
            if(Cards.get(i)== Integer.parseInt(heart12))
            {
                Point +=10;
            }
            if(Cards.get(i)== Integer.parseInt(heart13))
            {
                Point +=10;
            }
            if(Cards.get(i)== Integer.parseInt(spadeAce))
            {
                Point +=1;
            }
            if(Cards.get(i)== Integer.parseInt(spade2))
            {
                Point +=2;
            }
            if(Cards.get(i)== Integer.parseInt(spade3))
            {
                Point +=3;
            }
            if(Cards.get(i)== Integer.parseInt(spade4))
            {
                Point +=4;
            }
            if(Cards.get(i)== Integer.parseInt(spade5))
            {
                Point +=5;
            }
            if(Cards.get(i)== Integer.parseInt(spade6))
            {
                Point +=6;
            }
            if(Cards.get(i)== Integer.parseInt(spade7))
            {
                Point +=7;
            }
            if(Cards.get(i)== Integer.parseInt(spade8))
            {
                Point +=8;
            }
            if(Cards.get(i)== Integer.parseInt(spade9))
            {
                Point +=9;
            }
            if(Cards.get(i)== Integer.parseInt(spade10))
            {
                Point +=10;
            }
            if(Cards.get(i)== Integer.parseInt(spade11))
            {
                Point +=10;
            }
            if(Cards.get(i)== Integer.parseInt(spade12))
            {
                Point +=10;
            }
            if(Cards.get(i)== Integer.parseInt(spade13))
            {
                Point +=10;
            }
        }
        return Point;
    }
    private void CheckScore(int dealerPoint, int userPoint,int RoundsWon)
    {
        if(userPoint>dealerPoint)
        {
            TextView txt = findViewById(R.id.textView3);
            if (userPoint > 21)
            {

                FinishGame(RoundsWon);
            }
            else
            {
                RoundsWon++;
                StartGame(RoundsWon);
            }
        }
        if(dealerPoint>userPoint)
        {
            TextView txt = findViewById(R.id.textView3);
            if(dealerPoint>21)
            {
                RoundsWon++;
                StartGame(RoundsWon);
            }
            else
            {
                FinishGame(RoundsWon);
            }
        }
        if(dealerPoint==userPoint)
        {
            TextView txt = findViewById(R.id.textView3);
            StartGame(RoundsWon);
        }
    }
    private void FinishGame(int roundsWon)
    {
        new Thread( () ->{
            try{
                Thread.sleep(1000);
                String sVal = String.valueOf(roundsWon);
                Intent intent = new Intent( this,FinishingScreen.class); //Open the other activity
                intent.putExtra("wins",sVal);
                this.startActivity(intent);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
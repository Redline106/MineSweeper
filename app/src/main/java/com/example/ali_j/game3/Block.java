package com.example.ali_j.game3;

import java.util.Random;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.support.v7.widget.AppCompatButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableRow.LayoutParams;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ali_j on 2017-12-16.
 */


//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//



        public class Block extends android.support.v7.widget.AppCompatButton {
            private boolean isCovered;
            private boolean isMined;
            private boolean isFlagged;
            private boolean isQuestionMarked;
            private boolean isClickable;
            private int numberOfMinesInSurrounding;

            public Block(Context context) {
                super(context);
            }

            public Block(Context context, AttributeSet attrs) {
                super(context, attrs);
            }

            public Block(Context context, AttributeSet attrs, int defStyle) {
                super(context, attrs, defStyle);
            }

            @SuppressLint("ResourceType")
            public void setDefaults() {
                this.isCovered = true;
                this.isMined = false;
                this.isFlagged = false;
                this.isQuestionMarked = false;
                this.isClickable = true;
                this.numberOfMinesInSurrounding = 0;
                this.setBackgroundResource(R.drawable.back);
                this.setBoldFont();
            }

            @SuppressLint("ResourceType")
            public void setNumberOfSurroundingMines(int number) {
                this.setBackgroundColor(2130837511);
                this.updateNumber(number);
            }

            @SuppressLint("ResourceType")
            public void setMineIcon(boolean enabled) {
                this.setText("M");
                if(!enabled) {
                    this.setBackgroundColor(2130837511);
                    this.setTextColor(-65536);
                } else {
                    this.setTextColor(-16777216);
                }

            }

            @SuppressLint("ResourceType")
            public void setFlagIcon(boolean enabled) {
                this.setText("F");
                if(!enabled) {
                    this.setBackgroundColor(2130837511);
                    this.setTextColor(-65536);
                } else {
                    this.setTextColor(-16777216);
                }

            }

            @SuppressLint("ResourceType")
            public void setQuestionMarkIcon(boolean enabled) {
                this.setText("?");
                if(!enabled) {
                    this.setBackgroundColor(2130837511);
                    this.setTextColor(-65536);
                } else {
                    this.setTextColor(-16777216);
                }

            }

            @SuppressLint("ResourceType")
            public void     setBlockAsDisabled(boolean enabled) {
                if(!enabled) {
                    this.setBackgroundColor(2130837511);
                } else {
                    this.setBackgroundColor(2130837510);
                }

            }

            public void clearAllIcons() {
                this.setText("");
            }

            private void setBoldFont() {
                this.setTypeface((Typeface)null, 1);
            }

            public void OpenBlock() {
                if(this.isCovered) {
                    this.setBlockAsDisabled(false);
                    this.isCovered = false;
                    if(this.hasMine()) {
                        this.setMineIcon(false);
                    } else {
                        this.setNumberOfSurroundingMines(this.numberOfMinesInSurrounding);
                    }

                }
            }

            public void updateNumber(int text) {
                if(text != 0) {
                    this.setText(Integer.toString(text));
                    switch(text) {
                        case 1:
                            this.setTextColor(-16776961);
                            break;
                        case 2:
                            this.setTextColor(Color.rgb(0, 100, 0));
                            break;
                        case 3:
                            this.setTextColor(-65536);
                            break;
                        case 4:
                            this.setTextColor(Color.rgb(85, 26, 139));
                            break;
                        case 5:
                            this.setTextColor(Color.rgb(139, 28, 98));
                            break;
                        case 6:
                            this.setTextColor(Color.rgb(238, 173, 14));
                            break;
                        case 7:
                            this.setTextColor(Color.rgb(47, 79, 79));
                            break;
                        case 8:
                            this.setTextColor(Color.rgb(71, 71, 71));
                            break;
                        case 9:
                            this.setTextColor(Color.rgb(205, 205, 0));
                    }
                }

            }

            public void plantMine() {
                this.isMined = true;
            }

            public void triggerMine() {
                this.setMineIcon(true);
                this.setTextColor(-65536);
            }

            public boolean isCovered() {
                return this.isCovered;
            }

            public boolean hasMine() {
                return this.isMined;
            }

            public void setNumberOfMinesInSurrounding(int number) {
                this.numberOfMinesInSurrounding = number;
            }

            public int getNumberOfMinesInSorrounding() {
                return this.numberOfMinesInSurrounding;
            }

            public boolean isFlagged() {
                return this.isFlagged;
            }

            public void setFlagged(boolean flagged) {
                this.isFlagged = flagged;
            }

            public boolean isQuestionMarked() {
                return this.isQuestionMarked;
            }

            public void setQuestionMarked(boolean questionMarked) {
                this.isQuestionMarked = questionMarked;
            }

            public boolean isClickable() {
                return this.isClickable;
            }

            public void setClickable(boolean clickable) {
                this.isClickable = clickable;
            }
        }




package com.wilddog.boarddemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wilddog.board.WilddogBoard;
import com.wilddog.toolbar.boardtoolbar.ToolBarMenu;

public class MainActivity extends AppCompatActivity {

    private WilddogBoard boardView;
    private ToolBarMenu actionsMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boardView = (WilddogBoard) findViewById(R.id.board);
        boardView.setup("ts","canvasPath","abc");

        actionsMenu = (ToolBarMenu) findViewById(R.id.graphic_menu);
        actionsMenu.bindingBoard(boardView,this);
    }
}

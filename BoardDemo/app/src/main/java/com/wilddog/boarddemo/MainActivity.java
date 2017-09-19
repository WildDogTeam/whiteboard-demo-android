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
        boardView.setup("野狗appID","数据储存路径","用户ID");//数据储存路径：可以用户自定义；用户ID：用户自己定义

        actionsMenu = (ToolBarMenu) findViewById(R.id.graphic_menu);
        actionsMenu.bindingBoard(boardView,this);
    }
}

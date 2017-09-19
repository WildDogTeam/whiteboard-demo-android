# 白板demo说明

## 白板使用

### xml使用部分

```xml
  <com.wilddog.board.WilddogBoard
        android:id="@+id/board"
        android:layout_width="wrap_content"
        android:layout_height="400dp">
    </com.wilddog.board.WilddogBoard>
```

### 代码使用部分

```java
    WilddogBoard boardView = (WilddogBoard) findViewById(R.id.board);
    boardView.setup("野狗appID","数据储存路径","用户ID");//数据储存路径：可以用户自定义；用户ID：用户自己定义
```
## Toolbar使用

### xml使用部分

```xml
 <com.wilddog.toolbar.boardtoolbar.ToolBarMenu
        android:id="@+id/graphic_menu"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_centerHorizontal="true"
        android:layout_alignParentBottom="true"
        app:fab_interval="1dp"//间距
        app:fab_expandDirection="up"//扩展方向
        >
    </com.wilddog.toolbar.boardtoolbar.ToolBarMenu>
```

### 代码使用部分

```java
    ToolBarMenu actionsMenu = (ToolBarMenu) findViewById(R.id.graphic_menu);
    actionsMenu.bindingBoard(boardView,this);
```



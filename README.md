# 白板demo说明

## 添加权限

```xml
    <uses-permission android:name="android.permission.INTERNET" />
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
    <uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
    <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />
    <uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION" />
    <uses-permission android:name="android.permission.READ_PHONE_STATE" />
    <uses-permission android:name="android.permission.ACCESS_WIFI_STATE" />
```
## 引入toolbar工具栏 

demo提供默认工具栏，可在build文件中直接引入toobar类库：
```java
compile project(':toolbar')
```

## 七牛云存储

toolbar中引入七牛云存储存放图片文件：
```java
compile 'com.qiniu:qiniu-android-sdk:7.3.+'
```
使用过程中需要初始化七牛token和外链url，关于token和url的获取具体操作参考七牛官网。
```java
 QIniuUtil.getInstance().init(token,url);
```



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

## 

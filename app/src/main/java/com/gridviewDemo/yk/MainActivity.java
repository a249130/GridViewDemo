package com.gridviewDemo.yk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;
    private List<Integer> img_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img_list = new ArrayList<>();
        img_list.add(R.mipmap.deskclock);
        img_list.add(R.mipmap.email);
        img_list.add(R.mipmap.fileexplorer);
        img_list.add(R.mipmap.gallery);
        img_list.add(R.mipmap.maps);
        img_list.add(R.mipmap.monitor);
        img_list.add(R.mipmap.settings);
        img_list.add(R.mipmap.soundrecorder);
        img_list.add(R.mipmap.thememanager);
        img_list.add(R.mipmap.updater);
        img_list.add(R.mipmap.videoeditor);
        img_list.add(R.mipmap.weather);
        img_list.add(R.mipmap.minutes);
        img_list.add(R.mipmap.dropbox);
        img_list.add(R.mipmap.pinterest);
        img_list.add(R.mipmap.play_store);
        img_list.add(R.mipmap.twitter);
        gridView = (GridView) findViewById(R.id.gridview);
        gridView.setAdapter(new MyBaseAdapter(MainActivity.this, img_list));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(MainActivity.this, "当前点击的是第" + (position + 1) + "个", Toast.LENGTH_SHORT).show();
            }
        });
    }

    /**
     * 监听Back键按下事件,方法1:
     * 注意:
     * super.onBackPressed()会自动调用finish()方法,关闭
     * 当前Activity.
     * 若要屏蔽Back键盘,注释该行代码即可
     */
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        System.out.println("按下了back键   onBackPressed()");
    }


//    /**
//     * 监听Back键按下事件,方法2:
//     * 注意:
//     * 返回值表示:是否能完全处理该事件
//     * 在此处返回false,所以会继续传播该事件.
//     * 在具体项目中此处的返回值视情况而定.
//     */
//    @Override
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
//            System.out.println("按下了back键   onKeyDown()");
//            return false;
//        }else {
//            return super.onKeyDown(keyCode, event);
//        }
//
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        System.out.println("执行 onDestroy()");
//    }
}
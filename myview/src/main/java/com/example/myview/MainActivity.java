package com.example.myview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FrameLayout frameLayout=(FrameLayout)findViewById(R.id.mylayout);	// 获取帧布局管理器
        final RabbitView rabbit=new RabbitView(this);			// 创建并实例化RabbitView类
        //为小兔子添加触摸事件监听
        rabbit.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                rabbit.bitmapX=event.getX();			// 设置小兔子显示位置的X坐标
                rabbit.bitmapY=event.getY();			// 设置小兔子显示位置的Y坐标
                rabbit.invalidate();					//重绘rabbit组件
                return true;
            }
        });
        frameLayout.addView(rabbit);							//将rabbit添加到布局管理器中
    }
}

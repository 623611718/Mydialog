package activity.lz.example.com.mydialog.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import activity.lz.example.com.mydialog.Dialog.Mydialog;
import activity.lz.example.com.mydialog.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Mydialog mydialog = new Mydialog(this,R.style.dialog,"签到成功");
        mydialog.setTitle("成功");
        mydialog.setPositiveButton("确定");
        mydialog.setNegativeButton("取消");
        mydialog.show();
    }
}

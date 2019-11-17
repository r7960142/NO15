package com.example.no15;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button buttonToast = (Button) findViewById(R.id.button_Toast);
        buttonToast.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //利用Toast的靜態函式makeText來建立Toast物件
                Toast toast = Toast.makeText(MainActivity.this,"Hello world!", Toast.LENGTH_LONG);
                toast.show();//顯示Toast
            }
        });
        final Button button = (Button) findViewById(R.id.button_AlertDialog);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                new AlertDialog.Builder(MainActivity.this)//產生視窗物件
                        .setTitle("對話視窗測試")   		         //設定視窗標題
                        .setIcon(R.mipmap.ic_launcher)	             //設定對話視窗圖示
                        .setMessage("這是一個對話視窗")	         //設定顯示的內文字
                        .setPositiveButton("關閉視窗",new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();                   //dismiss:關閉回傳值 ；cancel:尚未完成工作關閉
                            }
                        })			                                 //設定結束的子視窗
                        .show();		                             //呈現對話視窗
            }
        });
    }
}

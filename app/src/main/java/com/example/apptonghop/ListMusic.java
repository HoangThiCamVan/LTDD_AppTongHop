package com.example.apptonghop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class ListMusic extends AppCompatActivity{
        private ListView listProduct;

        String[] name={
                "Hoa nở không màu","Thích thì đến","Mẹ yêu","Đồi hoa mặt trời","Cha và con gái",
        };
        String[] type={
                "Hoài Lâm","Trịnh Thăng Bình","Thùy Chi","Hoàng Yến","Thùy Chi",
        };
        Integer[] imgid={
                R.drawable.product_hnkm,R.drawable.product_ttd,R.drawable.product_my,R.drawable.product_dhmt,R.drawable.product_cvcg,
        };

        Button btAcc;
        Button qlLogin;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.listmusic);
            btAcc=(Button)findViewById(R.id.btt_acc);
            btAcc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   openProfile();
                }
            });

            qlLogin=(Button) findViewById(R.id.ql_login);
            qlLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openLogin();
                }
            });


            CustomerAdapter adapter=new CustomerAdapter(this,name,type,imgid);
            listProduct=(ListView) findViewById(R.id.listProduct);
            listProduct.setAdapter(adapter);






        }
        public void openProfile(){
            Intent it=new Intent(ListMusic.this,Profile.class);
            startActivity(it);
        }
    public void openLogin(){
        Intent it=new Intent(ListMusic.this,Login.class);
        startActivity(it);
    }
}

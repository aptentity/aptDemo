package com.aptentity.aptdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.aptentity.api.LCJViewBinder;
import com.aptentity.aptdemo.bean.User;
import com.aptentity.injectview.BindView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @BindView(R.id.bt_convertParcelable)
    public Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //findViewById(R.id.bt_convertParcelable).setOnClickListener(this);
        LCJViewBinder.bind(this);

        btn.setOnClickListener(this);

        User user = getIntent().getParcelableExtra("user");

        if (user!=null){
            Log.i("zfl","user name = "+user.getName());
            Log.i("zfl","user age = "+user.getAge());
        }else {
            Log.i("zfl","user empty");
        }

    }



    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bt_convertParcelable:
                openActivity();
                break;
            default:
                break;
        }
    }

    private void openActivity(){
        User user = new User();
        user.setName("zhangsan");
        user.setAge(18);

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("user", user.convertParcelable());
        startActivity(intent);
    }
}

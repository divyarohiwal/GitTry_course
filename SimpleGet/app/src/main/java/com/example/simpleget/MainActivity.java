package com.example.simpleget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    TextView userid,id,title,status;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userid = (TextView)findViewById(R.id.userid);
        id = (TextView)findViewById(R.id.id);
        title = (TextView)findViewById(R.id.title);
        status = (TextView)findViewById(R.id.status);
        getdata();

    }

    private void getdata(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.Base_Url)
                .addConverterFactory(GsonConverterFactory.create()).build();

        Api api = retrofit.create(Api.class);

        Call<id> call = api.getdata();

        call.enqueue(new Callback<id>() {
            @Override
            public void onResponse(Call<id> call, Response<id> response) {
                id result = response.body();
                userid.setText(result.getUserId());
                id.setText(result.getId());
                title.setText(result.getTitle());
                status.setText(result.getCompleted());
            }

            @Override
            public void onFailure(Call<id> call, Throwable t) {

            }
        });



    }
}

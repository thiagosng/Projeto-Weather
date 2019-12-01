package com.example.haroon.myweathertutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    TextView t1_temp,t2_city,t3_description,t4_date, t5_temp, t6_city, t7_description, t8_date , t9_temp,t10_city,t11_description,t12_date;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        t1_temp = (TextView)findViewById(R.id.textView);
        t2_city = (TextView)findViewById(R.id.textView3);
        t3_description = (TextView)findViewById(R.id.textView4);
        t4_date = (TextView)findViewById(R.id.textView2);

        t5_temp = (TextView)findViewById(R.id.textView8);
        t6_city = (TextView)findViewById(R.id.textView6);
        t7_description = (TextView)findViewById(R.id.textView10);
        t8_date = (TextView)findViewById(R.id.textView9);

        t9_temp = (TextView)findViewById(R.id.textView14);
        t10_city = (TextView)findViewById(R.id.textView12);
        t11_description = (TextView)findViewById(R.id.textView15);
        t12_date = (TextView)findViewById(R.id.textView13);



        }
    public void Palmares(View vi){
        find_weather();
    }

    public void Caruaru(View v){

        find_weather2();
    }
    public void Recife(View  view){
        find_weather3();


    }






    public void find_weather()

    {




        String a = "https://api.openweathermap.org/data/2.5/weather?q=Palmares,BR&appid=f0472b9d3186d8fa223376f0520910c3";
        String url = a;





        JsonObjectRequest jor = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try
                {
                    JSONObject main_object = response.getJSONObject("main");
                    JSONArray array = response.getJSONArray("weather");
                    JSONObject object = array.getJSONObject(0);
                    String temp = String.valueOf(main_object.getDouble("temp"));
                    String description = object.getString("description");
                    String city = response.getString("name");

                    //  t1_temp.setText(temp);
                    t2_city.setText(city);
                    t3_description.setText(description);

                    Calendar calendar = Calendar.getInstance();
                    SimpleDateFormat sdf = new SimpleDateFormat("EEEE  dd-MM");
                    String formatted_date = sdf.format(calendar.getTime());

                    t4_date.setText(formatted_date);

                    double temp_int = Double.parseDouble(temp);
                    double centi = (temp_int-273) ;
                    centi = Math.round(centi);
                    int i = (int)centi;
                    t1_temp.setText(String.valueOf(i));



                }catch(JSONException e)
                {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }
        );
        RequestQueue queue = Volley.newRequestQueue(this);
        queue.add(jor);


    }

    public void find_weather2()

    {




        String a = "https://api.openweathermap.org/data/2.5/weather?q=Caruaru,BR&appid=f0472b9d3186d8fa223376f0520910c3";
        String url = a;





        JsonObjectRequest jor = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try
                {
                    JSONObject main_object = response.getJSONObject("main");
                    JSONArray array = response.getJSONArray("weather");
                    JSONObject object = array.getJSONObject(0);
                    String temp = String.valueOf(main_object.getDouble("temp"));
                    String description = object.getString("description");
                    String city = response.getString("name");

                    //  t1_temp.setText(temp);
                    t6_city.setText(city);
                    t7_description.setText(description);

                    Calendar calendar = Calendar.getInstance();
                    SimpleDateFormat sdf = new SimpleDateFormat("EEEE  dd-MM");
                    String formatted_date = sdf.format(calendar.getTime());

                    t8_date.setText(formatted_date);

                    double temp_int = Double.parseDouble(temp);
                    double centi = (temp_int-273) ;
                    centi = Math.round(centi);
                    int i = (int)centi;
                    t5_temp.setText(String.valueOf(i));



                }catch(JSONException e)
                {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }
        );
        RequestQueue queue = Volley.newRequestQueue(this);
        queue.add(jor);


    }

    public void find_weather3()

    {




        String a = "https://api.openweathermap.org/data/2.5/weather?q=Recife,BR&appid=f0472b9d3186d8fa223376f0520910c3";
        String url = a;





        JsonObjectRequest jor = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try
                {
                    JSONObject main_object = response.getJSONObject("main");
                    JSONArray array = response.getJSONArray("weather");
                    JSONObject object = array.getJSONObject(0);
                    String temp = String.valueOf(main_object.getDouble("temp"));
                    String description = object.getString("description");
                    String city = response.getString("name");

                    //  t1_temp.setText(temp);
                    t10_city.setText(city);
                    t11_description.setText(description);

                    Calendar calendar = Calendar.getInstance();
                    SimpleDateFormat sdf = new SimpleDateFormat("EEEE  dd-MM");
                    String formatted_date = sdf.format(calendar.getTime());

                    t12_date.setText(formatted_date);

                    double temp_int = Double.parseDouble(temp);
                    double centi = (temp_int-273) ;
                    centi = Math.round(centi);
                    int i = (int)centi;
                    t9_temp.setText(String.valueOf(i));



                }catch(JSONException e)
                {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }
        );
        RequestQueue queue = Volley.newRequestQueue(this);
        queue.add(jor);


    }



}
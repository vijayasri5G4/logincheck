package com.example.mypc.myapplication;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        JSONObject root=new JSONObject();
        public boolean isJordanHere(JSONObject root) {
            try {
                JSONArray contacts = root.getJSONArray("contacts");
                for(int i=0; i<contacts.length(); i++)
                {
                    String name = contacts.getJSONObject(i).getString("name");
                    if("vijayasri".equals(name))
                    {
                        return true;
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
                return false;
            }

            return false;
        }



    }
}
package com.uninorte.actividadtres;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView;
import android.widget.EditText;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private int i=1;
    private ViewGroup layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = (ViewGroup) findViewById(R.id.content);
    }



    public void addLeft(View button)
    {
        addChild(true);
    }

    private void addChild(boolean right)
    {

        LayoutInflater inflater = LayoutInflater.from(this);
        int id = R.layout.layout_left;
        if (right)
        {
            id = R.layout.layout_left;
        }

        LinearLayout linearLayout = (LinearLayout) inflater.inflate(id, null, false);

        TextView textView = (TextView) linearLayout.findViewById(R.id.textView2);
        EditText editText = (EditText) linearLayout.findViewById(R.id.editText2);
        textView.setText("Campo "+i);
        Log.d("El mensaje", editText.getText()+"");
        layout.addView(linearLayout);
        i=i+1;
    }


}

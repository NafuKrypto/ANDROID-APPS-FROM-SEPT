package com.example.hp.bulletjournal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.InputType;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class Class extends AppCompatActivity {
private  Button buttonAdd;
private LinearLayout parentlayout;
    private int hint=0,tint=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class);
        buttonAdd=(Button)findViewById(R.id.addbtn);
        parentlayout=(LinearLayout)findViewById(R.id.parentLayout);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
System.out.print("commit");
createEditText();
            }
        });

    }

    protected void createEditText(){
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams (
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        params.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        params.setMargins(0,10,10,10);

        EditText edittTxt1 = new EditText(this);
        int maxLength = 10;
        hint++;
        edittTxt1.setHint("Course"+hint);
        edittTxt1.setLayoutParams(params);
        // edtTxt.setBackgroundColor(Color.WHITE);
        edittTxt1.setInputType(InputType.TYPE_CLASS_TEXT);
        edittTxt1.setTextSize(TypedValue.COMPLEX_UNIT_SP,18);
        edittTxt1.setId(hint);
        InputFilter[] fArray = new InputFilter[1];
        fArray[0] = new InputFilter.LengthFilter(maxLength);
        edittTxt1.setFilters(fArray);
        parentlayout.addView(edittTxt1);


        EditText edittTxt2 = new EditText(this);
        int maxLength2 = 5;
        tint++;
        edittTxt2.setHint("Sec"+tint);
        edittTxt2.setLayoutParams(params);
        // edtTxt.setBackgroundColor(Color.WHITE);
        edittTxt2.setInputType(InputType.TYPE_CLASS_TEXT);
        edittTxt2.setTextSize(TypedValue.COMPLEX_UNIT_SP,18);
        edittTxt2.setId(tint);
        InputFilter[] fArray2 = new InputFilter[1];
        fArray2[0] = new InputFilter.LengthFilter(maxLength2);
        edittTxt2.setFilters(fArray2);
        parentlayout.addView(edittTxt2);


//Save Button dynamic
        Button myButton = new Button(this);
        myButton.setText("Save me");
        LinearLayout ll=(LinearLayout)findViewById(R.id.parentLayout);
        LinearLayout.LayoutParams lp=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);

        lp.setMargins(50,50,0,100);
        ll.addView(myButton,lp);
    }

}

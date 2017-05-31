package np.com.maheshyadav.calculator;

import android.support.annotation.FloatRange;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public float dis1=0,dis2=0;
    public char sym='c';


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick1(View V){

        TextView txtDis=(TextView)findViewById(R.id.txtDisplay);
        txtDis.setText(txtDis.getText()+"1");

    }
    public void onClick2(View V){

        TextView txtDis=(TextView)findViewById(R.id.txtDisplay);
        txtDis.setText(txtDis.getText()+"2");

    }
    public void onClick3(View V){

        TextView txtDis=(TextView)findViewById(R.id.txtDisplay);
        txtDis.setText(txtDis.getText()+"3");

    }
    public void onClick4(View V){

        TextView txtDis=(TextView)findViewById(R.id.txtDisplay);
        txtDis.setText(txtDis.getText()+"4");

    }
    public void onClick5(View V){

        TextView txtDis=(TextView)findViewById(R.id.txtDisplay);
        txtDis.setText(txtDis.getText()+"5");

    }
    public void onClick6(View V){

        TextView txtDis=(TextView)findViewById(R.id.txtDisplay);
        txtDis.setText(txtDis.getText()+"6");

    }
    public void onClick7(View V){

        TextView txtDis=(TextView)findViewById(R.id.txtDisplay);
        txtDis.setText(txtDis.getText()+"7");

    }
    public void onClick8(View V){

        TextView txtDis=(TextView)findViewById(R.id.txtDisplay);
        txtDis.setText(txtDis.getText()+"8");

    }
    public void onClick9(View V){

        TextView txtDis=(TextView)findViewById(R.id.txtDisplay);
        txtDis.setText(txtDis.getText()+"9");

    }
    public void onClickdot(View V){

        TextView txtDis=(TextView)findViewById(R.id.txtDisplay);
        txtDis.setText(txtDis.getText()+".");

    }
    public void onClickClean(View V){

        TextView txtDis=(TextView)findViewById(R.id.txtDisplay);
        txtDis.setText("");

    }
    public void onClickPlus(View V){

        TextView txtDis=(TextView)findViewById(R.id.txtDisplay);
        dis1= Float.parseFloat(txtDis.getText().toString());
        sym='+';
        txtDis.setText("");

    }
    public void onClickMinus(View V){

        TextView txtDis=(TextView)findViewById(R.id.txtDisplay);
        dis1= Float.parseFloat(txtDis.getText().toString());
        sym='-';
        txtDis.setText("");

    }
    public void onClickMul(View V){

        TextView txtDis=(TextView)findViewById(R.id.txtDisplay);
        dis1= Float.parseFloat(txtDis.getText().toString());
        sym='*';
        txtDis.setText("");

    }
    public void onClickEqual(View V){
        float result=0;
        TextView txtDis=(TextView)findViewById(R.id.txtDisplay);
        dis2= Float.parseFloat(txtDis.getText().toString());

        if (sym=='+')
        {
           result= dis1+dis2;
        }
        else if (sym=='-')
        {
            result= dis1-dis2;
        }
         else if (sym=='*')
        {
            result= dis1*dis2;
        }

        String mytext=Float.toString(result);
        txtDis.setText(mytext);


    }



}

package work.example.androidlove;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setContentView(R.id.showButton);
       
        
        
     
    }
    
    public void onButtonShow(View view){
    	
   	 TextView myTextView = (TextView)findViewById(R.id.myTextView);
   	 	myTextView.setVisibility(View.VISIBLE);
   	
   }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

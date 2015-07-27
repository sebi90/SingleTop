package sebi.singletop;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView_text = (TextView) findViewById(R.id.textView_text);
        textView_text.setText("onCreate() ausgeführt. android:launchMode=\"standard\" gesetzt.");
    }

    @Override
    protected void onNewIntent (Intent intent) {
        TextView textView_text2 = (TextView) findViewById(R.id.textView_text2);
        textView_text2.setText("onNewIntent() ausgeführt. android:launchMode=\"singleTop\" gesetzt.");
    }

    public void startNewActivity(View view) {
        TextView textView_text2 = (TextView) findViewById(R.id.textView_text2);
        TextView textView_text = (TextView) findViewById(R.id.textView_text);
        textView_text.setText("");
        textView_text2.setText("");
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

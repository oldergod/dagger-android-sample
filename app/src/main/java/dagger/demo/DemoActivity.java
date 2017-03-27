package dagger.demo;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import dagger.android.AndroidInjection;
import dagger.android.DaggerActivity;

public class DemoActivity extends DaggerActivity {
  @Override protected void onCreate(Bundle savedInstanceState) {
    AndroidInjection.inject(this);
    super.onCreate(savedInstanceState);

    setContentView(R.layout.activity_demo);
    if (savedInstanceState == null) {
      getFragmentManager().beginTransaction().add(R.id.container, new DemoFragment()).commit();
    }
  }

  @Override public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.demo, menu);
    return true;
  }

  @Override public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();
    if (id == R.id.action_settings) {
      return true;
    }
    return super.onOptionsItemSelected(item);
  }
}

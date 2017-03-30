package dagger.demo;

import android.os.Bundle;
import dagger.android.DaggerActivity;
import javax.inject.Inject;

public class Demo2Activity extends DaggerActivity {
  @Inject DemoSharedClass demoSharedClass;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_demo2);
  }
}

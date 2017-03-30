package dagger.demo;

import android.app.Activity;
import javax.inject.Inject;

public class DemoSharedClass {
  Activity activity;

  @Inject public DemoSharedClass(Activity activity) {
    this.activity = activity;
  }

  public void log() {
    System.out.println(activity.toString());
  }
}

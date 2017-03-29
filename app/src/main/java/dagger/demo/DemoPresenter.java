package dagger.demo;

import android.app.Activity;
import javax.inject.Inject;

public class DemoPresenter {
  Activity activity;

  @Inject public DemoPresenter(Activity activity) {
    this.activity = activity;
  }

  public void log() {
    System.out.println(activity.toString());
  }
}

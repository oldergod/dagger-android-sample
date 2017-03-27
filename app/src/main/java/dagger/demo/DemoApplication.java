package dagger.demo;

import android.app.Activity;
import android.app.Application;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasDispatchingActivityInjector;
import javax.inject.Inject;

/**
 * Created by gak on 9/25/14.
 */
public class DemoApplication extends Application implements HasDispatchingActivityInjector {
  @Inject DispatchingAndroidInjector<Activity> dispatchingActivityInjector;

  @Override public void onCreate() {
    super.onCreate();

    DaggerDemoApplicationComponent.builder()
        .applicationModule(new ApplicationModule(this))
        .build()
        .injectApplication(this);
  }

  @Override public DispatchingAndroidInjector<Activity> activityInjector() {
    return dispatchingActivityInjector;
  }
}

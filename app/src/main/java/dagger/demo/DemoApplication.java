package dagger.demo;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import javax.inject.Inject;

public class DemoApplication extends DaggerApplication {
  @Inject Foo foo;

  @Override protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
    return DaggerDemoApplicationComponent.builder().application(this).build();
  }

  public Foo getFoo() {
    return foo;
  }
}

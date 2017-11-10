package dagger.demo;

import android.app.Application;
import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

/**
 * Created by gak on 9/25/14.
 */
@Component(modules = {
    ApplicationModule.class, //
    AndroidInjectionModule.class, //
    DemoActivityModule.class, //
    Demo2ActivityModule.class, //
}) interface DemoApplicationComponent extends AndroidInjector<DaggerApplication> {

  @Component.Builder interface Builder {
    @BindsInstance DemoApplicationComponent.Builder application(Application application);

    DemoApplicationComponent build();
  }
}

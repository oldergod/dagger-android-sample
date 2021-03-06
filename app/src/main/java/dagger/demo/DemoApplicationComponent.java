package dagger.demo;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by gak on 9/25/14.
 */
@Component(modules = {
    ApplicationModule.class, //
    AndroidInjectionModule.class, //
    DemoActivityModule.class, //
    Demo2ActivityModule.class, //
}) interface DemoApplicationComponent {
  DemoApplication injectApplication(DemoApplication application);
}

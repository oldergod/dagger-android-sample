package dagger.demo;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by benoit-quenaudon on 3/27/17.
 */
@Module(subcomponents = DemoActivitySubcomponent.class) public abstract class DemoActivityModule {
  @Binds @IntoMap @ActivityKey(DemoActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindDemoActivityInjectorFactory(
      DemoActivitySubcomponent.Builder builder);

  @Binds abstract Activity bindActivity(DemoActivity demoActivity);
}

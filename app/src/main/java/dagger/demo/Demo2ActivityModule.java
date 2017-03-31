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
@Module(subcomponents = Demo2ActivitySubcomponent.class) public abstract class Demo2ActivityModule {
  @Binds @IntoMap @ActivityKey(Demo2Activity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindDemo2ActivityInjectorFactory(
      Demo2ActivitySubcomponent.Builder builder);
}

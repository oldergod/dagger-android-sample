package dagger.demo;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;

/**
 * Created by benoit-quenaudon on 3/27/17.
 */
@Module public abstract class Demo2ActivityInnerModule {
  @Binds abstract Activity bindActivity(Demo2Activity demoActivity);
}

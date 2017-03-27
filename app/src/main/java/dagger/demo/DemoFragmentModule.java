package dagger.demo;

import android.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.FragmentKey;
import dagger.multibindings.IntoMap;

/**
 * Created by benoit-quenaudon on 3/27/17.
 */
@Module(subcomponents = DemoFragmentSubcomponent.class) public abstract class DemoFragmentModule {
  @Binds @IntoMap @FragmentKey(DemoFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindDemoFragmentInjectorFactory(
      DemoFragmentSubcomponent.Builder builder);
}

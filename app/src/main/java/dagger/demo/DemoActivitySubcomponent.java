package dagger.demo;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by benoit-quenaudon on 3/27/17.
 */
@Subcomponent(modules = {
    DemoFragmentModule.class,
    DemoActivityModule.class, //
}) public interface DemoActivitySubcomponent extends AndroidInjector<DemoActivity> {
  @Subcomponent.Builder abstract class Builder extends AndroidInjector.Builder<DemoActivity> {
  }
}
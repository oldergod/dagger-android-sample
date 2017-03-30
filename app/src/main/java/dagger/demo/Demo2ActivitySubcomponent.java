package dagger.demo;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by benoit-quenaudon on 3/27/17.
 */
@Subcomponent(modules = {
    Demo2ActivityModule.class, //
}) public interface Demo2ActivitySubcomponent extends AndroidInjector<Demo2Activity> {
  @Subcomponent.Builder abstract class Builder extends AndroidInjector.Builder<Demo2Activity> {
  }
}
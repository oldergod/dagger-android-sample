package dagger.demo;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by benoit-quenaudon on 3/27/17.
 */
@Module public abstract class Demo2ActivityModule {

  @ContributesAndroidInjector(modules = {
      Demo2ActivityInnerModule.class
  }) abstract Demo2Activity contributeYourActivityInjector();
}

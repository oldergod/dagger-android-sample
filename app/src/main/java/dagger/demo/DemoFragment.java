package dagger.demo;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import dagger.android.AndroidInjection;
import dagger.android.DaggerFragment;

/**
 * A placeholder fragment containing a simple view.
 */
public class DemoFragment extends DaggerFragment {
  @Override public void onAttach(Context context) {
    super.onAttach(context);
  }

  @Override public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_demo, container, false);
  }
}

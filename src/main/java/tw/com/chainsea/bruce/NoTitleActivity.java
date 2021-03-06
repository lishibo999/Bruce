package tw.com.chainsea.bruce;

import android.support.v4.app.Fragment;
import android.view.Window;

import tw.com.chainsea.bruce.base.SingleFragmentActivity;

/**
 * NoTitleActivity
 * Created by 90Chris on 2014/12/18.
 */
public abstract class NoTitleActivity extends SingleFragmentActivity {
    public abstract Fragment addFragment();

    @Override
    public Fragment createFragment() {
        return addFragment();
    }

    @Override
    public void onActivityCreate() {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.bruce_activity_base);
    }
}

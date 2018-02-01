package softwaretech.umang.sassignment3;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by UMANG on 31-01-2018.
 */

public class MyFragmentAdapter extends FragmentPagerAdapter {


    ArrayList<Fragment> fragments = new ArrayList<>();

    ArrayList<String> tabtitles = new ArrayList<>();


    public  void AddFragment(Fragment fname, String title){

        fragments.add(fname);
        tabtitles.add(title);

    }


    public MyFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabtitles.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}

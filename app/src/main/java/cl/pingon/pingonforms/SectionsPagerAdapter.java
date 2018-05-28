package cl.pingon.pingonforms;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return TowerCraneFragment.newInstance();
            case 1:
                return PlatformsFragment.newInstance();
            case 2:
                return ForkliftFragment.newInstance();
            case 3:
                return ElevatorFragment.newInstance();
            default:
                return TowerCraneFragment.newInstance();
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Grúa Torre";
            case 1:
                return "Plataformas";
            case 2:
                return "Montacargas";
            case 3:
                return "Elevadores";
        }
        return super.getPageTitle(position);
    }
}

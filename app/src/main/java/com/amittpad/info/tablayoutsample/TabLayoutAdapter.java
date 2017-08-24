package com.amittpad.info.tablayoutsample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by pc31 on 24-08-2017.
 */

public class TabLayoutAdapter extends FragmentStatePagerAdapter {

        public TabLayoutAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    BestOfferFragment bof_obj = new BestOfferFragment();
                    return bof_obj;
                case 1:
                    FullTalkTimeFragment ftf_obj = new FullTalkTimeFragment();
                    return ftf_obj;
                case 2:
                    ThreeGDataFragment tdf_obj = new ThreeGDataFragment();
                    return tdf_obj;
                case 3:
                    TwoGDataFragment tdgf_obj = new TwoGDataFragment();
                    return tdgf_obj;
                case 4:
                    MoreOfferFragment mo_obj = new MoreOfferFragment();
                    return mo_obj;
                default:
                    return null;
            }
        }
        @Override
        public int getCount() {
            return 5;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Best Offer";
                case 1:
                    return "Full Talktime";
                case 2:
                    return "3G/4G Data";
                case 3:
                    return "2G Data";
                case 4:
                    return "More Offer";
                default:
                    return null;
            }

        }
}

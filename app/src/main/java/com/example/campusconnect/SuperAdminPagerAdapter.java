package com.example.campusconnect;



import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class SuperAdminPagerAdapter extends FragmentStateAdapter {

    public SuperAdminPagerAdapter(@NonNull SuperAdminActivity activity) {
        super(activity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new CreateDepartmentFragment();
            case 1:
                return new ApproveUserFragment(); // Placeholder for additional tab
            default:
                return new CreateDepartmentFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2; // Update this number when adding more tabs
    }
}

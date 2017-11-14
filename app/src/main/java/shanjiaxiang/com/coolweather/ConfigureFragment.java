package shanjiaxiang.com.coolweather;

import android.app.Activity;
import android.app.LoaderManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.FloatRange;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shanjiaxiang on 2017/11/14.
 */

public class ConfigureFragment extends Fragment {
    private ListView listView;
    private ArrayAdapter<String> adapter;
    private List<String> listData =  new ArrayList<>();
    private String nowCity;
    private String selectedCity = "当前选择城市：";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.configure,container,false);
        listView = (ListView)view.findViewById(R.id.configure_list_view);
        setSelectedCity(getActivity());
        adapter = new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,listData);
        listView.setAdapter(adapter);
        return view;
    }

    private void setSelectedCity(Activity activity){
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(activity);
        nowCity = prefs.getString("selectedCity",null);
        listData.add(selectedCity+nowCity);
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                if (i == 1){
                replaceFragment(new ChooseAreaFragment());
                Log.d("...........", "onItemClick: ");
//                }
            }
        });
    }
    public void replaceFragment(Fragment fragment){
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.frame_layout,fragment);
        transaction.commit();
    }
}

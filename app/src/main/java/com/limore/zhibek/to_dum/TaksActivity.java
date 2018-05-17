package com.limore.zhibek.to_dum;

import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v4.app.FragmentManager;

import com.limore.zhibek.to_dum.Model.Task;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class TaksActivity extends AppCompatActivity {

    @BindView(R.id.tasksRv)
    RecyclerView tasksRv;



    @OnClick(R.id.addTaskBtn)
    void addTasksBtn(FloatingActionButton addTaskBtn){

        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.addTaskFragmentComtainer);

        if(fragment == null){
            fragment = new CreateTaskFragment();
            fragmentManager.beginTransaction()
                    .add(R.id.addTaskFragmentComtainer, fragment)
                    .commit();
        }

    }


    private static List<Task> tasks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taks);

        tasks = new ArrayList<>();
    }
}

package com.nazycodes.yogaui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.Resources;
import android.os.Bundle;

import com.nazycodes.yogaui.adapters.ExerciseRecyclerAdapter;
import com.nazycodes.yogaui.models.Exercise;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ExerciseRecyclerAdapter exerciseRecyclerAdapter;
    private List<Exercise> exerciseList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerView = findViewById(R.id.rl_items);
        exerciseList = new ArrayList<>();

        loadExerciseData();
    }

    @Override
    protected void onStart() {
        super.onStart();
        loadUI();
    }

    private void loadExerciseData(){
        Resources resources = getResources();
        Exercise exercise1 = new Exercise(
                "Easy",
                "The tradition begun by Krishnamacharya survives at the Krishnamacharya Yoga Mandiram.",
                resources.getDrawable(R.drawable.yoga1));

        Exercise exercise2 = new Exercise(
                "Medium",
                "The tradition begun by Krishnamacharya survives at the Krishnamacharya Yoga Mandiram.",
                resources.getDrawable(R.drawable.yoga2));

        Exercise exercise3 = new Exercise(
                "Hard",
                "The tradition begun by Krishnamacharya survives at the Krishnamacharya Yoga Mandiram.",
                resources.getDrawable(R.drawable.yoga3));

        Exercise exercise4 = new Exercise(
                "Very Hard",
                "The tradition begun by Krishnamacharya survives at the Krishnamacharya Yoga Mandiram.",
                resources.getDrawable(R.drawable.yoga4));

        Exercise exercise5 = new Exercise(
                "Impossible",
                "The tradition begun by Krishnamacharya survives at the Krishnamacharya Yoga Mandiram.",
                resources.getDrawable(R.drawable.yoga1));

        exerciseList.add(exercise1);
        exerciseList.add(exercise2);
        exerciseList.add(exercise3);
        exerciseList.add(exercise4);
        exerciseList.add(exercise5);
    }

    public void loadUI(){
        exerciseRecyclerAdapter = new ExerciseRecyclerAdapter(exerciseList);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(exerciseRecyclerAdapter);
    }
}
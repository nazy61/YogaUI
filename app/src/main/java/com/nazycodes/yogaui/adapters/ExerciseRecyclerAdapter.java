package com.nazycodes.yogaui.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nazycodes.yogaui.R;
import com.nazycodes.yogaui.models.Exercise;

import java.util.List;

public class ExerciseRecyclerAdapter extends RecyclerView.Adapter<ExerciseRecyclerAdapter.MyViewHolder> {
    final List<Exercise> exerciseList;

    public ExerciseRecyclerAdapter(List<Exercise> exerciseList) {
        this.exerciseList = exerciseList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.items_list, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Exercise data = exerciseList.get(position);
        holder.title.setText(data.getTitle());
        holder.description.setText(data.getDescription());
        holder.imageView.setImageDrawable(data.getImageDrawable());
    }

    @Override
    public int getItemCount() {
        return exerciseList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView title, description;
        private ImageView imageView;

        public MyViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.name);
            description = itemView.findViewById(R.id.body);
            imageView = itemView.findViewById(R.id.image);
        }
    }
}

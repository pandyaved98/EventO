package com.example.evento.Coordinator.Home;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.evento.Coordinator.AddEvent;
import com.example.evento.Coordinator.CoordinatorMain;
import com.example.evento.Coordinator.EventDetail;
import com.example.evento.R;

import java.util.ArrayList;
import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;

import static androidx.core.content.ContextCompat.startActivity;


public class EventAdapter extends RecyclerView.Adapter<EventAdapter.ViewHolder> {

    private final LayoutInflater inflater;
    Context mContext;

    private Random randomGenerator =new Random();
    private ArrayList<Integer> imagelist = new ArrayList<>();

    public EventAdapter(Context context) {
        mContext = context;
        inflater = LayoutInflater.from(context);

        imagelist.add(R.drawable.card_bg_1);
        imagelist.add(R.drawable.card_bg_2);
        imagelist.add(R.drawable.card_bg);
        imagelist.add(R.drawable.card_bg_4);
        imagelist.add(R.drawable.card_bg_5);
        imagelist.add(R.drawable.card_bg_6);
        imagelist.add(R.drawable.card_bg_7);


    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.single_event, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        int index = randomGenerator.nextInt(imagelist.size());

        holder.backImage.setImageResource(imagelist.get(index));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, EventDetail.class);
                mContext.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {

        return 10;

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.back_image)
        ImageView backImage;
        @BindView(R.id.textView3)
        TextView textView3;
        @BindView(R.id.textView4)
        TextView textView4;
        @BindView(R.id.imageView2)
        ImageView imageView2;
        @BindView(R.id.textView5)
        TextView textView5;
        @BindView(R.id.textView6)
        TextView textView6;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            backImage = itemView.findViewById(R.id.back_image);
            ButterKnife.bind(this,itemView);

        }
    }
}

package com.inspirationhub;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class myadapter extends FirebaseRecyclerAdapter <model,myadapter.myviewholder>{

    Context context;
    ArrayList<model> arrDemo;
    private int lastPosition=-1;





    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public myadapter(@NonNull FirebaseRecyclerOptions<model> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull model model) {

        holder.name.setText(model.getName());
        holder.profes.setText(model.getProfes());
        holder.role.setText(model.getRole());
        Glide.with(holder.img.getContext()).load(model.getPurl()).into(holder.img);
//        setAnimation(holder.itemView,getItemViewType(position));
  }




    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row1,parent,false);
        return new myviewholder(view);
    }

    class myviewholder extends RecyclerView.ViewHolder{

        CircleImageView img;
        TextView name,profes,role;

        public myviewholder(@NonNull View itemView) {
            super(itemView);

            img=itemView.findViewById(R.id.cirImg1);
            name=itemView.findViewById(R.id.txtName1);
            profes=itemView.findViewById(R.id.txtprofession1);
            role=itemView.findViewById(R.id.txtrole1);
        }

    }

    private void setAnimation(View viewToAnimate,int position){


            Animation slidein = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
            viewToAnimate.startAnimation(slidein);

        }

}

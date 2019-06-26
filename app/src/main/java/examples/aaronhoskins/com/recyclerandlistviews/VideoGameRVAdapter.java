package examples.aaronhoskins.com.recyclerandlistviews;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class VideoGameRVAdapter extends RecyclerView.Adapter<VideoGameRVAdapter.ViewHolder> {
    ArrayList<VideoGame> videoGameArrayList;

    public VideoGameRVAdapter(ArrayList<VideoGame> videoGameArrayList) {
        this.videoGameArrayList = videoGameArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.video_game_item, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        VideoGame currentVideoGameBeingRender = videoGameArrayList.get(position);
        holder.tvTitle.setText(currentVideoGameBeingRender.getTitle());
        holder.tvDescription.setText(currentVideoGameBeingRender.getDescription());
        holder.tvGenre.setText(currentVideoGameBeingRender.getGenre());
        holder.tvParentalRating.setText(currentVideoGameBeingRender.getParentalRating());
        //holder.chkMultiplayer.setSelected(currentVideoGameBeingRender.isMultiPlayer());
        holder.chkMultiplayer.setChecked(currentVideoGameBeingRender.isMultiPlayer());
        holder.rtPlayerRating.setRating(currentVideoGameBeingRender.getReviewRating());
    }

    @Override
    public int getItemCount() {
        return videoGameArrayList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle;
        TextView tvDescription;
        TextView tvParentalRating;
        TextView tvGenre;
        CheckBox chkMultiplayer;
        RatingBar rtPlayerRating;
        ImageView imgVideoGameImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvDescription = itemView.findViewById(R.id.tvDescription);
            tvParentalRating = itemView.findViewById(R.id.tvParentalRating);
            tvGenre = itemView.findViewById(R.id.tvGenre);
            chkMultiplayer = itemView.findViewById(R.id.chkMultiplayer);
            rtPlayerRating = itemView.findViewById(R.id.rtReviewRating);
            imgVideoGameImage = itemView.findViewById(R.id.imgVideoGameImage);
        }
    }
}

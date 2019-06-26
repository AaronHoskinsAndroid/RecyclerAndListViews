package examples.aaronhoskins.com.recyclerandlistviews;

import android.os.Parcel;
import android.os.Parcelable;

public class VideoGame implements Parcelable {
    private String title;
    private String genre;
    private boolean isMultiPlayer;
    private int reviewRating;
    private String parentalRating;
    private String description;
    private String imageUrl;

    public VideoGame() {
    }

    public VideoGame(String title, String genre, boolean isMultiPlayer, int reviewRating, String parentalRating, String description, String imageUrl) {
        this.title = title;
        this.genre = genre;
        this.isMultiPlayer = isMultiPlayer;
        this.reviewRating = reviewRating;
        this.parentalRating = parentalRating;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    protected VideoGame(Parcel in) {
        title = in.readString();
        genre = in.readString();
        isMultiPlayer = in.readByte() != 0;
        reviewRating = in.readInt();
        parentalRating = in.readString();
        description = in.readString();
        imageUrl = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(genre);
        dest.writeByte((byte) (isMultiPlayer ? 1 : 0));
        dest.writeInt(reviewRating);
        dest.writeString(parentalRating);
        dest.writeString(description);
        dest.writeString(imageUrl);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<VideoGame> CREATOR = new Creator<VideoGame>() {
        @Override
        public VideoGame createFromParcel(Parcel in) {
            return new VideoGame(in);
        }

        @Override
        public VideoGame[] newArray(int size) {
            return new VideoGame[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isMultiPlayer() {
        return isMultiPlayer;
    }

    public void setMultiPlayer(boolean multiPlayer) {
        isMultiPlayer = multiPlayer;
    }

    public int getReviewRating() {
        return reviewRating;
    }

    public void setReviewRating(int reviewRating) {
        this.reviewRating = reviewRating;
    }

    public String getParentalRating() {
        return parentalRating;
    }

    public void setParentalRating(String parentalRating) {
        this.parentalRating = parentalRating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}

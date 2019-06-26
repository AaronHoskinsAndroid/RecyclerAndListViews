package examples.aaronhoskins.com.recyclerandlistviews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvVideoGameRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvVideoGameRecyclerView = findViewById(R.id.rvRecyclerView);
        LayoutManager layoutManager = new LinearLayoutManager(this);
        VideoGameRVAdapter videoGameRVAdapter
                = new VideoGameRVAdapter(new DummyGameDatabaseHelper().getAllGames());
        rvVideoGameRecyclerView.setLayoutManager(layoutManager);
        rvVideoGameRecyclerView.setAdapter(videoGameRVAdapter);
    }
}

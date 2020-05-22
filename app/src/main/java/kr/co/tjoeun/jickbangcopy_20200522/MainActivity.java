package kr.co.tjoeun.jickbangcopy_20200522;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import kr.co.tjoeun.jickbangcopy_20200522.adapters.RoomAdapter;
import kr.co.tjoeun.jickbangcopy_20200522.databinding.ActivityMainBinding;
import kr.co.tjoeun.jickbangcopy_20200522.datas.Room;

public class MainActivity extends BaseActivity {

    ActivityMainBinding binding;

    List<Room> rooms = new ArrayList<>();
    RoomAdapter mRoomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {
        addRooms();

        mRoomAdapter = new RoomAdapter(mContext, R.layout.room_list_item, rooms);
        binding.roomListView.setAdapter(mRoomAdapter);

    }

    void addRooms() {
        rooms.add(new Room(7500, "은평구 불광동", 4, "불광동의 흔한 집입니다."));
        rooms.add(new Room(28500, "마포구 서교동", 2, "신혼부부의 보금자리 서교동 ..."));
        rooms.add(new Room(5500, "은평구 갈현동", 0, "갈현동 반지하 집입니다."));
        rooms.add(new Room(3500, "은평구 응암동", -1, "응암동 지하1층 집입니다."));
        rooms.add(new Room(58500, "은평구 신사동", 5, "신사동 5층 집입니다."));

    }
}

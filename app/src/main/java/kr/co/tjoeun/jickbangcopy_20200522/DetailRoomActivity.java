package kr.co.tjoeun.jickbangcopy_20200522;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;

import kr.co.tjoeun.jickbangcopy_20200522.databinding.ActivityDetailRoomBinding;
import kr.co.tjoeun.jickbangcopy_20200522.datas.Room;

public class DetailRoomActivity extends BaseActivity {

    ActivityDetailRoomBinding binding;

//    이 화면에 전체적으로 사용할 방 객체.
    Room mRoom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_detail_room);
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {
        mRoom = (Room) getIntent().getSerializableExtra("room");

        binding.priceTxt.setText(mRoom.getFormattedPrice());
        binding.descTxt.setText(mRoom.getDescription());
        binding.addressTxt.setText(mRoom.getAddress());
        binding.floorTxt.setText(mRoom.getFormattedFloor());
    }
}












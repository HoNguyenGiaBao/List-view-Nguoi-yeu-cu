package ute.example.listviewunique;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvNyc;
    ArrayList<NguoiYeuCu> arrayNyc;
    NguoiYeuCuAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Mapping();

        adapter = new NguoiYeuCuAdapter(this, R.layout.row_nguoi_yeu_cu, arrayNyc);
        lvNyc.setAdapter(adapter);
    }

    private void Mapping() {
        lvNyc = (ListView) findViewById(R.id.lvNyc);
        arrayNyc = new ArrayList<>();

        arrayNyc.add(new NguoiYeuCu("Thanh",22,"4 month",R.drawable.nyc1));
        arrayNyc.add(new NguoiYeuCu("Nhi", 19,"2 month",R.drawable.nyc2));
        arrayNyc.add(new NguoiYeuCu("Nguyệt", 18,"3 week",R.drawable.nyc3));
        arrayNyc.add(new NguoiYeuCu("Trang",20,"1 year",R.drawable.nyc4));
        arrayNyc.add(new NguoiYeuCu("An", 19,"3 month",R.drawable.nyc5));
        arrayNyc.add(new NguoiYeuCu("Anh", 21,"1 month",R.drawable.nyc6));
    }
}
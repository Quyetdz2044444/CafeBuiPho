package quyettvph35419.fpoly.cafebuipho;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.List;

import quyettvph35419.fpoly.cafebuipho.Adapter.GioHangAdapter;
import quyettvph35419.fpoly.cafebuipho.Dao.GioHangDao;
import quyettvph35419.fpoly.cafebuipho.Model.GioHang;


public class QLGioHang extends AppCompatActivity {
    private Toolbar tlbargiohang;
    private RecyclerView rclgiohang;
    private GioHangDao gioHangDao;
    private List<GioHang> gioHangList;
    private GioHangAdapter gioHangAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qlgio_hang);

        tlbargiohang = findViewById(R.id.toolbargiohang);
        setSupportActionBar(tlbargiohang);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tlbargiohang.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        rclgiohang = findViewById(R.id.rclViewGioHang);
        gioHangDao = new GioHangDao(this);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rclgiohang.setLayoutManager(layoutManager);

        gioHangList = gioHangDao.getAll();
        gioHangAdapter = new GioHangAdapter(gioHangList, this);
        rclgiohang.setAdapter(gioHangAdapter);

    }
}
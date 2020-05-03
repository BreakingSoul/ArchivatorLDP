package com.vlasovs.archivator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView fileList;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<FileItem> list = new ArrayList<>();

        list.add(new FileItem("Vojna I Mir", "Last Modified: 13/02/2020", "Size: 13 KB"));
        list.add(new FileItem("Gore Ot Uma", "Last Modified: 11/02/2020", "Size: 17 KB"));
        list.add(new FileItem("Evgeny Onegin", "Last Modified: 27/01/2020", "Size: 14 KB"));
        list.add(new FileItem("Kapitanskaja Dochka", "Last Modified: 15/01/2020", "Size: 11 KB"));
        list.add(new FileItem("Mertvie Dushi", "Last Modified: 11/12/2019", "Size: 10 KB"));
        list.add(new FileItem("Nedorosl", "Last Modified: 12/02/2020", "Size: 9 KB"));
        list.add(new FileItem("Ubik", "Last Modified: 12/01/2018", "Size: 11 KB"));
        list.add(new FileItem("Ruslan I Ludmila", "Last Modified: 07/04/2018", "Size: 13 KB"));
        list.add(new FileItem("Zolotaya Ribka", "Last Modified: 09/09/2019", "Size: 2 KB"));
        list.add(new FileItem("Dujmovochka", "Last Modified: 13/02/2020", "Size: 2 KB"));
        list.add(new FileItem("Cheat Codes", "Last Modified: 13/05/2017", "Size: 1 KB"));

        fileList = findViewById(R.id.fileList);
        fileList.setHasFixedSize(true);
        manager = new LinearLayoutManager(this);
        adapter = new FileAdapter(list);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(fileList.getContext(),
                DividerItemDecoration.VERTICAL);
        fileList.addItemDecoration(dividerItemDecoration);

        fileList.setLayoutManager(manager);
        fileList.setAdapter(adapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.toolbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.search:
                return true;
            case R.id.filter:
                return true;
            case R.id.purchase:
                Intent intent = new Intent(this, RegistrationActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

package jp.peroli.appcommpat22_1;

import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A custom adapter to use with the RecyclerView widget.
 */
public class SortedListAdapter extends RecyclerView.Adapter<SortedListAdapter.FruitsItem> {

    private ArrayList<String> items;

    @Override
    public FruitsItem onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_item, viewGroup, false);

        return new FruitsItem(view);
    }

    @Override
    public void onBindViewHolder(FruitsItem itemViewHolder, int position) {

        itemViewHolder.nameView.setText("");
        //Here you can fill your row view
    }

    @Override
    public int getItemCount() {

        return 0;
    }

    public class FruitsItem extends RecyclerView.ViewHolder {

        private AppCompatTextView nameView;

        public FruitsItem(View itemView) {
            super(itemView);

            nameView = (AppCompatTextView)itemView.findViewById(R.id.name);

        }
    }
}

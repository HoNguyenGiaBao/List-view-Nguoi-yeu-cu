package ute.example.listviewunique;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class NguoiYeuCuAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<NguoiYeuCu> nguoiYeuCuList;

    public NguoiYeuCuAdapter(Context context, int layout, List<NguoiYeuCu> nguoiYeuCuList) {
        this.context = context;
        this.layout = layout;
        this.nguoiYeuCuList = nguoiYeuCuList;
    }

    @Override
    public int getCount() {
        return nguoiYeuCuList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
        ImageView imageView;
        TextView txtName, txtAge, txtTime2gether;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;

        if(view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder = new ViewHolder();
            //Mapping
            holder.txtName = (TextView) view.findViewById(R.id.textViewName);
            holder.txtAge = (TextView) view.findViewById(R.id.textViewAge);
            holder.txtTime2gether = (TextView) view.findViewById(R.id.textViewTimeTogether);
            holder.imageView = (ImageView) view.findViewById(R.id.imageviewImage);

            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }


        // Assign

        NguoiYeuCu nguoiYeuCu = nguoiYeuCuList.get(i);

        holder.txtName.setText(nguoiYeuCu.getName());
        holder.txtAge.setText(nguoiYeuCu.getAge());
        holder.txtTime2gether.setText((nguoiYeuCu.getTimeTogether()));
        holder.imageView.setImageResource(nguoiYeuCu.getImg());

        return view;
    }
}

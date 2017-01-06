package krlighting.com.namecard;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v4.view.PagerAdapter;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by Asus on 6/1/2017.
 */
public class CustomAdapter extends PagerAdapter {

    private int[] templates = {R.drawable.template1,R.drawable.template2,R.drawable.template3,R.drawable.template4};
    private LayoutInflater inflater;
    private Context ctx;


    public CustomAdapter(Context ctx) {
        super();
        this.ctx = ctx;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == (LinearLayout) object);
    }

    @Override
    public int getCount() {
        return templates.length;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

//        Layout gallaery = (Layout)fin
        inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.swip, container, false);
        ImageView imageView = (ImageView)view.findViewById(R.id.test_img);
        imageView.setImageResource(templates[position]);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ctx, );
                ctx.startActivity(intent);
            }
        });
        container.addView(view);

        return view;
    }

}

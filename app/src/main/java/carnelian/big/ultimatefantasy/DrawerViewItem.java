package carnelian.big.ultimatefantasy;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by mitch on 11/4/15.
 */
public class DrawerViewItem extends RelativeLayout {
    private TextView primaryText;

    public DrawerViewItem(Context context) {
        super(context);
        sharedConstructor();
    }

    public DrawerViewItem(Context context, AttributeSet attrs) {
        super(context, attrs);
        sharedConstructor();
    }

    public DrawerViewItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        sharedConstructor();
    }


    public void sharedConstructor(){
        LayoutInflater.from(getContext()).inflate(R.layout.drawer_item,null);
        primaryText = (TextView)findViewById(R.id.primary_text);
        setup();
    }

    private void setup(){
        primaryText.setText("First Item");

    }


}

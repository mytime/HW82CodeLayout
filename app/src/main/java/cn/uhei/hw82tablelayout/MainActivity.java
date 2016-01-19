package cn.uhei.hw82tablelayout;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;

/**
 * 利用代码生成布局文件
 */
public class MainActivity extends AppCompatActivity {

    private LinearLayout root, subRoot;
    private Button btnCell;
    private int temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        //根布局
        root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        setContentView(root);

        // width height 属性
        //width：match_parent, height：wrap_content
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        //width：wrap_content, height：wrap_content
        LinearLayout.LayoutParams lp2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.MATCH_PARENT);

        //权重
        lp.weight = 1;
        lp2.weight = 1;

        //边距
        lp2.leftMargin = 3;
        lp2.rightMargin = 3;
        lp2.topMargin = 3;
        lp2.bottomMargin = 3;

        temp = 0;
        for (int j = 0; j < 5; j++) {

            //子布局
            subRoot = new LinearLayout(this);
            subRoot.setOrientation(LinearLayout.HORIZONTAL);

            for (int i = 0; i < 4; i++) {
                temp++;

                //初始按钮 设定属性
                btnCell = new Button(this);
                btnCell.setText(temp+"");
                btnCell.setTextColor(Color.WHITE);
                btnCell.setTextSize(18);
                btnCell.setBackgroundColor(Color.RED);
                subRoot.addView(btnCell, lp2);
            }
            root.addView(subRoot, lp);

        }


    }
}

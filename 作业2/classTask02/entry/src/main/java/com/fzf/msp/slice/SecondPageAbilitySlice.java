package com.fzf.msp.slice;

import com.fzf.msp.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.DirectionalLayout;
import ohos.agp.components.Text;
import ohos.agp.utils.Color;

public class SecondPageAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        //super.setUIContent(ResourceTable.Layout_ability_second_page);

        //1.创建布局对象
        DirectionalLayout dl=new DirectionalLayout(this);

        //2.创建文本对象
        Text t=new Text(this);
        //设置内容
        t.setText("樊芝飞 201941882225");
        //设置文字大小
        t.setTextSize(100);
        //设置文字颜色
        t.setTextColor(Color.BLUE);

        //3.把文本添加到布局当中
        dl.addComponent(t);

        //4.把布局添加到子界面当中
        super.setUIContent(dl);
    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}

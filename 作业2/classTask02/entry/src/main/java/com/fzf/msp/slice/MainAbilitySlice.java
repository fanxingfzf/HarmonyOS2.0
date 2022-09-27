package com.fzf.msp.slice;

import com.fzf.msp.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.aafwk.content.Operation;
import ohos.agp.components.Button;
import ohos.agp.components.Component;


public class MainAbilitySlice extends AbilitySlice implements Component.ClickedListener {
    Button btn;

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);

        //1.找到按钮id
        btn = (Button) findComponentById(ResourceTable.Id_btn1);

        //2.给按钮添加一个点击事件
        //如果没有添加点击事件，那么用鼠标点击按钮之后是没有任何反应的，
        //如果添加，即可跳转到对应代码
        //给btn添加点击事件，点击btn这个按钮，就会执行onClick方法
        btn.setClickedListener(this);
    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }

    @Override
    public void onClick(Component component) {
        //点击按钮只要要执行的代码
        //跳转到第二个页面
        if(component==btn){
            //只要点击了btn按钮，才进行跳转

            //跳转到哪个页面中（意图）
            Intent intent=new Intent();
            //包含了要跳转的页面信息
            Operation operation=new Intent.OperationBuilder()
                    .withDeviceId("")//要跳转的设备，如果传递的是一个没有内容的字符串，表示跳转到本机
                    .withBundleName("com.fzf.msp")//我要跳转到哪个应用上面，小括号里面可以写包名
                    .withAbilityName("com.fzf.msp.SecondPageAbility")//要跳转的Ability
                    .build();//表示将上面的三个信息进行打包

            //把打包之后的operation设置到意图当中
            intent.setOperation(operation);
            //跳转页面
            startAbility(intent);
        }
    }
}

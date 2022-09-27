package com.fzf.msp;

import com.fzf.msp.slice.SecondPageAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class SecondPageAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(SecondPageAbilitySlice.class.getName());
    }
}

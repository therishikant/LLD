package com.rishi.lld.factory.abstractFactory;

import com.rishi.models.button.Button;
import com.rishi.models.button.LightButton;
import com.rishi.models.checkbox.Checkbox;
import com.rishi.models.checkbox.LightCheckbox;

public class LightUIFactory implements UIAbstractFactory{
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LightCheckbox();
    }
}

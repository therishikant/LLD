package com.rishi.lld.factory.abstractFactory;

import com.rishi.models.button.Button;
import com.rishi.models.button.DarkButton;
import com.rishi.models.checkbox.Checkbox;
import com.rishi.models.checkbox.DarkCheckbox;

public class DarkUIFactory implements UIAbstractFactory{
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new DarkCheckbox();
    }
}

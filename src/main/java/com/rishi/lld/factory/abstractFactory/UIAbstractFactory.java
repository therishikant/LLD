package com.rishi.lld.factory.abstractFactory;

import com.rishi.models.button.Button;
import com.rishi.models.checkbox.Checkbox;

public interface UIAbstractFactory {
    Button createButton();
    Checkbox createCheckbox();
}

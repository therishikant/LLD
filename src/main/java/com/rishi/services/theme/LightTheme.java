package com.rishi.services.theme;

import com.rishi.models.button.Button;
import com.rishi.models.button.LightButton;
import com.rishi.models.checkbox.Checkbox;
import com.rishi.models.checkbox.DarkCheckbox;

public class LightTheme implements Theme {
    @Override
    public Button creteButton() {
        return new LightButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new DarkCheckbox();
    }
}

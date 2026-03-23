package com.rishi.services.theme;

import com.rishi.models.button.Button;
import com.rishi.models.button.DarkButton;
import com.rishi.models.checkbox.Checkbox;
import com.rishi.models.checkbox.DarkCheckbox;

public class DarkTheme implements Theme{
    @Override
    public Button creteButton() {
        return new DarkButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new DarkCheckbox();
    }
}

package com.rishi.services.theme;

import com.rishi.models.button.Button;
import com.rishi.models.checkbox.Checkbox;

public interface Theme {
    Button creteButton();

    Checkbox createCheckbox();
}

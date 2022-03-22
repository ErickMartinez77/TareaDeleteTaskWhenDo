package activities;

import controles.Button;
import org.openqa.selenium.By;

public class OptionsScreen {
    public Button deleteButton = new Button(By.xpath("//android.widget.TextView[@text='Delete Completed']"));
}

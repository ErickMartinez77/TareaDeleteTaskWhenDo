package activities;

import controles.Button;
import org.openqa.selenium.By;

public class ConfirmDeleteScreen {
    public Button confirmDeleteButton = new Button(By.xpath("//android.widget.Button[@text='DELETE']"));
}

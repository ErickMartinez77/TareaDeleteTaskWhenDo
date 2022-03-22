package activities;

import controles.Button;
import controles.Label;
import controles.TextBox;
import org.openqa.selenium.By;

public class CreateTaskScreen {
    public TextBox titleTextBox = new TextBox(By.xpath("//android.widget.EditText[@text='Title']"));
    public Button saveButton = new Button(By.xpath("//android.widget.TextView[@content-desc='Save']"));
    public Label firstTasktLabel = new Label(By.xpath("//android.widget.TextView[@resource-id='com.vrproductiveapps.whendo:id/home_list_item_text']"));
}

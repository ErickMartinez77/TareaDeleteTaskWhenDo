package activities;

import controles.Button;
import controles.Label;
import org.openqa.selenium.By;

public class MainActivity {
    public Button addButton = new Button(By.xpath("//android.widget.ImageButton[@resource-id='com.vrproductiveapps.whendo:id/fab']"));
    public Button checkBoxButton = new Button(By.xpath("//android.widget.ImageButton[@content-desc='Mark Done']"));
    public Button optionsButton = new Button(By.xpath("//android.widget.ImageView[@content-desc=\"\u200E\u200F\u200E\u200E\u200E\u200E\u200E\u200F\u200E\u200F\u200F\u200F\u200E\u200E\u200E\u200E\u200E\u200E\u200F\u200E\u200E\u200F\u200E\u200E\u200E\u200E\u200F\u200F\u200F\u200F\u200F\u200E\u200F\u200F\u200F\u200F\u200F\u200F\u200F\u200F\u200E\u200F\u200F\u200E\u200F\u200F\u200F\u200F\u200E\u200F\u200E\u200E\u200E\u200F\u200F\u200E\u200F\u200F\u200F\u200E\u200F\u200F\u200E\u200F\u200E\u200F\u200E\u200E\u200E\u200E\u200E\u200E\u200F\u200E\u200E\u200E\u200F\u200F\u200F\u200E\u200F\u200F\u200F\u200F\u200E\u200E\u200E\u200F\u200E\u200E\u200E\u200F\u200E\u200F\u200EMore options\u200E\u200F\u200E\u200E\u200F\u200E\"]"));
    public Label noTasksLabel = new Label(By.xpath("//android.widget.TextView[@text='No tasks added']"));
}

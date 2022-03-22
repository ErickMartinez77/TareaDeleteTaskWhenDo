package testClean;

import activities.ConfirmDeleteScreen;
import activities.CreateTaskScreen;
import activities.MainActivity;
import activities.OptionsScreen;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;

public class WhenDoTest {
    CreateTaskScreen createTaskScreen = new CreateTaskScreen();
    MainActivity mainActivity = new MainActivity();
    OptionsScreen optionsScreen = new OptionsScreen();
    ConfirmDeleteScreen confirmDeleteScreen = new ConfirmDeleteScreen();
    String task = "Tarea 1";

    @Test
    public void sumaTest() throws MalformedURLException {
        mainActivity.addButton.click();
        createTaskScreen.titleTextBox.setValue(task);
        createTaskScreen.saveButton.click();

        mainActivity.checkBoxButton.click();
        mainActivity.optionsButton.click();

        optionsScreen.deleteButton.click();

        confirmDeleteScreen.confirmDeleteButton.click();

        Assertions.assertTrue(mainActivity.noTasksLabel.isControlDisplayed(), "ERROR");
    }
}

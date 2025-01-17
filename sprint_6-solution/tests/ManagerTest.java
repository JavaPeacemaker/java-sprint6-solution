import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import service.Managers;

@DisplayName("Менеджеры")
public class ManagerTest {

    @Test
    @DisplayName("Программа должна корректно собираться")
    public void shouldCorrectlyAssembleProgramm() {
        Assertions.assertNotNull(Managers.getDefault());
        Assertions.assertNotNull(Managers.getDefaultHistory());
    }
}
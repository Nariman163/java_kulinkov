import model.GroupData;
import org.junit.jupiter.api.Test;

public class GroupCreationTests extends TestBase {


    @Test
    public void canCreateGroup() {
        openGroupsPage();
        createGroup(new GroupData("group_name_1", "group_header_1", "group_footer_1"));
    }


    @Test
    public void canCreateGroupWithEmptyName() {
        openGroupsPage();
        createGroup(new GroupData("", "", ""));
    }
}

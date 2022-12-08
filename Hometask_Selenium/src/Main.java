public class Main {
    public static void main(String[] args){
        AddUserTest addUserTest = new AddUserTest();
        addUserTest.LoginToPage();
        addUserTest.GoToUsersPage();
        addUserTest.AddUser();
        addUserTest.SearchUser();
        addUserTest.DeleteUser();
        addUserTest.SearchUser();
        addUserTest.CloseWindow();
    }
}

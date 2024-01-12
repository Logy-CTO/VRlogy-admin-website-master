package dbTest;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnectionTest {

    private static final String DRIVER = "";
    private static final String URL = "";
    private static final String USER = "";
    private static final String PASSWORD = "";

    @Test
    public void testConnection() throws Exception {
        Class.forName(DRIVER);
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            // 연결이 성공하면 콘솔에 연결 정보를 출력
            System.out.println(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


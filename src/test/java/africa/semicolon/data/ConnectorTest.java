package africa.semicolon.data;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ConnectorTest {
    @Test
    void testDbConnection() throws SQLException {
        Connection connection = Connector.connect();
        assertNotNull(connection);
        connection.close();
    }
}

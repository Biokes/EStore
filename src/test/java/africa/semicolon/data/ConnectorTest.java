package africa.semicolon.data;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ConnectorTest {
    @Test
    void testDbConnection() {
        try(Connection connection = Connector.connect()){
            assertNotNull(connection);
        }catch (SQLException err){
            err.printStackTrace();

        }
    }
}

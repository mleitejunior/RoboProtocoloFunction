package roboprotocolo.function;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class ValidaProtocoloFunctionTest {
    @Test
    public void validaProtocoloOkTest() {
        ValidaProtocoloFunction validaProtocoloFunction = new ValidaProtocoloFunction();

        APIGatewayProxyResponseEvent result = validaProtocoloFunction.handleRequest(null, null);
        assertEquals(200, result.getStatusCode().intValue());
        String content = result.getBody();
        assertNotNull(content);
        assertEquals("OK", content);
    }
}
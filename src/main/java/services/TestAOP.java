package services;


import com.azure.core.http.rest.Response;
import com.azure.data.appconfiguration.ConfigurationClient;
import com.azure.data.appconfiguration.ConfigurationClientBuilder;
import com.azure.data.appconfiguration.credentials.ConfigurationClientCredentials;
import com.azure.data.appconfiguration.models.ConfigurationSetting;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;


@EnableAspectJAutoProxy

public class TestAOP
{
    @SuppressWarnings("resource")
    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeManager manager = context.getBean(EmployeeManager.class);

        manager.getEmployeeById(1);
        manager.createEmployee(new EmployeeDTO());

        String connectionString = "your-connection-string";

        ConfigurationClient client = ConfigurationClient.builder()
                .credentials(new ConfigurationClientCredentials(connectionString))
                .build();
        client.setSetting("my-cosmos-db-key", "keyString");
        Response<ConfigurationSetting> response =  client.getSetting("my-cosmos-db-key");
        System.out.println("settings key " + response.value());

    }
}
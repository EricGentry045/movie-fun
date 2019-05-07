package moviefun;

import org.junit.Test;
import org.superbiz.moviefun.DatabaseServiceCredentials;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class DatabaseServiceCredentialsTest {
    @Test
    public void test() {
        DatabaseServiceCredentials creds = new DatabaseServiceCredentials("{" +
                "\"p.mysql\": [\n" +
                "        {\n" +
                "          \"name\": \"parakeet-mysql\",\n" +
                "          \"instance_name\": \"parakeet-mysql\",\n" +
                "          \"binding_name\": null,\n" +
                "          \"credentials\": {\n" +
                "            \"hostname\": \"bird.bosh\",\n" +
                "            \"jdbcUrl\": \"jdbc:mysql://bird.bosh:3306/service_instance_db?user=ddd123&password=pwpwp\",\n" +
                "            \"name\": \"service_instance_db\",\n" +
                "            \"password\": \"pwpwp\",\n" +
                "            \"port\": 3306,\n" +
                "            \"username\": \"d6b24b6b453e42f2b87103f13af1331d\"\n" +
                "          },\n" +
                "          \"syslog_drain_url\": null,\n" +
                "          \"volume_mounts\": [],\n" +
                "          \"label\": \"p.mysql\",\n" +
                "          \"provider\": null,\n" +
                "          \"plan\": \"db-small\",\n" +
                "          \"tags\": [\n" +
                "            \"mysql\"\n" +
                "          ]\n" +
                "        }\n" +
                "      ]\n" +
                "    }\n" +
                "  }" +
                "}");

        assertThat(creds.jdbcUrl("parakeet-mysql"),
                equalTo("jdbc:mysql://bird.bosh:3306/service_instance_db?user=ddd123&password=pwpwp"));
    }
}

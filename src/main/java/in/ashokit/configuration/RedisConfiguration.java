package in.ashokit.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

@Configuration
public class RedisConfiguration {

	@Bean
	public JedisConnectionFactory jedisConnectionFactory() {

		RedisStandaloneConfiguration serverConfig = 
				new RedisStandaloneConfiguration("redis-15757.c301.ap-south-1-1.ec2.redns.redis-cloud.com", 15757);

		serverConfig.setUsername("default");
		serverConfig.setPassword("01UEU9BrmaX8EceCIazYQHo8pFWLg9cS");

		JedisClientConfiguration clientConfig = JedisClientConfiguration.builder().build();

		return new JedisConnectionFactory(serverConfig, clientConfig);
	}
}

package ma.enset.gatway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}


	//@Bean
//	RouteLocator routeLocator(RouteLocatorBuilder builder) {
//		return builder.routes()
//				.route("r1", r -> r.path("/customers/**").uri("http://localhost:8080/"))
//				.route("r2",r -> r.path("/products/**").uri("http://localhost:8081/"))
//				.build();
//	}

	/* enable the application to route HTTP requests dynamically to services as they are
	 *registered in the discovery service. This is particularly beneficial in microservices
	 *architectures where services can scale up or down and where new services can be added
	 *without modifying the gateway configuration.
	 */
	@Bean
	DiscoveryClientRouteDefinitionLocator definitionLocator(ReactiveDiscoveryClient rdc, DiscoveryLocatorProperties properties) {
		return new DiscoveryClientRouteDefinitionLocator(rdc, properties);
	}

}

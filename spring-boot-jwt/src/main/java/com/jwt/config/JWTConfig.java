package com.jwt.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.provider.token.TokenEnhancerChain;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

@Configuration
@EnableAuthorizationServer
@EnableWebSecurity
public class JWTConfig extends AuthorizationServerConfigurerAdapter {

	@Autowired
	private UserDetailsService userDetailsService;

	@Autowired(required=true)
	private AuthenticationManager authenticationManager;

	@Value("${varun.oauth.tokenTimeout:3600}")
	private int expiration;

	@Autowired
	private JwtAccessTokenConverter accessTokenConverter;

	@Autowired
	private TokenStore tokenStore;

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public TokenStore tokenStore() {
		return new JwtTokenStore(accessTokenConverter());
	}

	@Bean
	public JwtAccessTokenConverter accessTokenConverter() {

		JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
		converter.setSigningKey("jwtDemo123");
		return converter;
	}

	public void configure(AuthorizationServerEndpointsConfigurer configurer) throws Exception {
		TokenEnhancerChain enhancerChain = new TokenEnhancerChain();
		List list = Arrays.asList(accessTokenConverter);
		enhancerChain.setTokenEnhancers(list);
		configurer.tokenStore(tokenStore).accessTokenConverter(accessTokenConverter).tokenEnhancer(enhancerChain);

		configurer.authenticationManager(authenticationManager);
		configurer.userDetailsService(userDetailsService);

	}

	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		clients.inMemory().withClient("ram").secret("secret").accessTokenValiditySeconds(expiration)
				.scopes("read", "write").authorizedGrantTypes("password", "refrash_token").resourceIds("resource");
	}

}

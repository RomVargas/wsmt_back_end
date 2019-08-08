package com.nglobal.status.management.security;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import com.nglobal.status.management.persistence.entity.AppUser;
import com.nglobal.status.management.repository.AppUserRepository;


@Component
public class SessionToken implements TokenEnhancer{
	
	@Autowired
	private AppUserRepository userRepo;

	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		//Info posting on Token
		AppUser user = userRepo.findByUsername(authentication.getName());
		Map<String,Object> info = new HashMap<>();
		info.put("name", user.getName());
		info.put("last_name", user.getLastName());
		info.put("email", user.getEmail());
		info.put("enabled", user.getEnabled());
		info.put("id", user.getId());
		info.put("iduser", user.getIdUser());
		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(info);
		return accessToken;
	}

}

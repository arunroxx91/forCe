package com.app.forceup.model;

import java.util.Map;

import com.google.gson.Gson;
import com.google.inject.Inject;

import io.hypertrack.model.*;

public class ForceupUser {
	
	private Gson _gson;
	
	@Inject
	public ForceupUser(Gson gson) {
		 _gson = gson;
	}
	
	@SuppressWarnings("unchecked")
	public Map<String, Object> returnUserAsMap(final User user) {
		return (Map<String, Object>) _gson.fromJson(user.getProperties(), Object.class);
	}
	
}

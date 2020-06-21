package com.geekreboot.localdeal.api;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/version")
public class VersionApi {
	private String version;

	private String date;

	@GetMapping
	public String getVersion() {
		if (date != null) {
			return version + " (" + date + ")";
		} else {
			return version;
		}
	}

	@Inject
	public void setVersion(@Value("${build.version:'undefined'}") String version) {
		this.version = version;
	}

	@Inject
	public void setDate(@Value("${build.date:null}") String date) {
		this.date = date;
	}
}
package com.cic.config;

import org.springframework.security.web.RedirectStrategy;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class NoRedirectStrategy implements RedirectStrategy {

	/**
	 * 
	 * @author ntmduyen
	 * @datetime Sep 17, 2020 - 1:22:54 AM
	 * @param request
	 * @param response
	 * @param url
	 * @throws IOException
	 */
	@Override
	public void sendRedirect(final HttpServletRequest request, final HttpServletResponse response, final String url)
			throws IOException {
		// No redirect is required with pure REST
	}
}
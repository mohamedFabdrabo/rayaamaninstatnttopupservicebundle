package com.raya.aman.topupservice.rest;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

@Provider
public class CORSFilter implements ContainerResponseFilter {

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.ws.rs.container.ContainerResponseFilter#filter(javax.ws.rs.
	 * container.ContainerRequestContext,
	 * javax.ws.rs.container.ContainerResponseContext)
	 */
	public void filter(ContainerRequestContext requestContext,
			ContainerResponseContext responseContext) throws IOException {

		String origin = requestContext.getHeaderString("Origin");

		// responseContext.getHeaders().add("Access-Control-Allow-Origin",
		// "http://localhost:40410");
		responseContext.getHeaders().add("Access-Control-Allow-Origin", origin);
		responseContext
				.getHeaders()
				.add("Access-Control-Allow-Headers",
						"Access-Control-*, Origin, X-Requested-With, Content-Type, Accept, Authorization");
		responseContext.getHeaders().add("Access-Control-Allow-Credentials",
				"false");
		responseContext.getHeaders().add("Access-Control-Allow-Methods",
				"GET, POST, PUT, DELETE, OPTIONS, HEAD");
		responseContext.getHeaders().add("Access-Control-Max-Age", "1209600");
		responseContext
				.getHeaders()
				.add("Access-Control-Expose-Headers",
						"Access-Control-*, Origin, X-Requested-With, Content-Type, Accept, Authorization");
	}
}
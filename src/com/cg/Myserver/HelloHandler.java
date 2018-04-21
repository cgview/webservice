package com.cg.Myserver;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;


public class HelloHandler extends AbstractHandler{

	
	final String greeting;
    final String body;

    public HelloHandler()
    {
        this("Hello World");
    }

    public HelloHandler( String greeting )
    {
        this(greeting, null);
    }

    public HelloHandler( String greeting, String body )
    {
        this.greeting = greeting;
        this.body = body;
    }

	@Override
	public void handle(String target, Request baseRequest, HttpServletRequest arg2,
			HttpServletResponse resp) throws IOException, ServletException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html; charset=utf-8");
		resp.setStatus(HttpServletResponse.SC_OK);

        PrintWriter out = resp.getWriter();

        out.println("<h1>" + "chengang" + "</h1>");
        if (body != null)
        {
            out.println(body);
        }

        baseRequest.setHandled(true);

	}


}

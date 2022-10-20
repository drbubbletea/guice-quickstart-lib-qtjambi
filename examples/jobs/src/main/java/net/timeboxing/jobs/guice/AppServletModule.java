package net.timeboxing.jobs.guice;

import com.google.inject.Scopes;
import com.google.inject.servlet.ServletModule;
import org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher;

public class AppServletModule extends ServletModule {

    @Override
    protected void configureServlets() {
        bind(AppRestServlet.class).in(Scopes.SINGLETON);
        serve("/rest/*").with(AppRestServlet.class);
    }

}
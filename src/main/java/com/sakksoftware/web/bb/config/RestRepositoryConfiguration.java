package com.sakksoftware.web.bb.config;

import com.sakksoftware.web.bb.model.Address;
import com.sakksoftware.web.bb.model.Business;
import com.sakksoftware.web.bb.model.Category;
import com.sakksoftware.web.bb.model.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@Configuration
public class RestRepositoryConfiguration extends RepositoryRestConfigurerAdapter {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {

        // For retrieving ids for entities (default queries do no return ids)
        config.exposeIdsFor(Address.class);
        config.exposeIdsFor(Business.class);
        config.exposeIdsFor(Category.class);
        config.exposeIdsFor(User.class);
    }
}

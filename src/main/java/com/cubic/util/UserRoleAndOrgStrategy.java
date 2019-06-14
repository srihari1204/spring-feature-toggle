package com.cubic.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.togglz.core.activation.Parameter;
import org.togglz.core.activation.ParameterBuilder;
import org.togglz.core.repository.FeatureState;
import org.togglz.core.spi.ActivationStrategy;
import org.togglz.core.user.FeatureUser;
import org.togglz.core.util.Strings;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;
import java.util.logging.Logger;

public class UserRoleAndOrgStrategy  implements ActivationStrategy {
    private static final Logger LOG = Logger.getLogger(UserRoleAndOrgStrategy.class.getName());
    @Autowired
    HttpServletRequest httpServletRequest;
    String org="cubic";
    public static final String ID = "user-role-org";
    public static final String NAME = "Users by role org";

    public static final String PARAM_ROLES_NAME = "roles";
    public static final String PARAM_ROLES_LABEL = "Roles";
    public static final String PARAM_ROLES_DESC = "A list of user roles for which the feature is active.";

    public static final String USER_ATTRIBUTE_ROLES = "roles";

    @Override
    public  String getId() {
        return ID;
    }

    @Override
    public  String getName() {
        return NAME;
    }

    @Override
    public  boolean isActive(FeatureState state, FeatureUser user) {
        LOG.info("hello");
        //for(String name:httpServletRequest.getParameterNames())

        if (user != null) {

            Collection<String> userRoles =
                    (Collection<String>) user.getAttribute(USER_ATTRIBUTE_ROLES);

            if (userRoles != null) {

                String rolesAsString = state.getParameter(PARAM_ROLES_NAME);

                if (Strings.isNotBlank(rolesAsString)) {

                    List<String> roles = Strings.splitAndTrim(rolesAsString, ",");

                    for (String authority : roles) {
                        if (userRoles.contains(authority)) {
                            LOG.info("msg"+System.getProperty("org"));
                            if(org.equals("cubic"))
                                return true;

                        }
                    }
                }
            }
        }

        return false;
    }

    @Override
    public  Parameter[] getParameters() {
        return new Parameter[] {
                ParameterBuilder.create(PARAM_ROLES_NAME)
                        .label(PARAM_ROLES_LABEL)
                        .description(PARAM_ROLES_DESC)
                        .largeText()
        };
    }
}
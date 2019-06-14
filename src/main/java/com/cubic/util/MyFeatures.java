package com.cubic.util;

import org.togglz.core.Feature;
import org.togglz.core.activation.UserRoleActivationStrategy;
import org.togglz.core.annotation.ActivationParameter;
import org.togglz.core.annotation.DefaultActivationStrategy;
import org.togglz.core.annotation.EnabledByDefault;
import org.togglz.core.annotation.Label;
import org.togglz.core.context.FeatureContext;

public enum MyFeatures implements Feature {
    @Label("Employee Management Feature")
    @EnabledByDefault
    @DefaultActivationStrategy(id = UserRoleActivationStrategy.ID,
            parameters = {
                    @ActivationParameter(
                            name = UserRoleActivationStrategy.PARAM_ROLES_NAME,
                            value = "ROLE_user,admin")})

    EMPLOYEE_ROLE_FEATURE,

    @Label("Employee Management Feature1")
    @EnabledByDefault
    @DefaultActivationStrategy(id = UserRoleAndOrgStrategy.ID,
            parameters = {
                    @ActivationParameter(
                            name = UserRoleAndOrgStrategy.PARAM_ROLES_NAME,
                            value = "ROLE_user,admin")})

    EMPLOYEE_ROLE_ORG_FEATURE;


    public boolean isActive() {
        return FeatureContext.getFeatureManager().isActive(this);
    }
}
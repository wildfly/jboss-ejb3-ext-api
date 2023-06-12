package org.jboss.ejb3.extapi.testcompilation;

import java.util.concurrent.TimeUnit;

import org.jboss.ejb3.annotation.DeliveryActive;
import org.jboss.ejb3.annotation.DeliveryGroup;
import org.jboss.ejb3.annotation.DeliveryGroups;
import org.jboss.ejb3.annotation.ResourceAdapter;
import org.jboss.ejb3.annotation.RunAsPrincipal;
import org.jboss.ejb3.annotation.SecurityDomain;
import org.jboss.ejb3.annotation.TransactionTimeout;

/**
 * A Test Object for compilation only to ensure that the 
 * External API does not contain any dependencies
 * outside of itself or the JavaEE EJB API.
 * 
 * May also be used as a brief reference/guide for JBoss
 * Extensions and their use.
 * 
 * @author <a href="mailto:andrew.rubinger@jboss.org">ALR</a>
 * @version $Revision: $
 */
@ResourceAdapter("resourceAdaptor")
@RunAsPrincipal("principalName")
@SecurityDomain(value="securityDomain",unauthenticatedPrincipal="unAuthPrincipal")
@TransactionTimeout(value = 0, unit = TimeUnit.MINUTES)
@DeliveryActive(false)
@DeliveryGroups({@DeliveryGroup("group1"), @DeliveryGroup("group2")})
public class TestCompilationBean
{
}

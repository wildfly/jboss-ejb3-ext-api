/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2023 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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

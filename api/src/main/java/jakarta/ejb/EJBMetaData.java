/*
 * Copyright (c) 1997, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package jakarta.ejb;

/**
 * The EJBMetaData interface allows a client to obtain the enterprise bean's
 * meta-data information.
 *
 * <p> The meta-data is intended for development tools used for
 * building applications that use deployed enterprise beans, and for clients
 * using a scripting language to access the enterprise bean.
 *
 * <p> Note that the EJBMetaData is not a remote interface. The class that
 * implements this interface (this class is typically generated by container
 * tools) must be serializable, and must be a valid RMI/IDL value type.
 *
 * @since EJB 1.0
 */
public interface EJBMetaData {
    /**
     * Obtain the remote home interface of the enterprise bean.
     *
     * @return the remote home interface of the enterprise bean.
     */
    EJBHome getEJBHome();

    /**
     * Obtain the class object for the enterprise bean's remote home interface.
     * @return the class object for the enterprise bean's remote home interface.
     */
    Class getHomeInterfaceClass();

    /**
     * Obtain the class object for the enterprise bean's remote interface.
     *
     * @return the class object for the enterprise bean's remote interface.
     */
    Class getRemoteInterfaceClass();

    /**
     * Obtain the class object for the enterprise bean's primary key class.
     *
     * @return the class object for the enterprise bean's primary key class.
     */
    Class getPrimaryKeyClass();

    /**
     * Test if the enterprise bean's type is "session".
     *
     * @return True if the type of the enterprise bean is session bean.
     */
    boolean isSession();

    /**
     * Test if the enterprise bean's type is "stateless session".
     *
     * @return True if the type of the enterprise Bean is stateless
     *     session.
     *
     * @since EJB 1.1
     */
    boolean isStatelessSession();
}

/**********************************************************************
Copyright (c) 2000, 2002 IBM Corp. and others.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Common Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/cpl-v10.html

Contributors:
    IBM Corporation - Initial implementation
**********************************************************************/

package org.eclipse.ui.texteditor;
 
/**
 * Extension interface for <code>IElementStateListener</code>.
 * It adds
 * <ul>
 * <li> state validation notification
 * <li>a notion of session, i.e. a notification about an upcoming element change and error handling.
 * </ul>
 * @since 2.0
 */ 
public interface IElementStateListenerExtension {
	
	/**
	 * Notifies that the state validation of the given element has changed.
	 *
	 * @param element the element
	 * @param isStateValidated the flag indicating whether state validation is done
	 */
	void elementStateValidationChanged(Object element, boolean isStateValidated);
	
	/**
	 * Notifies that the given element is currently being changed. This method may
	 * be sent from a non-ui thread.
	 * 
	 * @param element the element
	 */
	void elementStateChanging(Object element);
	
	/**
	 * Notifies that changing the given element has failed.
	 * 
	 * @param element the element
	 */
	void elementStateChangeFailed(Object element);
}

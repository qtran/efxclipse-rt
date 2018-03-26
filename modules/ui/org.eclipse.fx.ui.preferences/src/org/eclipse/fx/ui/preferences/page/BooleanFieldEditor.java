/*******************************************************************************
 * Copyright (c) 2018 BestSolution.at, EclipseSource and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API
 *     Camille Letavernier <cletavernier@eclipsesource.com> - initial implementation
 *******************************************************************************/
package org.eclipse.fx.ui.preferences.page;

import javafx.scene.control.CheckBox;

/**
 * <p>A Field editor for boolean preferences.</p>
 */
public class BooleanFieldEditor extends FieldEditor {

	private final CheckBox checkBox;

	public BooleanFieldEditor(String name, String label) {
		super(name, label);
		this.checkBox = new CheckBox();
		getChildren().add(checkBox);
	}
	
	public BooleanFieldEditor(String name) {
		this(name, null);		
	}

	@Override
	void load() {
		this.checkBox.setSelected(getMemento().get(getName(), false));
	}

	@Override
	void persist() {
		getMemento().put(getName(), this.checkBox.isSelected());
	}

}

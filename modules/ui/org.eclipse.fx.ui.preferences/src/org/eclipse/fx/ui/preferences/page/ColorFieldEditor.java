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

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Color;

/**
 * <p>A Field editor for color preferences.</p>
 */
public class ColorFieldEditor extends FieldEditor {

	private final ColorPicker colorPicker;
	
	public ColorFieldEditor(String name, String label) {
		super(name, label);
		this.colorPicker = new ColorPicker();
		getChildren().add(colorPicker);
	}
	
	public ColorFieldEditor(String name) {
		this(name, null);
	}

	@Override
	void load() {
		String color = getMemento().get(getName(), "0,0,0,1");
		this.colorPicker.setValue(parseColor(color));
	}
	
	//Parses a JavaFX Color from a String. The String is compatible with
	//JFace preference format for RGB, with an optional alpha value.
	//The color must be in the format 255,255,255 or 255,255,255,1.0
	private Color parseColor(String color) {
		StringTokenizer tokenizer = new StringTokenizer(color, ",");
		try {
			String red = tokenizer.nextToken().trim();
			String green = tokenizer.nextToken().trim();
			String blue = tokenizer.nextToken().trim();
			//Alpha is optional, for backwards compatibility with JFace
			String alpha = tokenizer.hasMoreTokens() ? tokenizer.nextToken() : "1.0";
			
			try {
				int r = Integer.parseInt(red);
				int g = Integer.parseInt(green);
				int b = Integer.parseInt(blue);
				double a = Double.parseDouble(alpha);
				return new Color(toDouble(r), toDouble(g), toDouble(b), a); //Will throw if the values are out of range
			} catch (Exception ex) {
				ex.printStackTrace(); //TODO Log
				return Color.BLACK;
			}
		} catch (IllegalArgumentException e) {
			e.printStackTrace(); //TODO Log
        } catch (NoSuchElementException e) {
        	e.printStackTrace(); //TODO Log
        }
		return null;
	}

	private static double toDouble(int intColor) {
		return intColor/255.;
	}

	@Override
	void persist() {
		Color color = this.colorPicker.getValue();
		getMemento().put(getName(), toString(color));
	}
	
	private static String toString(Color color) {
		return String.format("%s,%s,%s,%s", toInt(color.getRed()), toInt(color.getGreen()), toInt(color.getBlue()), color.getOpacity());
	}

	private static int toInt(double color) {
		return (int)Math.round(color*255);
	}
	
	

}

package com.rubenlaguna.eclipse.javacompare;

import java.util.Map;

import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.ToolFactory;
import org.eclipse.jdt.core.formatter.CodeFormatter;
import org.eclipse.text.edits.TextEdit;

public class Test {
public static void main(String[] args) {
	final String contentsString = "hello world";
	final Map options = JavaCore.getOptions();

	final CodeFormatter codeFormatter = ToolFactory
			.createCodeFormatter(options);
	final TextEdit tmpOutputFromFormatter = codeFormatter.format(
			CodeFormatter.K_COMPILATION_UNIT, contentsString, 0,
			contentsString.length(), 0, null);
	System.out.println(tmpOutputFromFormatter);
}
}

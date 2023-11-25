package com.todo.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.todo.pages.TodoPage;
import com.todo.utils.Setup;

public class AddTodoTest extends Setup{

	public AddTodoTest() throws IOException {
		super();
	}
	
	TodoPage todoPage;
	
	@Test(priority = 1)
	public void iCanAddTodo() throws IOException {
		
		todoPage = new TodoPage();
		boolean inputField = todoPage.isElementDisplayed(TodoPage.inputText);
		Assert.assertTrue(inputField);
		todoPage.fillTodo(prop.getProperty("todo1"));
		String elementTodo = todoPage.checkElementContains(TodoPage.textTodo1);
		Assert.assertTrue(elementTodo.contains(prop.getProperty("todo1")));
		boolean checkbox = todoPage.isCheckBoxSelected(TodoPage.checkbox);
		Assert.assertTrue(checkbox);
	}

}

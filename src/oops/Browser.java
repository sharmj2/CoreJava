package oops;

public abstract class Browser {

	public abstract void displayBrowser();
	public abstract void openBrowser();
	public void closeBrowser() {
		System.out.println("Closing browser is not abstract method");
	}
}

package day5.multiLevelInheritance.TextEditor;

public class NotePad {
	
	 protected String content;

	    public NotePad() {
	        this.content = "";
	    }

	    public void write(String text) {
	        content += text;
	    }

	    public void displayContent() {
	        System.out.println("Notepad Content: " + content);
	    }

}

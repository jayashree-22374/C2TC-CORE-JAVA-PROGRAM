package day5.multiLevelInheritance.TextEditor;

public class WordPad extends NotePad {
	 private boolean isBold;

	    public Wordpad() {
	        super();
	        this.isBold = false;
	    }

	    public void formatText(boolean bold) {
	        if (bold) {
	            content = "<b>" + content + "</b>";
	        }
	        isBold = bold;
	    }

	    public boolean isBold() {
	        return isBold;
	    }

}

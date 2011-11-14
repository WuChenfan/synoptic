package synopticgwt.client.invariants;

import java.io.Serializable;

import com.google.gwt.core.client.JavaScriptObject;

/** 
 * Java wrapper for a Raphael canvas
 * @author timjv
 *
 */
public class Paper implements Serializable {

	private static final long serialVersionUID = 1L;
	/** Raphael paper object */
    private JavaScriptObject paper;
    /** width of canvas */
    private int width;
    /** height of canvas */
    private int height;
    /** Identifier for tag that canvas is injected into */
    private String canvasID;

    /**
     * Creates a new Raphael canvas
     * @param width Width of canvas
     * @param height Height of canvas
     * @param canvasID Identifier for tag that canvas is injected into
     */
    public Paper(int width, int height, String canvasID) {
        this.width = width;
        this.height = height;
        this.canvasID = canvasID;
        paper = constructPaper(width, height, canvasID);
    }

    /**
     * 
     * @return Unwrapped canvas object
     */
    public JavaScriptObject getPaper() {
        return this.paper;
    }
    
    /**
     * 
     * @return Width of canvas
     */
    public int getWidth() {
        return this.width;
    }

    /**
     * 
     * @return Height of canvas
     */
    public int getHeight() {
        return this.height;
    }

    /**
     * 
     * @return Canvas's tag
     */
    public String getCanvasID() {
        return this.canvasID;
    }

    /**
     * Creates a new Raphael canvas object
     * 
     * @param width of the canvas
     * @param height height of the canvas
     * @param canvasId ID for document element canvas is injected into
     * @return Unwrapped canvas object
     */
    private native JavaScriptObject constructPaper(int width, int height, 
            String canvasId) /*-{
		var paper = $wnd.Raphael($doc.getElementById(canvasId), width, height);
        return paper;
    }-*/;
    
}
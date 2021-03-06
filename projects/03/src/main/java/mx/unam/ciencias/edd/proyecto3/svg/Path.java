package mx.unam.ciencias.edd.proyecto3.svg;


/**
 * Path Element
 * 
 * https://developer.mozilla.org/en-US/docs/Web/SVG/Element/path
 */
public class Path extends Element {

    public String d;

    // Initialize element with tag and self closing options
    public Path() { super("path", true); }

    public Path(String d) {
        super("path", true);
        this.setProperty("d", d);
        this.setProperty("fill", "none");
        this.setProperty("stroke", "#000000");
        this.setProperty("stroke-width", "1px");
    }

}